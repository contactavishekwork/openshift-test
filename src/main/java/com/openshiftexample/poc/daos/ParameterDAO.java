package com.openshiftexample.poc.daos;

import com.openshiftexample.poc.models.Parameter;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface ParameterDAO extends CrudRepository<Parameter, String> {

    @Procedure(name = "GetAllParametersBySystemNumber")
    List getAllByParameterSystemNumber(@NotNull int parameterSystemNumber);

    List<Parameter> getAllByParameterName(String parameterName);


}
