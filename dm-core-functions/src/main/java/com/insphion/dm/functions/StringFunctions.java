package com.insphion.dm.functions;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String Utility Functions for rules
 */
public class StringFunctions {

	public static BigDecimal LEN(String string) {
		if (string == null) {
			return BigDecimal.ZERO;
		}

		return new BigDecimal(string.length());
	}

	public static String CONCATENATE(List<String> strings) {
		if (strings == null) {
			return new String();
		}

		StringBuilder sb = new StringBuilder();
		for (Object s : strings) {

			// special check if we need to treat null as zero
			if (s == null) {
				continue;
			}
			String temp = (String) s.toString();
			sb.append(temp);
		}
		return sb.toString();
	}

	public static String UPPER(Object string) {
		if (string == null) {
			return new String();
		}
		String temp = (String) string.toString();
		return temp.toUpperCase();
	}

	public static String TRIM(String string) {
		if (string != null) {
			return string.trim();
		}
		return "";
	}

	public static String IS_NUMERIC(String string) {
		if (string == null) {
			return "false";
		}
		String rv = "false";

		// this is a float number with decimal. can have commas in non
		// fractional part
		Pattern p1 = Pattern.compile("[-+]?[0-9,]+[.][0-9]+[0-9]*");

		Matcher m1 = p1.matcher(string);

		if (m1.matches())
			rv = "true";

		// or a integral number without decimal point, can have commas in non
		// fractional part
		if (!Boolean.parseBoolean(rv)) {
			Pattern p2 = Pattern.compile("[-+]?[0-9,]+");
			Matcher m2 = p2.matcher(string);

			if (m2.matches())
				rv = "true";
		}
		return rv;
	}

	public static String NO_VALUE_TEXT() {
		return null;
	}

}
