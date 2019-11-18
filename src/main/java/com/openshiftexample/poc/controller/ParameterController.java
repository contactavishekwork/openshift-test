package com.openshiftexample.poc.controller;

import com.openshiftexample.poc.models.response.ParameterResponse;
import com.openshiftexample.poc.service.ParameterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@Controller
@RequestMapping("/api/v1/parameters")
public class ParameterController {

    private ParameterService parameterService;

    public ParameterController(ParameterService parameterService) {
        this.parameterService = parameterService;
    }

    @RequestMapping(path = "/paramNumber/{groupNumber}/{userRole}/{roleNumber}", method = RequestMethod.GET)
    @ResponseBody
    public ParameterResponse getAllParametersByUserRole(@NotNull @PathVariable int groupNumber,
                                                        @NotNull @PathVariable String userRole,
                                                        @NotNull @PathVariable String roleNumber) throws Exception {

        return parameterService.getAllParametersByUserRole(groupNumber, userRole, roleNumber);
    }

    @RequestMapping(path = "/paramName/{paramName}", method = RequestMethod.GET)
    @ResponseBody
    public ParameterResponse getParametersByParameterName(@PathVariable String paramName) throws Exception {

        return parameterService.getAllParametersByParameterName(paramName);
    }

    @RequestMapping(path = "/paramTest", method = RequestMethod.GET)
    @ResponseBody
    public String ParamTest() {
        String x = "Working";
        return x;
    }

}
