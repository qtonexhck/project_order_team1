package com.test360.controller;

import com.test360.business.serviceImpl.BindImpl;
import com.test360.business.serviceImpl.LoginImpl;
import com.test360.business.serviceInterface.BindInterface;
import com.test360.business.serviceInterface.LoginInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * Created by 44323 on 2016/3/18.
 */
@Controller
@RequestMapping(value = "/welcome")
public class LoginController {
    Logger logger= LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/login")//登录
    public Object login(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String wechat = request.getParameter("");
        LoginInterface loginInterface = new LoginImpl();
        map = loginInterface.login(wechat); //返回用户绑定标识isBind（true为已绑定，false为未绑定）及用户ID
//        Boolean isBind = (Boolean)map.get("isBind");//或者直接将map返回给前端，交由前端判断
//        Integer userID = (Integer)map.get("userID");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/bind")//绑定手机号
    public Object bind(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String wechat = request.getParameter("");
        String phone = request.getParameter("");
        BindInterface bindInterface = new BindImpl();
        bindInterface.bind(phone,wechat);//根据电话号码找到用户，并写入用户微信号实现绑定
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/receive")//领餐
    public Object receive(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        return map;
    }
}
