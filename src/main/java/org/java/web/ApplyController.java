package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 申请控制器
 */
@Controller
public class ApplyController {

    @RequestMapping("/apply/init")
    public String init(){
        return "/apply/apply";
    }
}
