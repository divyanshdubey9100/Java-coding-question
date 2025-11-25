package in.sp.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
	
	public static void isDuplicate(String str) {
		Set<Character> charSet=new LinkedHashSet<Character>();
		for(char ch: str.toCharArray()) {
			charSet.add(ch);
		}
		
		StringBuilder result=new StringBuilder();
		for(char ch: charSet) {
			result.append(ch);
		}
		
		System.out.println("old string "+str);
		System.out.println("new String "+result.toString());
	}
	public static void main(String[] args) {
		isDuplicate("homesweethome");
	}

}
