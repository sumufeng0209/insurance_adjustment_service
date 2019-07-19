package org.java.web;

import org.java.service.PayInAdvanceAdjustmentVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 预付理算核赔控制器
 */
@Controller
public class PayInAdvanceAdjustmentVerifyController {

    @Autowired
    private PayInAdvanceAdjustmentVerifyService payInAdvanceAdjustmentVerifyService;
}
