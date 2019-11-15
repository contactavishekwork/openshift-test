package com.openshiftexample.poc.service;

import com.openshiftexample.poc.dao.GroupDao;
import com.openshiftexample.poc.entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    GroupDao groupDao;

    public List<Group> getAllgroups() {
        return this.groupDao.findAll();
    }

    public List<Group> getGroupName() { return this.groupDao.getGroupName(); }

    public Group addGroup(Group group) {
        return this.groupDao.save(group);
    }

}
