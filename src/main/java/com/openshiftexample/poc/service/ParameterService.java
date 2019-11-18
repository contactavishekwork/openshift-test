package com.openshiftexample.poc.service;

import com.openshiftexample.poc.models.response.ParameterResponse;

import javax.validation.constraints.NotNull;

public interface ParameterService {

    ParameterResponse getAllParametersByUserRole(@NotNull int parameterGroupNumber, @NotNull String userApplicationRelationName, @NotNull String recordUserNumber) throws Exception;

    ParameterResponse getAllParametersByParameterName(@NotNull String parameterName) throws Exception;
}
