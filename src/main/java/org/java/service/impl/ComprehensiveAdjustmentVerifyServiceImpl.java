package org.java.service.impl;

import org.java.dao.ComprehensiveAdjustmentVerifyMapper;
import org.java.entity.ComprehensiveAdjustmentVerify;
import org.java.service.ComprehensiveAdjustmentVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComprehensiveAdjustmentVerifyServiceImpl implements ComprehensiveAdjustmentVerifyService {

    @Autowired
    private ComprehensiveAdjustmentVerifyMapper comprehensiveAdjustmentVerifyMapper;

    @Override
    public ComprehensiveAdjustmentVerify findComprehensiveAdjustmentVerifyById(String id) {
        return comprehensiveAdjustmentVerifyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertComprehensiveAdjustmentVerify(ComprehensiveAdjustmentVerify comprehensiveAdjustmentVerify) {
        return comprehensiveAdjustmentVerifyMapper.insertSelective(comprehensiveAdjustmentVerify);
    }
}
