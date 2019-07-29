package org.java.service;

import org.java.entity.ComprehensiveAdjustmentVerify;

/**
 * 全面理算核赔Service
 */
public interface ComprehensiveAdjustmentVerifyService {

    public ComprehensiveAdjustmentVerify  findComprehensiveAdjustmentVerifyById(String id);

    public int insertComprehensiveAdjustmentVerify(ComprehensiveAdjustmentVerify comprehensiveAdjustmentVerify);
}
