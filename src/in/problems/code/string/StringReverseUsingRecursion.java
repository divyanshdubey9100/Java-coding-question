package in.problems.code.string;

import in.problems.code.commons.UserInput;

public class StringReverseUsingRecursion {
	
	private static String doReverse(String str) {
		if(str == null || str.length() < 1) {
			return str;
		}
		return doReverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String inputStr=UserInput.getStringInput();
		System.out.println(doReverse(inputStr));
//		System.out.println("subString "+inputStr.substring(1));
	}
}
