package org.java.web;

import org.java.service.AdvanceAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * 垫付理算控制器
 */
@Controller
public class AdvanceAdjustmentController {

    @Autowired
    private AdvanceAdjustmentService advanceAdjustmentService;
}
