package org.java.service.impl;

import org.java.dao.TypeOfInsuranceMapper;
import org.java.entity.TypeOfInsurance;
import org.java.service.TypeOfInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfInsuranceServiceImpl implements TypeOfInsuranceService {



    @Autowired
    private TypeOfInsuranceMapper typeOfInsuranceMapper;


    @Override
    public List<TypeOfInsurance> findAll() {
        return typeOfInsuranceMapper.findAll();
    }
}
