package in.problems.code;

import java.util.Arrays;

import in.problems.code.commons.UserInput;

public class CheckAnagram {
	
	public static boolean findAnagram(String s1,String s2) {
		s1=s1.replaceAll("\\s","").toLowerCase();
		s2=s2.replaceAll("\\s","").toLowerCase();
		if(s1.length() != s2.length()) return false;
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}

	public static void main(String[] args) {
		System.out.println(findAnagram(UserInput.getStringInput(), UserInput.getStringInput()));

	}

}
