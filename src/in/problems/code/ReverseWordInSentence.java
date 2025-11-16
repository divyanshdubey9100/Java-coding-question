package in.problems.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import in.problems.code.commons.UserInput;

public class ReverseWordInSentence {
	public static String doReverseWordInSentence(String str) {
		String[] words = str.trim().split("\\s+");
	    StringBuilder sb = new StringBuilder();

	    for (int i = words.length - 1; i >= 0; i--) {
	        sb.append(words[i]).append(" ");
	    }

	    return sb.toString().trim();
	}
	
	public static String doReverseWordInSentenceJava8(String str) {
		List<String> list=Arrays.asList(str.trim().split("\\s+"));
		Collections.reverse(list);
		
	    return String.join(" ", list);
	}

	public static void main(String[] args) {
		System.out.println(doReverseWordInSentenceJava8(UserInput.getStringSentenceInput()));

	}

}
