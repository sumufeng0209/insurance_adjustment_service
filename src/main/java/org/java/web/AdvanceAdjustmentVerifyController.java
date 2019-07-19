package org.java.web;

import org.java.service.AdvanceAdjustmentVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 垫付理算核赔控制器
 */
@Controller
public class AdvanceAdjustmentVerifyController {

    @Autowired
    private AdvanceAdjustmentVerifyService advanceAdjustmentVerifyService;
}
