package com.charmyin.employment.dao;

import com.charmyin.employment.model.NewsLink;

public interface NewsLinkMapper {
    int insert(NewsLink record);

    int insertSelective(NewsLink record);
}