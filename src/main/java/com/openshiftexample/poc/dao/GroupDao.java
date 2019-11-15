package com.openshiftexample.poc.dao;

import com.openshiftexample.poc.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface GroupDao extends JpaRepository<Group, Integer> {

    @Query(value = "SELECT PRM_GRP_NA FROM (SELECT * FROM TPRMGRP)", nativeQuery = true)
    List<Group> getGroupName();
}
