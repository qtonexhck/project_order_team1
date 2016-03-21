package com.test360.business.serviceImpl;

import com.test360.business.model.Consumption;
import com.test360.business.model.Criteria;
import com.test360.business.service.ConsumptionService;
import com.test360.business.serviceInterface.OrderSumInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 44323 on 2016/3/21.
 */
public class OrderSumImpl implements OrderSumInterface {
    @Autowired
    ConsumptionService consumptionService;


    @Override
    public HashMap<String, Object> orderSum(Date time) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Criteria criteria1 = new Criteria();
        criteria1.put("time",time);
        criteria1.put("area","17楼");
        criteria1.put("meal","A套餐");
       // List<Consumption> consumptionList = consumptionService.selectByExample(criteria);
        Integer a17 = consumptionService.countByExample(criteria1);//该日期下17楼A餐份数

        Criteria criteria2 = new Criteria();
        criteria2.put("time",time);
        criteria2.put("area","17楼");
        criteria2.put("meal","B套餐");
        Integer b17 = consumptionService.countByExample(criteria2);//该日期下17楼B餐份数

        Criteria criteria3 = new Criteria();
        criteria3.put("time",time);
        criteria3.put("area","17楼");
        criteria3.put("meal","C套餐");
        Integer c17 = consumptionService.countByExample(criteria3);//该日期下17楼C餐份数

        Criteria criteria4 = new Criteria();
        criteria4.put("time",time);
        criteria4.put("area","18楼");
        criteria4.put("meal","A套餐");
        Integer a18 = consumptionService.countByExample(criteria4);//该日期下18楼A餐份数

        Criteria criteria5 = new Criteria();
        criteria5.put("time",time);
        criteria5.put("area","18楼");
        criteria5.put("meal","B套餐");
        Integer b18 = consumptionService.countByExample(criteria5);//该日期下18楼B餐份数

        Criteria criteria6 = new Criteria();
        criteria6.put("time",time);
        criteria6.put("area","18楼");
        criteria6.put("meal","C套餐");
        Integer c18 = consumptionService.countByExample(criteria6);//该日期下18楼C餐份数

        Criteria criteria7 = new Criteria();
        criteria7.put("time",time);
        criteria7.put("area","创客5楼");
        criteria7.put("meal","A套餐");
        Integer a5 = consumptionService.countByExample(criteria7);//该日期下创客5楼A餐份数

        Criteria criteria8 = new Criteria();
        criteria8.put("time",time);
        criteria8.put("area","创客5楼");
        criteria8.put("meal","B套餐");
        Integer b5 = consumptionService.countByExample(criteria8);//该日期下创客5楼B餐份数

        Criteria criteria9 = new Criteria();
        criteria9.put("time",time);
        criteria9.put("area","创客5楼");
        criteria9.put("meal","C套餐");
        Integer c5 = consumptionService.countByExample(criteria9);//该日期下创客5楼C餐份数

        Integer total17 = a17+b17+c17;//17楼套餐总份数
        Integer total18 = a18+b18+c18;//18楼套餐总份数
        Integer total5 = a5+b5+c5;//创客5楼套餐总份数
        Integer total = total17+total18+total5;//当天总份数

        map.put("a17",a17);
        map.put("b17",b17);
        map.put("c17",c17);
        map.put("total17",total17);
        map.put("a18",a18);
        map.put("b18",b18);
        map.put("c18",c18);
        map.put("total18",total18);
        map.put("a5",a5);
        map.put("b5",b5);
        map.put("c5",c5);
        map.put("total5",total5);
        map.put("total",total);
        return map;
    }
}
