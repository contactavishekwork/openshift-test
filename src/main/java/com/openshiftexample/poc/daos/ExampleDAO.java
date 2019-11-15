package com.openshiftexample.poc.daos;

import com.openshiftexample.poc.models.Example;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleDAO extends CrudRepository<Example, String> {

}
