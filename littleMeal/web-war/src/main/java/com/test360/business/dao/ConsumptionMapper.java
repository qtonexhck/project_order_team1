package com.test360.business.dao;

import com.test360.business.model.Consumption;
import com.test360.business.model.Criteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface ConsumptionMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(Criteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(Criteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Consumption record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Consumption record);

    /**
     * 根据条件查询记录集
     */
    List<Consumption> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    Consumption selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") Consumption record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") Consumption record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Consumption record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Consumption record);
}