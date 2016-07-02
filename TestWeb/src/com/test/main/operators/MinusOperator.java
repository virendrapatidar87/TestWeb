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
public class MinusOperator implements BinaryOperator {

	@Override
	public Object operation(Object... listObjects) {
		Double result = 0.0;
		for (int i = 0; i < listObjects.length; i++) {
			if (result > (Double) listObjects[i]) {
				result = result - (Double) listObjects[i];
			} else {
				result = (Double) listObjects[i] - result;

			}
		}

		return result;
	}

	@Override
	public Object operation(Stack<Object> stack) {
		Double result = 0.0;
		Double first_value = (Double) stack.pop();
		Double second_value = (Double) stack.pop();
		if (first_value > second_value) {
			result = first_value - second_value;

		} else {
			result = second_value - first_value;
		}
		stack.push(result);
		return result;
	}

}
