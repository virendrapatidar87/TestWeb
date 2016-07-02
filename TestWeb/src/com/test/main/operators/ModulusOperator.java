package com.test.main.operators;

import java.util.Stack;

import com.test.main.rpncalcaulator.BinaryOperator;

public class ModulusOperator implements BinaryOperator {

	@Override
	public Object operation(Object... listObjects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object operation(Stack<Object> stack) {

		Double value = (Double) stack.pop();
		Double result = 1.0;
		for (int i = 1; i <=value; i++) {
result = result*i;
		}
		
		stack.push(result);
	return result;
	}

}
