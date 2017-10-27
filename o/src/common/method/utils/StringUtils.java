package common.method.utils;

import java.util.List;

public class StringUtils {

	public static boolean isMoreThanOneChar(String text) {
		return text.length() > 1 ? true : false;
	}

	/**
	 * 
	 * @param stringList
	 * @return String String element appended in order. 
	 * 
	 */
	public static String mergeOrderedString(List<String> stringList) {
		if (stringList.isEmpty())
			throw new IllegalArgumentException("stringList should not be empty");
		// instantiate StringBuffer with empty String.
		StringBuffer mergedString = new StringBuffer("");
		for (String s : stringList) {
			// TODO decide whether manipulation on each String element is to be done in this method or not.
			mergedString.append(s.trim());
			
		}

		return mergedString.toString();
	}

}
