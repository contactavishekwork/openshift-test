package com.openshiftexample.poc.service.impl;

import com.openshiftexample.poc.daos.ParameterDAO;
import com.openshiftexample.poc.models.Parameter;
import com.openshiftexample.poc.models.response.ParameterResponse;
import com.openshiftexample.poc.service.ParameterService;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Service
@Log4j2
public class ParameterServiceImpl implements ParameterService {

    private ParameterDAO parameterDAO;

    @Autowired
    public ParameterServiceImpl(ParameterDAO parameterDAO) {
        this.parameterDAO = parameterDAO;
    }

    @Override
    public ParameterResponse getAllParametersBySystemNumber(@NotNull int parameterSystemNumber) throws Exception{

        if(parameterSystemNumber < 0) {
            log.error("Parameter System Number cannot be less than 0");
            throw new Exception("Parameter System Number cannot be less than 0");
        }

        if(parameterSystemNumber == 0) {
            log.error("Parameter system number cannot 0");
            throw new Exception("Parameter System cannot be 0");
        }

        @SuppressWarnings("unchecked")
        ArrayList<Parameter> parameterList = (ArrayList<Parameter>) parameterDAO.getAllByParameterSystemNumber(parameterSystemNumber);

        if(CollectionUtils.isNotEmpty(parameterList)) {
            log.error("No Parameters found with Parameter System Number: " + parameterSystemNumber);
            return null;
        }

        ParameterResponse response = new ParameterResponse();
        response.setParameterList(parameterList);

        return response;

    }

    @Override
    public ParameterResponse getAllParametersByParameterName(@NotNull String parameterName) throws Exception{
        if(StringUtils.isEmpty(parameterName)) {
            log.error("Parameter Name cannot be empty");
            throw new Exception("Parameter Name cannot be empty");
        }

        ArrayList<Parameter> parameterList = (ArrayList<Parameter>) parameterDAO.getAllByParameterName(parameterName);

        if(CollectionUtils.isEmpty(parameterList)) {
            log.error("No Parameters found with Parameter Name: " + parameterName);
            return null;
        }

        ParameterResponse response = new ParameterResponse();
        response.setParameterList(parameterList);

        return response;
    }
}
