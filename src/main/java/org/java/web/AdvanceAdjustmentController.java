package org.java.web;

import org.java.entity.AdvanceAdjustment;
import org.java.service.AdvanceAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;


/**
 * 垫付理算控制器
 */
@Controller
public class AdvanceAdjustmentController {

    @Autowired
    private AdvanceAdjustmentService advanceAdjustmentService;

    @Autowired
    private HttpSession session;

    @RequestMapping("/insert/advanceAdjustment/{taskId}")
    @ResponseBody
    public String insertAdvanceAdjustment(AdvanceAdjustment advanceAdjustment, @PathVariable("taskId") String taskId){
        System.out.println(taskId);
        //差员工编号  赔案编号
        System.out.println(advanceAdjustment);
        Map<String,Object> user = (Map<String, Object>) session.getAttribute("emp");
        String empId = (String) user.get("emp_id");
        advanceAdjustment.setEmpId(empId);
        System.out.println(user);
        //差员工编号
        return advanceAdjustmentService.insertAdvanceAdjustment(advanceAdjustment,taskId);
    }


}
