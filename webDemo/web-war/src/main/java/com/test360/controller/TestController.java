package com.test360.controller;

import cn.thinkjoy.cloudstack.dynconfig.DynConfigClient;
import cn.thinkjoy.cloudstack.dynconfig.DynConfigClientFactory;
import com.test360.business.model.Criteria;
import com.test360.business.model.User;
import com.test360.business.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
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

    Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/test01")
    public Object test01(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        DynConfigClient dynConfigClient = DynConfigClientFactory.getClient();

        try {

            //insertdemo
            User user=new User();
            user.setName("李四");
            user.setPassword("123456");
            user.setBrithday(new Date());
//            userService.insertSelective(user);

            //selectdemo
            Criteria criteria=  new Criteria();
//            criteria.put("name_greater","%李四%");

            map.put("user",userService.selectByExample(criteria));
            //通过zookeeper获取配置文件
            logger.info(dynConfigClient.getConfig("common", "redisip"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/login")
    public Object login(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, Object> parames) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        logger.info(parames.toString());
        map.put("success",true);
        map.put("msg","登录成功");

        return map;
    }
}
