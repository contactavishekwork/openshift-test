package com.openshiftexample.poc.daos;

import com.openshiftexample.poc.models.Parameter;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface ParameterDAO extends CrudRepository<Parameter, String> {

    @Procedure(name = "GetAllParametersByUserRole")
    List getAllParametersByUserRole(@NotNull int parameterGroupNumber, @NotNull String userApplicationRelationName, @NotNull String recordUserNumber);

    List<Parameter> getAllByParameterName(String parameterName);


}
