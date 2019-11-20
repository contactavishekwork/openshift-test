package com.openshiftexample.poc.service;

import com.openshiftexample.poc.models.response.ParameterGroupResponse;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public interface ParameterGroupService {

    ParameterGroupResponse getAllParameterGroupsByUserRole(@NotNull String userApplicationRelationName, @NotNull String recordUserNumber) throws Exception;
}
