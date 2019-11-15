package com.openshiftexample.poc.controller;


import com.openshiftexample.poc.entity.Param;
import com.openshiftexample.poc.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter")
public class ParamController {

    @Autowired
    ParamService paramService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Param> getAllParams() { return paramService.getAllParams(); }

    @RequestMapping(value = "/parambygroup", method = RequestMethod.GET)
    public List<Param> getParams() { return paramService.getParam(); }

}
