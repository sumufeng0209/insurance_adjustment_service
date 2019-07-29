package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.AdvanceAdjustmentVerify;

/**
 * 垫付理算核赔表
 */
@Mapper
public interface AdvanceAdjustmentVerifyMapper {
    int deleteByPrimaryKey(String verifyId);

    int insert(AdvanceAdjustmentVerify record);

    int insertSelective(AdvanceAdjustmentVerify record);

    AdvanceAdjustmentVerify selectByPrimaryKey(String verifyId);

    int updateByPrimaryKeySelective(AdvanceAdjustmentVerify record);

    int updateByPrimaryKey(AdvanceAdjustmentVerify record);
}