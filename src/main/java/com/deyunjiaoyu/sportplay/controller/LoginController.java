package com.deyunjiaoyu.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.deyunjiaoyu.sportplay.bean.User;
import com.deyunjiaoyu.sportplay.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        String status = "error";
        int code = 500;
        User loginUser = userDao.getUserByMessage(user.getUsername(),user.getPassword());
        if (loginUser != null ) {
            status = "success";
            code = 200;
        }

        HashMap<String,Object> res = new HashMap<>();

        res.put("status",status);
        res.put("data",loginUser);
        res.put("code",code);

        String res_json = JSON.toJSONString(res);
        return res_json;
    }
}
