package com.test360.business.serviceImpl;

import com.test360.business.model.Consumption;
import com.test360.business.model.Criteria;
import com.test360.business.service.ConsumptionService;
import com.test360.business.serviceInterface.ConsumptionInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 44323 on 2016/3/18.
 */
public class ConsumptionImpl implements ConsumptionInterface {
    @Autowired
    ConsumptionService consumptionService;

    @Override
    public HashMap<String, Object> consumption(Integer userID) { //查询消费记录
        HashMap<String, Object> map = new HashMap<String, Object>();
        Criteria criteria = new Criteria();
        criteria.put("userid",userID);
        List<Consumption> consumptionList = consumptionService.selectByExample(criteria);
        Date date[] = new Date[consumptionList.size()];
        for(int i=0;i<consumptionList.size();i++) {//初始化对象
            date[i] = new Date();
        }
        Integer money[] = new Integer[consumptionList.size()];
        String area[] = new String[consumptionList.size()];
        for(int i=0;i<consumptionList.size();i++) {//初始化对象
            area[i] = new String();
        }
        int count = 0;//计数器
        for(Consumption temp:consumptionList) {
            date[count++] = temp.getTime();
            money[count++] = temp.getMoney();
            area[count++] = temp.getArea();
        }
        map.put("date",date);
        map.put("money",money);
        map.put("area",area);
        return map;
    }
}
