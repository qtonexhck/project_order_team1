package com.test360.business.serviceImpl;

import com.test360.business.model.Criteria;
import com.test360.business.model.User;
import com.test360.business.service.UserService;
import com.test360.business.serviceInterface.BindInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 44323 on 2016/3/18.
 */
public class BindImpl implements BindInterface{
    @Autowired
    UserService userService;

    @Override
    public void bind(String phone,String wechat) {
        Criteria criteria = new Criteria();
        criteria.put("phone",phone);
        List<User> userList = new ArrayList<User>();
        userList = userService.selectByExample(criteria);//根据用户电话号码找到用户
        userList.get(0).setWechat(wechat);//设置用户微信号
        userService.updateByPrimaryKey(userList.get(0));//更新数据库

    }
}
