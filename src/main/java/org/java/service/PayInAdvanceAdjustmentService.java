package org.java.service;

import org.java.entity.PayInAdvanceAdjustment;

/**
 * 预付理算表
 */
public interface PayInAdvanceAdjustmentService {

    public PayInAdvanceAdjustment findPayInAdvanceAdjustmentById(String id);

    public int insertPayInAdvanceAdjustment(PayInAdvanceAdjustment payInAdvanceAdjustment);
}
