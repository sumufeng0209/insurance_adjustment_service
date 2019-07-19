package org.java.service.impl;

import org.java.dao.AdvanceAdjustmentMapper;
import org.java.entity.AdvanceAdjustment;
import org.java.service.AdvanceAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvanceAdjustmentServiceImpl implements AdvanceAdjustmentService {

    @Autowired
    private AdvanceAdjustmentMapper advanceAdjustmentMapper;

    @Override
    public AdvanceAdjustment findAdvanceAdjustmentById() {
        return null;
    }
}
