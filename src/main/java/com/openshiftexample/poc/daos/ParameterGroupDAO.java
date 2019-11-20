package com.openshiftexample.poc.daos;

import com.openshiftexample.poc.models.ParameterGroup;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ParameterGroupDAO extends CrudRepository<ParameterGroup, String>, ParameterGroupDAOCustom {
}
