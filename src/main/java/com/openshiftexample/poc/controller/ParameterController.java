package com.openshiftexample.poc.controller;

import com.openshiftexample.poc.models.response.ParameterResponse;
import com.openshiftexample.poc.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/parameters")
public class ParameterController {

    private ParameterService parameterService;

    @Autowired
    public ParameterController(ParameterService parameterService) {
        this.parameterService = parameterService;
    }

    @RequestMapping(path = "/paramNumber/{groupNumber}/{userRole}/{roleNumber}", method = RequestMethod.GET)
    public ParameterResponse getAllParametersByUserRole( @PathVariable int groupNumber,
                                                         @PathVariable String userRole,
                                                         @PathVariable String roleNumber) throws Exception {

        return parameterService.getAllParametersByUserRole(groupNumber, userRole, roleNumber);
    }

    @RequestMapping(path = "/paramName/{paramName}", method = RequestMethod.GET)
    public ParameterResponse getParametersByParameterName(@PathVariable String paramName) throws Exception {

        return parameterService.getAllParametersByParameterName(paramName);
    }


}
