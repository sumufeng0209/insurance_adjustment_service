package org.java.web;

import org.java.entity.PayInAdvanceAdjustment;
import org.java.service.PayInAdvanceAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 预付理算控制器
 */
@Controller
public class PayInAdvanceAdjustmentController {


    @Autowired
    private PayInAdvanceAdjustmentService payInAdvanceAdjustmentService;

    @RequestMapping("/insert/payInAdvanceAdjustment")
    @ResponseBody
    public String insertPayIn(PayInAdvanceAdjustment payInAdvanceAdjustment){
        System.out.println(payInAdvanceAdjustment);
        return "新增成功";
    }
}
