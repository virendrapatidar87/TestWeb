package com.test.rpncalcaulator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.test.main.rpncalcaulator.RPNCalculator;

public class RPNTestSDDM 
{
	RPNCalculator rpnCalculator=new RPNCalculator();
	/*@Test
	public void testCaseCorrectLength() 
	{
		String input="2,5,5,2,2,+,-,*,/";
		int result=rpnCalculator.eveluate(input);
		assertEquals(0,result);
	}
	
	@Test
	public void testCaseIncorrectLength() 
	{
		String input="2,5,5,2,2,4,5,-,+,-,*,/,+";
		int result=rpnCalculator.eveluate(input);
		assertEquals(-1,result);
	}
	
	@Test
	public void testCaseEvenLength() 
	{
		String input="2,5,5,2,2,-,*,/";
		int result=rpnCalculator.eveluate(input);
		assertEquals(-1,result);
	}
	
	@Test
	public void testCaseOddString() 
	{
		String input="2,5,5,2,2,4,5,-,+,-,*,/,+";
		int result=rpnCalculator.eveluate(input);
		assertEquals(-1,result);
	}*/
	/*@Test
	public void shouldReturnIntValue() {
		String input="2,5,+";
		int result=rpnCalculator.eveluate(input);
		assertEquals(0,result);
	}*/
	
	/*@Test
	public void shouldReturnCalculateValue() {
		String input="2,5,+";
		int result=rpnCalculator.eveluate(input);
		assertEquals(7,result);
	}
	
	@Test
	public void shouldReturnCalculateValueForlargeString() {
		//String input="2,5,3,+,+";
		//String input="2,5,3,4,+,+,+";
		String input="2,5,3,4,8,+,+,+,-";
		
		int result=rpnCalculator.eveluate(input);
		assertEquals(18,result);
	}
	*/
/*	@Test
	public void shouldReturnCalculateValueForAllOperator() {
		//String input="2,5,3,+,+";
		//String input="2,5,3,4,+,+,+";
		String input="2,5,3,4,8,+,*,+,/";
		
		Object result=0;
		try {
			result = rpnCalculator.eveluate(input);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(20.5,result);
	}
	*/
	@Test
	public void modulusOperator() {
		//String input="2,5,3,+,+";
		//String input="2,5,3,4,+,+,+";
		String input="2,5,+,3,!,+";
		
		Object result=0;
		try {
			result = rpnCalculator.eveluate(input);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(13.0,result);
	}
	/*@Test
	public void powerUpOperator() {
		//String input="2,5,3,+,+";
		//String input="2,5,3,4,+,+,+";
		String input="2,5,+,3,3,^,+";
		
		Object result=0;
		try {
			result = rpnCalculator.eveluate(input);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(13.0,result);
	}*/
/*	@Test
	public void notCorrectExpression() {
		//String input="2,5,3,+,+";
		//String input="2,5,3,4,+,+,+";
		String input="2,5,+,3,4,8,*,+,-";
		
		int result=rpnCalculator.eveluate(input);
		assertEquals(-1,result);
	}*/
}
