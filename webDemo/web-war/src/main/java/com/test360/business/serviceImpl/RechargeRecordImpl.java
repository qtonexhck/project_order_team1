package com.test360.business.serviceImpl;

import com.test360.business.model.Criteria;
import com.test360.business.model.Rechargeable;
import com.test360.business.service.RechargeableService;
import com.test360.business.service.UserService;
import com.test360.business.serviceInterface.RechargeRecordInterface;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 44323 on 2016/3/18.
 */
public class RechargeRecordImpl implements RechargeRecordInterface {
    @Autowired
    RechargeableService rechargeableService;

    @Override
    public HashMap<String, Object> rechargeRecord(Integer userID) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Criteria criteria = new Criteria();
        criteria.put("userid",userID);
        List<Rechargeable> rechargeableList = new ArrayList<Rechargeable>();
        rechargeableList = rechargeableService.selectByExample(criteria);
        Date date[] = new Date[rechargeableList.size()];
        for(int i=0;i<rechargeableList.size();i++) {//初始化对象
            date[i] = new Date();
        }
        Integer money[] = new Integer[rechargeableList.size()];
        int count = 0;//计数器
        for(Rechargeable temp:rechargeableList) {
            date[count++] = temp.getTime();
            money[count++] = temp.getMoney();
        }
        map.put("date",date);//注意是数组
        map.put("money",money);//注意是数组
        return map;
    }
}
