package org.java.service.impl;

import org.java.dao.PayInAdvanceAdjustmentMapper;
import org.java.entity.PayInAdvanceAdjustment;
import org.java.service.PayInAdvanceAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayInAdvanceAdjustmentServiceImpl implements PayInAdvanceAdjustmentService {

    @Autowired
    private PayInAdvanceAdjustmentMapper payInAdvanceAdjustmentMapper;

    @Override
    public PayInAdvanceAdjustment findPayInAdvanceAdjustmentById(String id) {
        return payInAdvanceAdjustmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertPayInAdvanceAdjustment(PayInAdvanceAdjustment payInAdvanceAdjustment) {
        return payInAdvanceAdjustmentMapper.insertSelective(payInAdvanceAdjustment);
    }
}
