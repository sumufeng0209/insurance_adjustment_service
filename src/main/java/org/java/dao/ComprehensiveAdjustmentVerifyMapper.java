package org.java.dao;

import org.java.entity.ComprehensiveAdjustmentVerify;

/**
 * 全面理算核赔表
 */
public interface ComprehensiveAdjustmentVerifyMapper {
    int deleteByPrimaryKey(String verifyId);

    int insert(ComprehensiveAdjustmentVerify record);

    int insertSelective(ComprehensiveAdjustmentVerify record);

    ComprehensiveAdjustmentVerify selectByPrimaryKey(String verifyId);

    int updateByPrimaryKeySelective(ComprehensiveAdjustmentVerify record);

    int updateByPrimaryKey(ComprehensiveAdjustmentVerify record);
}