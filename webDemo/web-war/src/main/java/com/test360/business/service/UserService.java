package com.test360.business.service;

import com.test360.business.dao.UserMapper;
import com.test360.business.model.Criteria;
import com.test360.business.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * user
 * @version 1.0 2016-03-14
 * @powerby hetgyd 
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int countByExample(Criteria example) {
        int count = this.userMapper.countByExample(example);
        return count;
    }

    public User selectByPrimaryKey(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<User> selectByExample(Criteria example) {
        return this.userMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.userMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(User record) {
        return this.userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) {
        return this.userMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(User record, Criteria example) {
        return this.userMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(User record, Criteria example) {
        return this.userMapper.updateByExample(record, example.getCondition());
    }

    public int insert(User record) {
        return this.userMapper.insert(record);
    }

    public int insertSelective(User record) {
        return this.userMapper.insertSelective(record);
    }

}