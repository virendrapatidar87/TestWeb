/**
 * 
 */
package com.test.main.operators;

import java.util.Stack;

import com.test.main.rpncalcaulator.BinaryOperator;

/**
 * @author Virendra.Patidar
 * 
 */
public class PlusOperator implements BinaryOperator {

	
	@Override
	public Object operation(Object... listObjects) {

		Double result = 0.0;
		for (int i = 0; i < listObjects.length; i++) {

			result = result + (Double) listObjects[i];
		}

		return result;
	}

	@Override
	public Object operation(Stack<Object> stack) {
		Double result = 0.0;
		Double first_value = (Double) stack.pop();
		Double second_value = (Double) stack.pop();

		result = first_value + second_value;

		stack.push(result);
		return result;
	}

}
