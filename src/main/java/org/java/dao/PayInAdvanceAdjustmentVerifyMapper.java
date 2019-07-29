package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.PayInAdvanceAdjustmentVerify;

/**
 * 预付理算核赔表
 */
@Mapper
public interface PayInAdvanceAdjustmentVerifyMapper {
    int deleteByPrimaryKey(String verifyId);

    int insert(PayInAdvanceAdjustmentVerify record);

    int insertSelective(PayInAdvanceAdjustmentVerify record);

    PayInAdvanceAdjustmentVerify selectByPrimaryKey(String verifyId);

    int updateByPrimaryKeySelective(PayInAdvanceAdjustmentVerify record);

    int updateByPrimaryKey(PayInAdvanceAdjustmentVerify record);
}