package com.charmyin.employment.dao;

import com.charmyin.employment.model.WorkDesc;

public interface WorkDescMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkDesc record);

    int insertSelective(WorkDesc record);

    WorkDesc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkDesc record);

    int updateByPrimaryKey(WorkDesc record);
}