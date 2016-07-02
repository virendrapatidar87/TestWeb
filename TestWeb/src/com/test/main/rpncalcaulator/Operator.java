/**
 * 
 */
package com.test.main.rpncalcaulator;

import java.util.Stack;


/**
 * @author Virendra.Patidar
 *
 */
public interface Operator {
	
	public Object operation(Object... listObjects);
	public Object operation(Stack<Object> stack);
}
