package com.openshiftexample.poc.service;

import com.openshiftexample.poc.dao.ParamDao;
import com.openshiftexample.poc.entity.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParamService {

    @Autowired
    ParamDao paramDao;

    public List<Param> getAllParams() { return this.paramDao.findAll();}

    public List<Param> getParam() { return this.paramDao.getParams();}
}
