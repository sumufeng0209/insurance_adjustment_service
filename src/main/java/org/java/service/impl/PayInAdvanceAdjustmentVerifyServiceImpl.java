package org.java.service.impl;

import org.java.dao.PayInAdvanceAdjustmentVerifyMapper;
import org.java.service.PayInAdvanceAdjustmentVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayInAdvanceAdjustmentVerifyServiceImpl implements PayInAdvanceAdjustmentVerifyService {

    @Autowired
    private PayInAdvanceAdjustmentVerifyMapper payInAdvanceAdjustmentVerifyMapper;
}
