package org.lanqiao.controller;

import org.lanqiao.entity.User;
import org.lanqiao.mapper.UserMapper;
import org.lanqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

@RestController
public class test {
    @Autowired
    private UserService userService;
    private UserMapper  userMapper;
    @RequestMapping("/hello")
    public String hello(){
        return "hello9";

    }
    @RequestMapping("/get")
    public String getUser(Integer id){
        return userService.selectByPrimaryKey(1).toString();

    }
    @RequestMapping("/login")
    public boolean getUser(HttpServletResponse response ,User user) {
        List<User> list = new ArrayList<User>();
        System.out.println(user.getUserName());
        System.out.println(user.getUserPass());
        boolean temp = userService.checkUser(user);
        System.out.print(temp);
        if (temp==true) {
            Cookie cookie = new Cookie("userName", user.getUserName());
            cookie.setPath("/");
            response.addCookie(cookie);
            return true;
        }
        else{
            return false;
        }

//        if (list.size()>1){
//           String user2= list.get(0).getUserName();
//           System.out.println(user2);
////            Cookie cookie = new Cookie("userName",user2);
////            cookie.setPath("/");
////            response.addCookie(cookie);
//            return true;
//        }
//        else{
//            return false;
//
//        }
//        return true;


    }

}
