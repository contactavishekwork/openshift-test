package com.openshiftexample.poc.daos.impl;

import com.openshiftexample.poc.daos.ParameterDAOCustom;
import com.openshiftexample.poc.models.Parameter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
@Log4j2
public class ParameterDAOImpl implements ParameterDAOCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getAllParametersByUserRole(@NotNull int parameterGroupNumber, @NotNull String userApplicationRelationName, @NotNull String recordUserNumber) {
        StoredProcedureQuery storedProcedureQuery;
        List resultList;

        try{
            storedProcedureQuery = entityManager.createStoredProcedureQuery("pkg_get_set_params_ms.prc_get_params_by_role", Parameter.class);
            storedProcedureQuery.registerStoredProcedureParameter("prm_grp_num", Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("user_role", String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("user_number", String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("group_params", void.class, ParameterMode.REF_CURSOR);
            storedProcedureQuery.registerStoredProcedureParameter("json_msg", String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter("prm_grp_num", parameterGroupNumber);
            storedProcedureQuery.setParameter("user_role", userApplicationRelationName);
            storedProcedureQuery.setParameter("user_number", recordUserNumber);

            resultList = storedProcedureQuery.getResultList();

            if(CollectionUtils.isEmpty(resultList)) {
                log.error("No Parameters are found!");
            }

        }catch (Exception ex) {
            log.error(ex.getMessage());
            throw ex;
        }
        return resultList;
    }

    @Override
    public ArrayList<Parameter> getAllByParameterName(String parameterName) {
        StoredProcedureQuery storedProcedureQuery;
        List resultList;

        try{
            storedProcedureQuery = entityManager.createStoredProcedureQuery("GET_PARAMETER_BY_NAME")
                    .registerStoredProcedureParameter(0, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(0, parameterName);

            resultList = storedProcedureQuery.getResultList();

            if(CollectionUtils.isEmpty(resultList)) {
                log.error("No Parameters are found!");
            }
        }catch (Exception ex) {
            log.error("No Parameters like this!");
            throw ex;
        }
        return null;
    }

}
