package com.kiran.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TestApp1 
{
	Logger logger = Logger.getLogger(getClass().getName());
	public void m1() {
		logger.info("TestApp1.m1()");
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(null);
		list.add(40);
		
	}
	public void m2()
	{
		logger.info("TestApp1.m2()");
	}
	
	public static void main(String[] args) 
	{
		TestApp1 app = new TestApp1();
		app.m1();
	}
}
