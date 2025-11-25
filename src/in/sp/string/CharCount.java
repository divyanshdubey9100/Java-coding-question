package in.sp.string;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	
	public static void findCharCount(String str) {
		Map<Character,Integer> charFrequencyMap=new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			if(charFrequencyMap.containsKey(ch)) {
				charFrequencyMap.put(ch, charFrequencyMap.get(ch) + 1);
			}else {
				charFrequencyMap.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> map:charFrequencyMap.entrySet()) {
			if(Character.isWhitespace(map.getKey())) {
				System.out.println("whitespaces found : "+map.getValue());
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		findCharCount("home sweet home hello dear brother how are you");
	}

}
