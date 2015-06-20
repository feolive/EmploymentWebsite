package com.charmyin.other;

import java.util.ArrayList;

import org.junit.Test;

import com.charmyin.employment.service.BaseService;
import com.charmyin.employment.service.Impl.NewsServiceImpl;


public class TestBase {

	@Test
	public void TestType(){
		BaseService<NewsServiceImpl> base = new BaseService<NewsServiceImpl>();
		
		base.getIns(NewsServiceImpl.class);
		
	}
	
}
