package in.problems.code;

import in.problems.code.commons.UserInput;

public class ReverseString {
	
	public static String reverseString(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev += s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
//		String s=UserInput.getStringInput();
		System.out.println("Enter String to reverse : ");
		System.out.println(reverseString(UserInput.getStringInput()));

	}

}
