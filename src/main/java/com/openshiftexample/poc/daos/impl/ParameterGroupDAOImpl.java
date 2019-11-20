package com.openshiftexample.poc.daos.impl;

import com.openshiftexample.poc.daos.ParameterGroupDAOCustom;
import com.openshiftexample.poc.models.ParameterGroup;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.List;

@Repository
@Transactional
@Log4j2
public class ParameterGroupDAOImpl implements ParameterGroupDAOCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getAllParameterGroupsByUserRole(@NotNull String userApplicationRelationName, @NotNull String recordUserNumber) {
        StoredProcedureQuery storedProcedureQuery;
        List resultList;

        try {
            storedProcedureQuery = entityManager.createStoredProcedureQuery("pkg_get_set_params_ms.prc_get_param_groups_by_role", ParameterGroup.class)
                    .registerStoredProcedureParameter("user_role", String.class, ParameterMode.IN)
                    .registerStoredProcedureParameter("user_number", String.class, ParameterMode.IN)
                    .registerStoredProcedureParameter("param_groups", void.class, ParameterMode.REF_CURSOR)
                    .registerStoredProcedureParameter("json_msg", String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter("user_role", userApplicationRelationName);
            storedProcedureQuery.setParameter("user_number", recordUserNumber);

            resultList = storedProcedureQuery.getResultList();

            if(CollectionUtils.isEmpty(resultList)) {
                log.error("No parameter groups are found!");
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
            throw ex;
        }
        return resultList;
    }

}
