package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.ComprehensiveAdjustmentVerify;

/**
 * 全面理算核赔表
 */
@Mapper
public interface ComprehensiveAdjustmentVerifyMapper {
    int deleteByPrimaryKey(String verifyId);

    int insert(ComprehensiveAdjustmentVerify record);

    int insertSelective(ComprehensiveAdjustmentVerify record);

    ComprehensiveAdjustmentVerify selectByPrimaryKey(String verifyId);

    int updateByPrimaryKeySelective(ComprehensiveAdjustmentVerify record);

    int updateByPrimaryKey(ComprehensiveAdjustmentVerify record);
}