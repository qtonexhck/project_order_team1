package com.test360.business.service;

import com.test360.business.dao.ConsumptionMapper;
import com.test360.business.model.Consumption;
import com.test360.business.model.Criteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * consumption
 * @version 1.0 2016-03-18
 * @powerby hetgyd 
 */
@Service
public class ConsumptionService {
    @Autowired
    private ConsumptionMapper consumptionMapper;

    public int countByExample(Criteria example) {
        int count = this.consumptionMapper.countByExample(example);
        return count;
    }

    public Consumption selectByPrimaryKey(Integer id) {
        return this.consumptionMapper.selectByPrimaryKey(id);
    }

    public List<Consumption> selectByExample(Criteria example) {
        return this.consumptionMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.consumptionMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Consumption record) {
        return this.consumptionMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Consumption record) {
        return this.consumptionMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.consumptionMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Consumption record, Criteria example) {
        return this.consumptionMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(Consumption record, Criteria example) {
        return this.consumptionMapper.updateByExample(record, example.getCondition());
    }

    public int insert(Consumption record) {
        return this.consumptionMapper.insert(record);
    }

    public int insertSelective(Consumption record) {
        return this.consumptionMapper.insertSelective(record);
    }
}