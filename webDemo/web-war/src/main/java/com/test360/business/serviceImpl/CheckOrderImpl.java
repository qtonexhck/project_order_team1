package com.test360.business.serviceImpl;

import com.test360.business.model.Consumption;
import com.test360.business.model.Criteria;
import com.test360.business.service.ConsumptionService;
import com.test360.business.service.UserService;
import com.test360.business.serviceInterface.CheckOrderInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 44323 on 2016/3/18.
 */
public class CheckOrderImpl implements CheckOrderInterface {
    @Autowired
    ConsumptionService consumptionService;

    @Autowired
    UserService userService;

    @Override
    public HashMap<String, Object> checkOrder(Date time) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Criteria criteria = new Criteria();
        criteria.put("time",time);
        List<Consumption> consumptionList = consumptionService.selectByExample(criteria);
        Integer userID[] = new Integer[consumptionList.size()];//员工ID
        String number[] = new String[consumptionList.size()]; //员工号
        for(int i=0;i<consumptionList.size();i++) { //初始化对象
            number[i] = new String();
        }
        String name[] = new String[consumptionList.size()]; //姓名
        for(int i=0;i<consumptionList.size();i++) { //初始化对象
            name[i] = new String();
        }
        String meal[] = new String[consumptionList.size()]; //套餐名
        for(int i=0;i<consumptionList.size();i++) { //初始化对象
            meal[i] = new String();
        }
        String status[] = new String[consumptionList.size()]; //领餐状态
        for(int i=0;i<consumptionList.size();i++) { //初始化对象
            status[i] = new String();
        }
        String area[] = new String[consumptionList.size()]; //领餐地点
        for(int i=0;i<consumptionList.size();i++) { //初始化对象
            area[i] = new String();
        }
        int count = 0;//计数器
        for(Consumption temp: consumptionList) {
            userID[count] = temp.getUserid();
            number[count] = userService.selectByPrimaryKey(userID[count]).getNumber();//根据员工ID得到员工号
            name[count] = userService.selectByPrimaryKey(userID[count]).getName();//根据员工ID得到员工姓名
            meal[count] = temp.getMeal();
            status[count] = temp.getStatus();
            area[count] = temp.getArea();
            count++;
        }
        map.put("number",number);
        map.put("name",name);
        map.put("meal",meal);
        map.put("status",status);
        map.put("area",area);
        return map;
    }
}
