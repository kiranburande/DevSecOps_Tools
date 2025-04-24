package com.kiran.main;

public class TestOwnJar 
{
	public static void main(String[] args) 
	{
		Arithmetic arithmetic = new Arithmetic();
		
		int sum = arithmetic.doSum(20, 34);
		System.out.println(sum);
	}
}
