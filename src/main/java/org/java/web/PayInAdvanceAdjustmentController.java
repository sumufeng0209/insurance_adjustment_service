package org.java.web;

import org.java.service.PayInAdvanceAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 预付理算控制器
 */
@Controller
public class PayInAdvanceAdjustmentController {

    @Autowired
    private PayInAdvanceAdjustmentService payInAdvanceAdjustmentService;
}
