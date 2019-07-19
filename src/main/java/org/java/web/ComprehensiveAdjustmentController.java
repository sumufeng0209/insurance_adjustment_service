package org.java.web;

import org.java.service.ComprehensiveAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 全面理算控制器
 */
@Controller
public class ComprehensiveAdjustmentController {

    @Autowired
    private ComprehensiveAdjustmentService comprehensiveAdjustmentService;
}
