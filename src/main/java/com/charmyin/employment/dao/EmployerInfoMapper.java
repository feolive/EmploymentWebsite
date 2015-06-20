package com.charmyin.employment.dao;

import com.charmyin.employment.model.EmployerInfo;

public interface EmployerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployerInfo record);

    int insertSelective(EmployerInfo record);

    EmployerInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployerInfo record);

    int updateByPrimaryKey(EmployerInfo record);
}