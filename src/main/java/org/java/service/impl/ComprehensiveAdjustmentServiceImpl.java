package org.java.service.impl;

import org.java.dao.ComprehensiveAdjustmentMapper;
import org.java.service.ComprehensiveAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComprehensiveAdjustmentServiceImpl implements ComprehensiveAdjustmentService {

    @Autowired
    private ComprehensiveAdjustmentMapper comprehensiveAdjustmentMapper;
}
