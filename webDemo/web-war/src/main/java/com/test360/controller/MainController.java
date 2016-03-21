package com.test360.controller;

import com.test360.business.serviceImpl.*;
import com.test360.business.serviceInterface.*;
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
@RequestMapping(value = "/main")//主页面
public class MainController {
    Logger logger= LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/order")//点餐
    public Object order(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Integer id = Integer.parseInt(request.getParameter(""));
        String meal = request.getParameter("");
        String area = request.getParameter("");
        Integer money = Integer.parseInt(request.getParameter(""));
        OrderInterface orderInterface = new OrderImpl();
        orderInterface.order(id,meal,area,money);//将用户订餐数据录入消费记录表
        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/balance")//余额查询
    public Object  balance(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Integer userID = Integer.parseInt(request.getParameter(""));
        BalanceInterface balanceInterface = new BalanceImpl();
        map = balanceInterface.balance(userID);//map的key为number,name balance
        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/recharge")//在线充值
    public Object recharge(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Integer userID = Integer.parseInt(request.getParameter(""));
        BalanceInterface balanceInterface = new BalanceImpl();
        //显示账户信息与余额
        map = balanceInterface.balance(userID);//map的key为number,name balance
        RechargeInterface rechargeInterface = new RechargeImpl();//充值

        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/rechargeRecord")//充值记录
    public Object rechargeRecord(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Integer userID = Integer.parseInt(request.getParameter(""));
        RechargeRecordInterface rechargeRecordInterface = new RechargeRecordImpl();
        map = rechargeRecordInterface.rechargeRecord(userID);//返回的map存放充值时间和充值金额（"data"对应的是Date类型数组，"money"对应Integer类型数组）
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/consumption")//消费记录
    public Object consumption(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Integer userID = Integer.parseInt(request.getParameter(""));
        ConsumptionInterface consumptionInterface = new ConsumptionImpl();
        map = consumptionInterface.consumption(userID);//返回的map存放消费时间，消费金额和消费地点（"data"对应的是Date类型数组，"money"对应Integer类型数组，"area"对应String类型数组）
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/transfer")//转送
    public Object transfer(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        return map;
    }

}
