package com.test360.business.service;

import com.test360.business.dao.ManagerMapper;
import com.test360.business.model.Criteria;
import com.test360.business.model.Manager;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * manager
 * @version 1.0 2016-03-18
 * @powerby hetgyd 
 */
@Service
public class ManagerService {
    @Autowired
    private ManagerMapper managerMapper;

    public int countByExample(Criteria example) {
        int count = this.managerMapper.countByExample(example);
        return count;
    }

    public Manager selectByPrimaryKey(Integer id) {
        return this.managerMapper.selectByPrimaryKey(id);
    }

    public List<Manager> selectByExample(Criteria example) {
        return this.managerMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.managerMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Manager record) {
        return this.managerMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Manager record) {
        return this.managerMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.managerMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Manager record, Criteria example) {
        return this.managerMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(Manager record, Criteria example) {
        return this.managerMapper.updateByExample(record, example.getCondition());
    }

    public int insert(Manager record) {
        return this.managerMapper.insert(record);
    }

    public int insertSelective(Manager record) {
        return this.managerMapper.insertSelective(record);
    }
}