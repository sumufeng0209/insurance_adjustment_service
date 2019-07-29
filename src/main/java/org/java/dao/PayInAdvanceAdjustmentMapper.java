package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.PayInAdvanceAdjustment;

/**
 * 预付理算表
 */
@Mapper
public interface PayInAdvanceAdjustmentMapper {
    int deleteByPrimaryKey(String adjustmentId);

    int insert(PayInAdvanceAdjustment record);

    int insertSelective(PayInAdvanceAdjustment record);

    PayInAdvanceAdjustment selectByPrimaryKey(String adjustmentId);

    int updateByPrimaryKeySelective(PayInAdvanceAdjustment record);

    int updateByPrimaryKey(PayInAdvanceAdjustment record);
}