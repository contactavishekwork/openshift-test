package com.openshiftexample.poc.service;

import com.openshiftexample.poc.DAO.UserDao;
import com.openshiftexample.poc.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<UserEntity> getAllUsers() {
        return this.userDao.findAll();
    }

    public UserEntity addUser(UserEntity user) {
        return this.userDao.save(user);
    }

}
