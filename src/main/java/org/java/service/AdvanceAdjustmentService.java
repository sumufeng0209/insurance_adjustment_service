package org.java.service;

import org.java.entity.AdvanceAdjustment;

/**
 * 垫付理算Service
 */
public interface AdvanceAdjustmentService {

    public AdvanceAdjustment findAdvanceAdjustmentById();

    public int insertAdvanceAdjustment(AdvanceAdjustment advanceAdjustment);


}
