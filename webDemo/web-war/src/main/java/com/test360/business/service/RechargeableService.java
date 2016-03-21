package com.test360.business.service;

import com.test360.business.dao.RechargeableMapper;
import com.test360.business.model.Criteria;
import com.test360.business.model.Rechargeable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * rechargeable
 * @version 1.0 2016-03-18
 * @powerby hetgyd 
 */
@Service
public class RechargeableService {
    @Autowired
    private RechargeableMapper rechargeableMapper;

    public int countByExample(Criteria example) {
        int count = this.rechargeableMapper.countByExample(example);
        return count;
    }

    public Rechargeable selectByPrimaryKey(Integer id) {
        return this.rechargeableMapper.selectByPrimaryKey(id);
    }

    public List<Rechargeable> selectByExample(Criteria example) {
        return this.rechargeableMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.rechargeableMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Rechargeable record) {
        return this.rechargeableMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Rechargeable record) {
        return this.rechargeableMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.rechargeableMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Rechargeable record, Criteria example) {
        return this.rechargeableMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(Rechargeable record, Criteria example) {
        return this.rechargeableMapper.updateByExample(record, example.getCondition());
    }

    public int insert(Rechargeable record) {
        return this.rechargeableMapper.insert(record);
    }

    public int insertSelective(Rechargeable record) {
        return this.rechargeableMapper.insertSelective(record);
    }
}