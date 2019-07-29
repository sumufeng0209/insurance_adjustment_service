package org.java.service;

import org.java.entity.AdvanceAdjustmentVerify;

/**
 * 垫付理算核赔Service
 */
public interface AdvanceAdjustmentVerifyService {

    public String insertAdvanceAdjustment (AdvanceAdjustmentVerify advanceAdjustmentVerify,String taskId);

    public AdvanceAdjustmentVerify findAdvanceAdjustmentById(String id);
}
