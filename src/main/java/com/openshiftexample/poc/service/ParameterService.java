package com.openshiftexample.poc.service;

import com.openshiftexample.poc.models.response.ParameterResponse;

import javax.validation.constraints.NotNull;

public interface ParameterService {

    ParameterResponse getAllParametersBySystemNumber(@NotNull int parameterSystemNumber) throws Exception;

    ParameterResponse getAllParametersByParameterName(@NotNull String parameterName) throws Exception;
}
