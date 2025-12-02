package in.problems.code.string;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingChar {

	public static void nonRepeatingChar(String str) {
		str = str.toLowerCase();
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
		}

		for (char ch : str.toCharArray()) {
			if (charMap.get(ch) == 1) {
				System.out.println("first not repeating char: " + ch);
				return;
			}
		}
		System.out.println("No non-repeating character found.");
	}

	public static int longestSubstring(String str) {
		int left=0,max=0;
		str=str.toLowerCase();
		Set<Character> set=new LinkedHashSet<>();
		for(int right=0;right < str.length();right++) {
			while(set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left ++;
			}
			set.add(str.charAt(right));
			max=Math.max(max, right - left + 1);
		}
		
		for(char ch:set) {
			System.out.print(ch+",");
		}
				
		return max;
	}

	public static void main(String[] args) {
		nonRepeatingChar("missmarry");
		
		System.out.println(longestSubstring("missmarry"));

	}

}
