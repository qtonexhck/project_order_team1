package com.test360.business.serviceImpl;

import com.test360.business.model.Criteria;
import com.test360.business.model.User;
import com.test360.business.service.UserService;
import com.test360.business.serviceInterface.LoginInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 44323 on 2016/3/18.
 */
public class LoginImpl implements LoginInterface {
    @Autowired
    UserService userService;

    @Override
    public HashMap<String, Object> login(String wechat) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Boolean isBind = false;//用户绑定标识
        Integer userID = null;//用户ID
        Criteria criteria=  new Criteria();
        criteria = criteria.put("wechat",wechat);
        List<User> userList = new ArrayList<User>();
        userList = userService.selectByExample(criteria);
        if(!userList.isEmpty()) {
            isBind = true;//用户已绑定
            userID = userList.get(0).getId();//获取用户的ID，返回给请求页面
        }
        map.put("isBind",isBind);
        map.put("userID",userID);
        return map;
    }



}

