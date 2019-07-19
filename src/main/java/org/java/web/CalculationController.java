package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *待理算控制器
 */
@Controller
public class CalculationController {

    @RequestMapping("/cal/init")
    public String init(){
        return "/calculation/agencyCalculation";
    }
}
