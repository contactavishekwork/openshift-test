package com.openshiftexample.poc.daos.impl;

import com.openshiftexample.poc.daos.ParameterDAO;
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
public abstract class ParameterDAOImpl implements ParameterDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getAllByParameterSystemNumber(@NotNull int parameterSystemNumber) {
        StoredProcedureQuery storedProcedureQuery;
        List resultList;

        try{
            storedProcedureQuery = entityManager.createStoredProcedureQuery("GET_ALL_PARAMETERS")
                    .registerStoredProcedureParameter(0, Integer.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(0, parameterSystemNumber);

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

    @Override
    public Iterable<Parameter> findAll() {
        return null;
    }
}
