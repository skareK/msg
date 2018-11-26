package com.baizhi.msg.service.impl;

import com.baizhi.msg.dao.UserDao;
import com.baizhi.msg.entity.User;
import com.baizhi.msg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAll(String name) {
        if (name != null) {
            name = "%" + name + "%";
        }
        return userDao.queryAll(name);
    }
}
