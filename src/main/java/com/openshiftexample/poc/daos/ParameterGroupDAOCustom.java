package com.openshiftexample.poc.daos;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface ParameterGroupDAOCustom {

    List getAllParameterGroupsByUserRole(@NotNull String userApplicationRelationName, @NotNull String recordUserNumber);

}
