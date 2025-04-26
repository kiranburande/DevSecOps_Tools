package com.kiran.main;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
    @Test
    public void testSumWithPositives() {
    	
    	int val1 = 10;
    	int val2 = 20;
    	int expected = 30;
    	
    	App app = new App();
    	int actual = app.sum(val1, val2);
    	
    	assertEquals(expected , actual);
        
    }
    @Test
    public void testSumWithNegatives() {
    	
    	int val1 = -10;
    	int val2 = -20;
    	int expected = -30;
    	
    	App app = new App();
    	int actual = app.sum(val1, val2);
    	
    	assertEquals(expected , actual);
        
    }
    
    @Test
    public void testSumWithPositiveAndNegative() {
    	
    	int val1 = 10;
    	int val2 = -20;
    	int expected = -10;
    	
    	App app = new App();
    	int actual = app.sum(val1, val2);
    	
    	assertEquals(expected , actual);
        
    }
    @Test
    public void testSumWithZeros() {
    	
    	int val1 = 0;
    	int val2 = 0;
    	int expected = 0;
    	
    	App app = new App();
    	int actual = app.sum(val1, val2);
    	
    	assertEquals(expected , actual);
        
    }
    
}
