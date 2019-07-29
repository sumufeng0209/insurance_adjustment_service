
 package org.java.web;

import org.java.entity.AdvanceAdjustmentVerify;
import org.java.service.AdvanceAdjustmentVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

 /**
 * 垫付理算核赔控制器
 */
@Controller
public class AdvanceAdjustmentVerifyController {

    @Autowired
    private AdvanceAdjustmentVerifyService advanceAdjustmentVerifyService;

    @Autowired
    private HttpSession session;


    @RequestMapping("/insert/advanceAdjustmentVerify/{taskId}")
    @ResponseBody
    public String insertAdvanceAdjustmentVerify(AdvanceAdjustmentVerify advanceAdjustmentVerify, @PathVariable("taskId") String taskId ){
        Map<String,Object> emp = (Map<String, Object>) session.getAttribute("emp");
        String empId = (String) emp.get("emp_id");
        advanceAdjustmentVerify.setEmpId(empId);
        System.out.println(taskId);
        System.out.println(advanceAdjustmentVerify);
        return advanceAdjustmentVerifyService.insertAdvanceAdjustment(advanceAdjustmentVerify, taskId);
    }
}
