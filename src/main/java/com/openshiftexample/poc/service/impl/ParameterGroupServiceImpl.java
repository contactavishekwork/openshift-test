package com.openshiftexample.poc.service.impl;

import com.openshiftexample.poc.daos.ParameterGroupDAO;
import com.openshiftexample.poc.models.ParameterGroup;
import com.openshiftexample.poc.models.response.ParameterGroupResponse;
import com.openshiftexample.poc.service.ParameterGroupService;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Service
@Log4j2
public class ParameterGroupServiceImpl implements ParameterGroupService {

    private ParameterGroupDAO parameterGroupDAO;

    @Autowired
    public ParameterGroupServiceImpl(ParameterGroupDAO parameterGroupDAO) { this.parameterGroupDAO = parameterGroupDAO; }

    @Override
    public ParameterGroupResponse getAllParameterGroupsByUserRole(@NotNull String userApplicationRelationName, @NotNull String recordUserNumber) throws Exception{

        if(StringUtils.isEmpty(recordUserNumber)) {
            log.error ("User Number can not be empty!");
            throw new Exception("User Number can not be empty!");
        }
        if(StringUtils.isEmpty(userApplicationRelationName)){
            log.error("User name can not be empty!");
            throw new Exception("User name can not be empty!");
        }

        @SuppressWarnings("unchecked")
        ArrayList<ParameterGroup> parameterGroupList = (ArrayList<ParameterGroup>) parameterGroupDAO.getAllParameterGroupsByUserRole(userApplicationRelationName, recordUserNumber);

        if(CollectionUtils.isEmpty(parameterGroupList)) {
            log.error("No parameter groups were found for this user" + userApplicationRelationName);
            return null;
        }

        ParameterGroupResponse response = new ParameterGroupResponse();
        response.setParameterGroupList(parameterGroupList);

        return response;


    }
}
