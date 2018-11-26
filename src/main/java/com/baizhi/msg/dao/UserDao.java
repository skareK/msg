package com.baizhi.msg.dao;

import com.baizhi.msg.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public List<User> queryAll(@Param("name") String name);
}
