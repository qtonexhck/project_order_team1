package com.test360.business.serviceImpl;

import com.test360.business.model.Rechargeable;
import com.test360.business.model.User;
import com.test360.business.service.RechargeableService;
import com.test360.business.service.UserService;
import com.test360.business.serviceInterface.RechargeInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by 44323 on 2016/3/18.
 */
public class RechargeImpl implements RechargeInterface {
    @Autowired
    RechargeableService rechargeableService;

    @Override
    public HashMap<String, Object> recharge(Integer userID,Integer money) { //将充值数据录入充值记录表
        HashMap<String, Object> map = new HashMap<String, Object>();
        Rechargeable rechargeable = new Rechargeable();
        rechargeable.setUserid(userID);
        rechargeable.setMoney(money);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String time = simpleDateFormat.format(date);
        rechargeable.setTime(time);
        rechargeableService.insert(rechargeable);
        return map;
    }
}
