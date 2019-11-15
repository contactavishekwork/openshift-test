package com.openshiftexample.poc.dao;

import com.openshiftexample.poc.entity.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

public interface ParamDao extends JpaRepository<Param, Integer> {

    @Query("SELECT p.PRM_NA FROM tprm p")
    public List<Param> getParams();
}
