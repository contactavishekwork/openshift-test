package com.openshiftexample.poc.controller;

import com.openshiftexample.poc.models.response.ParameterGroupResponse;
import com.openshiftexample.poc.service.ParameterGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/parameterGroups")
public class ParameterGroupController {

    private ParameterGroupService parameterGroupService;

    @Autowired
    public ParameterGroupController(ParameterGroupService parameterGroupService) { this.parameterGroupService = parameterGroupService; }

    @RequestMapping(path = "/paramGroup/{userRole}/{userNumber}", method = RequestMethod.GET)
    public ParameterGroupResponse getAllParameterGroupsByUserRole( @PathVariable String userRole,
                                                                   @PathVariable String userNumber ) throws Exception {

        return parameterGroupService.getAllParameterGroupsByUserRole(userRole, userNumber);
    }

}
