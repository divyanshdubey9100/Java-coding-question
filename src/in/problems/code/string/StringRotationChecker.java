package in.problems.code.string;

import in.problems.code.commons.UserInput;

public class StringRotationChecker {
	public static boolean isRotation(String s1,String s2) {
		if(s1== null || s2==null || s1.length() != s2.length()) {
			return false;
		}
		String combined= s1+s1;
		return combined.contains(s2);
	}
	public static void main(String[] args) {
		System.out.println(isRotation(UserInput.getStringInput(), UserInput.getStringInput()));
	}
}
