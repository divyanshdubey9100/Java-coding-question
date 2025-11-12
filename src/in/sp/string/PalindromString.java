package in.sp.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class PalindromString {

	private static boolean isPalindrom(String str) {
		int left = 0, right = str.length()-1;
		if (str == null || str == "")
			return false;
			while (left < right) {
				if (str.charAt(left) != str.charAt(right)) {
					return false;
				}
				left ++;
				right --;
			}
			return true;

	}
	
	private static void firstNonRepeatingChar(String str) {
		str=str.toLowerCase();
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char ch:str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch:str.toCharArray()) {
			if(map.get(ch)==1){
				System.out.println(ch);
				return ;
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		System.out.println(PalindromString.isPalindrom("hellolleh"));
		PalindromString.firstNonRepeatingChar("hhhEllO");
		

	}

}
