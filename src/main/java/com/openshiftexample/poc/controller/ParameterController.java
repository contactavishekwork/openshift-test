package com.openshiftexample.poc.controller;

import com.openshiftexample.poc.models.response.ParameterResponse;
import com.openshiftexample.poc.service.ParameterService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/parameters")
public class ParameterController {

    private ParameterService parameterService;

    public ParameterController(ParameterService parameterService) {
        this.parameterService = parameterService;
    }

    @RequestMapping(path = "/paramNumber/{paramNumber}", method = RequestMethod.GET)
    @ResponseBody
    public ParameterResponse getParametersByParameterNumber(@PathVariable int paramNumber) throws Exception {

        return parameterService.getAllParametersBySystemNumber(paramNumber);
    }

    @RequestMapping(path = "/paramName/{paramName}", method = RequestMethod.GET)
    @ResponseBody
    public ParameterResponse getParametersByParameterName(@PathVariable String paramName) throws Exception {

        return parameterService.getAllParametersByParameterName(paramName);
    }
}
