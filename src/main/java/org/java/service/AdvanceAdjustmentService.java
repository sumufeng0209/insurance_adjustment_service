package org.java.service;

import org.java.entity.AdvanceAdjustment;

/**
 * 垫付理算Service
 */
public interface AdvanceAdjustmentService {

    public AdvanceAdjustment findAdvanceAdjustmentById(String id);

    public String insertAdvanceAdjustment(AdvanceAdjustment advanceAdjustment,String taskId);


}
