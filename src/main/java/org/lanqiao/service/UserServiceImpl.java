package org.lanqiao.service;

import org.lanqiao.entity.User;
import org.lanqiao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public User selectByPrimaryKey(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean checkUser(User user) {
        List<User> userList = userMapper.checkUser(user.getUserName(),user.getUserPass());
        for ( User user1: userList) {
            System.out.println("用户信息"+user1);

        }
//        int flag = 0;
//        for (User user1:List) {
//            if (user.getUserPass().equals(user1.getUserPass())&&user.getUserName().equals(user1.getUserName())){
//                flag=1;
//            }
//        }
        System.out.print(userList.size());
        if (userList.size()>0){
            return true;
        }
        else{
            return false;
        }
    }
}
