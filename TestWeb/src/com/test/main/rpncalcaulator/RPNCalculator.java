package com.test.main.rpncalcaulator;

import java.util.Properties;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RPNCalculator {
	public Object eveluate(String input) throws InstantiationException,
			IllegalAccessException {
		int length = input.length();
		int midPoint = length / 2;

		String valueStrArr[] = input.split(",");

		Object result = 0;
		Stack<Object> numberStack = new Stack<Object>();
		Properties properties = new Properties();

		properties.setProperty("+","com.test.main.operators.PlusOperator");
		properties.setProperty("-","com.test.main.operators.MinusOperator");
		properties.setProperty("*","com.test.main.operators.MultiplicationOperator");
		properties.setProperty("/","com.test.main.operators.DivisionOperator");
		properties.setProperty("!","com.test.main.operators.ModulusOperator");
		for (int i = 0; i < valueStrArr.length; i++) {

			if (!properties.containsKey(valueStrArr[i])){
				numberStack.push(Double.parseDouble(valueStrArr[i]));
			} else {

				String className = properties.getProperty(valueStrArr[i]);
				try {

					Class<?> operator2 = this.getClass().getClassLoader()
							.loadClass(className);
					Operator operator3 = (Operator) operator2.newInstance();
					/*result = operator3.operation(numberStack.pop(),numberStack.pop());
					numberStack.push(result);*/
					result =	operator3.operation(numberStack);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

			}
		}

		return result;
	}

	private static boolean validateQueryParamForVarchar(String param,
			String queryParamRegex) {

		boolean flag = false;
		try {

			if (queryParamRegex != null) {
				Pattern useCharPattern = Pattern.compile(queryParamRegex);
				Matcher mtch = useCharPattern.matcher(param);
				flag = mtch.find();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
