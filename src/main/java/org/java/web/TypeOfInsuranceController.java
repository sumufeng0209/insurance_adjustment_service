package org.java.web;

import org.java.entity.TypeOfInsurance;
import org.java.service.TypeOfInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TypeOfInsuranceController {

    @Autowired
    private TypeOfInsuranceService typeOfInsuranceService;

    @RequestMapping("/typeof/findAll")
    @ResponseBody
    public List<TypeOfInsurance> findAll(){
        return typeOfInsuranceService.findAll();
    }



}
