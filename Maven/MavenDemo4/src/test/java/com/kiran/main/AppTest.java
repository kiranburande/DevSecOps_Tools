package com.kiran.main;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class AppTest 
{
	public static Arithmetic arithmetic;
	
	@BeforeAll
	public static void initialTest()
	{
	 arithmetic = new Arithmetic();
	}
	
	@Test
	public void testWithPositives()
	{
		double var1 = 100.0;
		double var2 = 200.0;
		double expected = 300.0;
		double actual = arithmetic.sum(var1,var2);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithNegatives()
	{
		double var1 = -100.0;
		double var2 = -200.0;
		double expected = -300.0;
		double actual = arithmetic.sum(var1,var2);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithMixed()
	{
		double var1 = 100.0;
		double var2 = -200.0;
		double expected = -100.0;
		double actual = arithmetic.sum(var1,var2);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithZeros()
	{
		double var1 = 0;
		double var2 = 0;
		double expected = 0;
		double actual = arithmetic.sum(var1,var2);
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void testWithPositivesSub()
	{
		double var1 = 100.0;
		double var2 = 200.0;
		double expected = -100.0;
		double actual = arithmetic.sub(var1,var2);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithNegativesSub()
	{
		double var1 = -100.0;
		double var2 = -200.0;
		double expected = 100.0;
		double actual = arithmetic.sub(var1,var2);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithMixedSub()
	{
		double var1 = 100.0;
		double var2 = -200.0;
		double expected = 300.0;
		double actual = arithmetic.sub(var1,var2);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithZerosSub()
	{
		double var1 = 0;
		double var2 = 0;
		double expected = 0;
		double actual = arithmetic.sub(var1,var2);
		assertEquals(expected,actual);
	}
	
	
	@AfterAll
	public static void endTest()
	{
		arithmetic = null;
	}
}
