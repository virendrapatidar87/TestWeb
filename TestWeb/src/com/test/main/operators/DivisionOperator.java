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
public class DivisionOperator implements BinaryOperator {

	@Override
	public Object operation(Object... listObjects) {
		Double result = 1.0;
		for (int i = listObjects.length - 1; i >= 0; i--) {

			result = (Double) listObjects[i] / result;

		}

		return result;
	}

	@Override
	public Object operation(Stack<Object> stack) {
		Double result = 0.0;
		Double first_value = (Double) stack.pop();
		Double second_value = (Double) stack.pop();

		result = first_value / second_value;

		stack.push(result);
		return result;
	}

}
