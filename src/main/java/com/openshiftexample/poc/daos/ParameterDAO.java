package com.openshiftexample.poc.daos;

import com.openshiftexample.poc.models.Parameter;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface ParameterDAO extends CrudRepository<Parameter, String>, ParameterDAOCustom {
}
