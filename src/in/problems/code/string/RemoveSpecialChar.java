package in.problems.code.string;

import in.problems.code.commons.UserInput;

public class RemoveSpecialChar {

	public static String doReplaceSpecialCharacter(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
	}
	public static void main(String[] args) {
		System.out.println(doReplaceSpecialCharacter(UserInput.getStringSentenceInput()));
	}
}
