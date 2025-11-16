package in.problems.code.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import in.problems.code.commons.UserInput;

public class CountCharacterOccurance {
	public static Map<Character, Integer> charOccurance(String str) {
		str=str.replaceAll("\\s", "");
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			} else {
				charCount.put(c, 1);
			}
		}

		return charCount;
	}
	
	public static Map<Character, Long> charOccuranceByJava8(String str) {
	    return str.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(c-> c,Collectors.counting()));
	    }

	public static void main(String[] args) {
		charOccuranceByJava8(UserInput.getStringSentenceInput()).forEach((k, v) -> System.out.println(k + "=" + v));

	}

}
