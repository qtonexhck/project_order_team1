package com.test360.business.serviceImpl;

import com.test360.business.model.Consumption;
import com.test360.business.model.Criteria;
import com.test360.business.model.User;
import com.test360.business.service.ConsumptionService;
import com.test360.business.service.UserService;
import com.test360.business.serviceInterface.OrderInterface;
import com.test360.business.util.Status;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by 44323 on 2016/3/18.
 */
public class OrderImpl implements OrderInterface{
    @Autowired
    UserService userService;

    @Autowired
    ConsumptionService consumptionService;

    @Override
    public void order(Integer id,String meal,String area,Integer money) { //定餐时将订餐信息录入消费记录表
        Consumption consumption = new Consumption();
        consumption.setUserid(id);
        consumption.setArea(area);
        consumption.setMeal(meal);
        consumption.setMoney(money);
        Status status = new Status();
        consumption.setStatus(status.DO);//设置领餐状态为未领
        Date date = new Date();
        consumption.setTime(date);
        consumptionService.insert(consumption);
    }
}
