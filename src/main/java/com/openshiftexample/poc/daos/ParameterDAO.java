package com.openshiftexample.poc.daos;

import com.openshiftexample.poc.models.Parameter;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.List;

@Repository
public interface ParameterDAO extends CrudRepository<Parameter, String> {

    @Procedure(name = "GetAllParametersByUserRole")
    List getAllParametersByUserRole(@NotNull @Param("parameterGroupNumber") int parameterGroupNumber, @NotNull @Param("userApplicationRelationName") String userApplicationRelationName, @NotNull @Param("recordUserNumber") String recordUserNumber);

    List<Parameter> getAllByParameterName(String parameterName);


}
