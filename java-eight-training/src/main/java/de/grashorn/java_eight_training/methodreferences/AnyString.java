package de.grashorn.java_eight_training.methodreferences;

public class AnyString {

	/**
	 * Returns the first char of the given {@link String}
	 * 
	 * @param s
	 * @return
	 */
	String startsWith(String s) {
		return String.valueOf(s.charAt(0));
	}

	/**
	 *  Returns the last char of the given {@link String}
	 * @param s
	 * @return
	 */
	String endsWith(String s) {
		return String.valueOf(s.charAt(s.length() - 1));

	}
}
