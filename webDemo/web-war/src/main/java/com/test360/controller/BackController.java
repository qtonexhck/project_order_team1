package com.test360.controller;

import com.test360.business.serviceImpl.CheckOrderImpl;
import com.test360.business.serviceImpl.DeleteUserImpl;
import com.test360.business.serviceInterface.CheckOrderInterface;
import com.test360.business.serviceInterface.DeleteUserInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by 44323 on 2016/3/18.
 */
@Controller
@RequestMapping(value = "/back")
public class BackController {
    Logger logger= LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/publish")//发布菜谱
    public Object publish(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/checkOrder")//查询订单
    public Object checkOrder(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String timestr = request.getParameter("");
        try {
            Date time = format.parse(timestr);
            CheckOrderInterface checkOrderInterface = new CheckOrderImpl();
            //返回的map存放员工号("number")，员工姓名("name")，员工套餐("meal")，领餐状态("status")，点餐地点("area")
            map = checkOrderInterface.checkOrder(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/orderSum")//订单统计
    public Object orderSum(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/searchUser")//搜索用户
    public Object searchUser(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/deleteUser")//删除用户
    public Object deleteUser(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Integer  id = Integer.parseInt(request.getParameter(""));
        DeleteUserInterface deleteUserInterface = new DeleteUserImpl();
        map = deleteUserInterface.delete(id);

        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/importUser")//导入用户
    public Object importUser(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        return map;
    }
}

