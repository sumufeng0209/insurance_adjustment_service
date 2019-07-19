package org.java.service.impl;

import org.java.dao.AdvanceAdjustmentVerifyMapper;
import org.java.service.AdvanceAdjustmentVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvanceAdjustmentVerifyServiceImpl implements AdvanceAdjustmentVerifyService {

    @Autowired
    private AdvanceAdjustmentVerifyMapper advanceAdjustmentVerifyMapper;

}
