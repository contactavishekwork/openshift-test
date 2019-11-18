package com.openshiftexample.poc.service;

import com.openshiftexample.poc.models.response.ParameterResponse;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public interface ParameterService {

    ParameterResponse getAllParametersByUserRole(@NotNull int parameterGroupNumber, @NotNull String userApplicationRelationName, @NotNull String recordUserNumber) throws Exception;

    ParameterResponse getAllParametersByParameterName(@NotNull String parameterName) throws Exception;

}
