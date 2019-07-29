package org.java.service;

import org.java.entity.ComprehensiveAdjustment;

/**
 * 全面理算Service
 */
public interface ComprehensiveAdjustmentService {

    public ComprehensiveAdjustment findComprehensiveAdjustmentById(String id);

    /**
     * 新增数据
     * @param comprehensiveAdjustment
     * @return
     */
    public int insertComprehensiveAdjustment(ComprehensiveAdjustment comprehensiveAdjustment);
}
