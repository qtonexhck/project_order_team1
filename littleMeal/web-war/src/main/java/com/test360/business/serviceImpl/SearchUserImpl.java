package com.test360.business.serviceImpl;

import com.test360.business.model.Criteria;
import com.test360.business.model.User;
import com.test360.business.service.UserService;
import com.test360.business.serviceInterface.SearchUserInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 44323 on 2016/3/21.
 */
public class SearchUserImpl implements SearchUserInterface {
    @Autowired
    UserService userService;

    @Override
    public HashMap<String, Object> searchUser(String number) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Criteria criteria = new Criteria();
        criteria.put("number",number);
        List<User> userList = userService.selectByExample(criteria);
        User user = userList.get(0);
        map.put("id",user.getId());//员工ID
        map.put("number",number);//员工号
        map.put("name",user.getName());//姓名
        map.put("phone",user.getPhone());//手机号
        return map;
    }
}
