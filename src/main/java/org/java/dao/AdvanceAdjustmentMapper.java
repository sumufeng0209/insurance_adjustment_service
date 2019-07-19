package org.java.dao;

import org.java.entity.AdvanceAdjustment;

/**
 * 垫付理算表
 */
public interface AdvanceAdjustmentMapper {
    int deleteByPrimaryKey(String adjustmentId);

    int insert(AdvanceAdjustment record);

    int insertSelective(AdvanceAdjustment record);

    AdvanceAdjustment selectByPrimaryKey(String adjustmentId);

    int updateByPrimaryKeySelective(AdvanceAdjustment record);

    int updateByPrimaryKey(AdvanceAdjustment record);
}