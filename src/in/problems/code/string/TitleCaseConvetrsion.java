package in.problems.code.string;

import in.problems.code.commons.UserInput;

public class TitleCaseConvetrsion {

	public static String doConversion(String str) {
		StringBuilder sb=new StringBuilder();
		if(str==null || str.length() < 1)return null;
		String[] words=str.trim().split("\\s+");
		for(String s:words) {
			sb.append(Character.toUpperCase(s.charAt(0)))
			.append(s.substring(1)).append(" ");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(doConversion(UserInput.getStringSentenceInput()));
	}
}
