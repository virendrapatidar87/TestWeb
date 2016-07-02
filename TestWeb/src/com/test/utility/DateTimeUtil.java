/**
 * 
 */
package com.test.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Virendra.Patidar
 *
 */
public class DateTimeUtil {

	public static boolean checkDateFormat(String date) 
	{
		SimpleDateFormat format=new SimpleDateFormat("yyyy/mm/dd");
		try {
			format.parse(date);
			return true;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return false;
		}

	}
}