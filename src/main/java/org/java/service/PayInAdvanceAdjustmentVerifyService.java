package org.java.service;

import org.java.entity.PayInAdvanceAdjustmentVerify;

/**
 * 预付理算核赔表
 */
public interface PayInAdvanceAdjustmentVerifyService {

    public PayInAdvanceAdjustmentVerify findPayInAdvanceAdjustmentVerifyById(String id);

    public int insertPayInAdvanceAdjustmentVerify(PayInAdvanceAdjustmentVerify payInAdvanceAdjustmentVerify);
}
