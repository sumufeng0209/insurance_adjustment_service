package org.java.service.impl;

import org.java.dao.ComprehensiveAdjustmentVerifyMapper;
import org.java.service.ComprehensiveAdjustmentVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComprehensiveAdjustmentVerifyServiceImpl implements ComprehensiveAdjustmentVerifyService {

    @Autowired
    private ComprehensiveAdjustmentVerifyMapper comprehensiveAdjustmentVerifyMapper;
}
