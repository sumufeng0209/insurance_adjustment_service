package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 核赔页面
 */@Controller
public class CompensationController {

    @RequestMapping("/com/init")
    public String init(){

        return "/compensation/nuclearCompensation";
    }
}
