package com.rj.service;

import com.rj.entity.User;

import java.util.List;

public interface UserService {

    public void insertUserInfo(User user);

    public List<User> findAll();
}
