package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.TypeOfInsurance;

import java.util.List;

@Mapper
public interface TypeOfInsuranceMapper {
    int deleteByPrimaryKey(String insuranceId);

    int insert(TypeOfInsurance record);

    int insertSelective(TypeOfInsurance record);

    TypeOfInsurance selectByPrimaryKey(String insuranceId);

    int updateByPrimaryKeySelective(TypeOfInsurance record);

    int updateByPrimaryKey(TypeOfInsurance record);

    public List<TypeOfInsurance> findAll();
}