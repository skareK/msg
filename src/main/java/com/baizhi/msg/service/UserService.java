package com.baizhi.msg.service;

import com.baizhi.msg.entity.User;

import java.util.List;

public interface UserService {
    public List<User> queryAll(String name);
}
