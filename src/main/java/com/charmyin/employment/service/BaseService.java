package com.charmyin.employment.service;

import org.junit.Test;

import com.charmyin.employment.service.Impl.NewsServiceImpl;


public class BaseService<T> {
	
	private T service;
	
	public void getIns(Class<T> clazz){
		if(clazz!=null){
			System.out.println("这不是一个空值："+clazz.toString());
		}else{
		System.out.println("发的撒发顺丰");
		}
	}
	
	public int insert(){
		
		return 0;
	}
	
	public int delete(){
		return 0;
	}
	
	
}
