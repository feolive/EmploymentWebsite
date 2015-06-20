package com.charmyin.employment.dao;

import com.charmyin.employment.model.WorkExp;

public interface WorkExpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkExp record);

    int insertSelective(WorkExp record);

    WorkExp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkExp record);

    int updateByPrimaryKey(WorkExp record);
}