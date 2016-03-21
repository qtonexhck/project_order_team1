package com.test360.business.serviceImpl;

import com.test360.business.model.User;
import com.test360.business.service.UserService;
import com.test360.business.serviceInterface.BalanceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * Created by 44323 on 2016/3/18.
 */
public class BalanceImpl implements BalanceInterface{
    @Autowired
    UserService userService;

    @Override
    public HashMap<String, Object> balance(Integer userID) { //查询余额 显示员工号，员工姓名，余额
        HashMap<String, Object> map = new HashMap<String, Object>();
        User user = userService.selectByPrimaryKey(userID);
        String number = user.getNumber();
        String name = user.getName();
        Integer balance = user.getBalance();
        map.put("number",number);
        map.put("name",name);
        map.put("balance",balance);
        return map;
    }
}
