package in.problems.code.string;

import in.problems.code.commons.UserInput;

public class CountWordsInString {
	public static int doCountWords(String str) {
		if(str==null || str.length()<1 || str.trim().isEmpty())return 0;
		String[] words=str.trim().split("\\s+");
		
		return words.length;
	}
	public static void main(String[] args) {
		System.out.println(doCountWords(UserInput.getStringSentenceInput()));
	}

}
