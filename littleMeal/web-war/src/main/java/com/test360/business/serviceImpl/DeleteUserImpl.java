package com.test360.business.serviceImpl;

import com.test360.business.service.UserService;
import com.test360.business.serviceInterface.DeleteUserInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * Created by 44323 on 2016/3/18.
 */
public class DeleteUserImpl implements DeleteUserInterface {
    @Autowired
    UserService userService;

    @Override
    public void deleteUser(Integer id) {
//        HashMap<String, Object> map = new HashMap<String, Object>();
        userService.deleteByPrimaryKey(id);
//        return  map;
    }
}
