package com.openshiftexample.poc.controller;

import com.openshiftexample.poc.entity.Group;
import com.openshiftexample.poc.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    GroupService groupService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Group> getAllGroups() {
        return groupService.getAllgroups();
    }

    @RequestMapping(value = "/groupname", method = RequestMethod.GET)
    public List<Group> getGroupName() {return groupService.getGroupName(); }

    @RequestMapping(value = "/addgroup", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public Group addNewGroup(@RequestBody Group user) {
        return this.groupService.addGroup(user);
    }
}
