package com.test360.controller;


import cn.thinkjoy.cloudstack.dynconfig.DynConfigClient;
import cn.thinkjoy.cloudstack.dynconfig.DynConfigClientFactory;
import com.test360.business.model.Consumption;
import com.test360.business.model.Criteria;
import com.test360.business.model.User;
import com.test360.business.service.ConsumptionService;
import com.test360.business.service.UserService;
import com.test360.business.util.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;


@Controller
@RequestMapping(value = "/test")
public class TestController {

    Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserService userService;

    @Autowired
    ConsumptionService consumptionService;

    @ResponseBody
    @RequestMapping(value = "/test01")
    public Object test01(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        DynConfigClient dynConfigClient = DynConfigClientFactory.getClient();

        try {
            System.out.println("000000000000000000000000000");

//            Criteria criteria = new Criteria();
//            criteria.put("phone","13517206802");
//            List<User> userList = new ArrayList<User>();
//            userList = userService.selectByExample(criteria);//根据用户电话号码找到用户
//            userList.get(0).setWechat("wei443236289");//设置用户微信号
//            userService.updateByPrimaryKey(userList.get(0));//更新数据库
            Consumption consumption = new Consumption();
            consumption.setUserid(1);
            consumption.setArea("18楼");
            consumption.setMeal("A餐莲藕焖鸭，大白菜煮粉丝");
            consumption.setMoney(6);
            Status status = new Status();
            consumption.setStatus(status.DO);//设置领餐状态为未领
            Date date = new Date();
            consumption.setTime(date);
            consumptionService.insert(consumption);

            //insertdemo
//            User user=new User();
//            user.setName("李四");
//            user.setPassword("123456");
//            user.setBrithday(new Date());
//            userService.insertSelective(user);

            //selectdemo
//            Criteria criteria=  new Criteria();
//            criteria.put("name_greater","%李四%");

//            map.put("user",userService.selectByExample(criteria));
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
