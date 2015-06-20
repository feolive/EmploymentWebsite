package com.charmyin.employment.dao;

import com.charmyin.employment.model.NewsImg;

public interface NewsImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsImg record);

    int insertSelective(NewsImg record);

    NewsImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsImg record);

    int updateByPrimaryKey(NewsImg record);
}