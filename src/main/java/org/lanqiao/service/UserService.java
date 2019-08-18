package org.lanqiao.service;

import org.lanqiao.entity.User;

import java.util.List;

public interface UserService {
    User selectByPrimaryKey(Integer userId);
    public boolean checkUser(User user);
}
