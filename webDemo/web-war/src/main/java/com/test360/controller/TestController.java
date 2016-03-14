package com.test360.controller;

import cn.thinkjoy.cloudstack.client.zookeeper.ZKClient;
import cn.thinkjoy.cloudstack.dynconfig.DynConfigClient;
import cn.thinkjoy.cloudstack.dynconfig.DynConfigClientFactory;
import cn.thinkjoy.common.protocol.RequestT;
import com.test360.business.model.Criteria;
import com.test360.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huangshengqing on 2016/3/14.
 *
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

//    @Autowired
//    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/test01")
    public Object test01(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        DynConfigClient dynConfigClient = DynConfigClientFactory.getClient();

        try {
//            Criteria criteria=  new Criteria();
//            criteria.put("name_greater","%李四%");
//            userService.selectByExample(criteria);
            System.out.println("  "+dynConfigClient.getConfig("common", "redisip"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/login")
    public Object login(HttpServletRequest request, HttpServletResponse response, @RequestBody RequestT<Map<String, String>> parames) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        System.out.println(parames.toString());
        map.put("success",true);
        map.put("msg","登录成功");

        return map;
    }
}
