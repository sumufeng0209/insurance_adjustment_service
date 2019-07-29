package org.java.service.impl;

import org.java.dao.ComprehensiveAdjustmentMapper;
import org.java.entity.ComprehensiveAdjustment;
import org.java.service.ComprehensiveAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 预付理算
 */
@Service
public class ComprehensiveAdjustmentServiceImpl implements ComprehensiveAdjustmentService {

    @Autowired
    private ComprehensiveAdjustmentMapper comprehensiveAdjustmentMapper;

    /**
     * 根据编号查询
     * @param id
     * @return
     */
    @Override
    public ComprehensiveAdjustment findComprehensiveAdjustmentById(String id) {
        return comprehensiveAdjustmentMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增预付理算
     * @param comprehensiveAdjustment
     * @return
     */
    @Override
    public int insertComprehensiveAdjustment(ComprehensiveAdjustment comprehensiveAdjustment) {
        return comprehensiveAdjustmentMapper.insertSelective(comprehensiveAdjustment);
    }
}
