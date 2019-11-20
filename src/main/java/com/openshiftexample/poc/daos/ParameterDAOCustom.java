package com.openshiftexample.poc.daos;

import com.openshiftexample.poc.models.Parameter;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface ParameterDAOCustom {

    List getAllParametersByUserRole(@NotNull int parameterGroupNumber, @NotNull String userApplicationRelationName, @NotNull String recordUserNumber);
    List<Parameter> getAllByParameterName(String parameterName);

}
