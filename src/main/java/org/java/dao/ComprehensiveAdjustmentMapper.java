package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.ComprehensiveAdjustment;

/**
 * 全面理算表
 */
@Mapper
public interface ComprehensiveAdjustmentMapper {
    int deleteByPrimaryKey(String adjustmentId);

    int insert(ComprehensiveAdjustment record);

    int insertSelective(ComprehensiveAdjustment record);

    ComprehensiveAdjustment selectByPrimaryKey(String adjustmentId);

    int updateByPrimaryKeySelective(ComprehensiveAdjustment record);

    int updateByPrimaryKey(ComprehensiveAdjustment record);
}