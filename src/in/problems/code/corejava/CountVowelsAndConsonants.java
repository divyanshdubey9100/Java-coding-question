package in.problems.code.corejava;

import in.problems.code.commons.UserInput;

public class CountVowelsAndConsonants {
	
	public static int[] countVowelsAndConsonants(String str) {
		int vowelsCount=0,consonantCount=0;
		String vowels="aeiouAEIOU";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetter(ch)) {
				if(vowels.indexOf(ch) !=-1) {
					vowelsCount++;
				}else {
					consonantCount ++;
				}
			}
		}
		return new int[] {vowelsCount,consonantCount};
	}

	public static void main(String[] args) {
		int[] result=countVowelsAndConsonants(UserInput.getStringSentenceInput());
		System.out.println("Vowels :"+result[0]+" Consonants :"+result[1]);

	}

}
