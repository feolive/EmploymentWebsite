package com.charmyin.employment.dao;

import com.charmyin.employment.model.JobPublish;

public interface JobPublishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobPublish record);

    int insertSelective(JobPublish record);

    JobPublish selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobPublish record);

    int updateByPrimaryKey(JobPublish record);
}