package in.problems.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static int romanToInt(String s) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res=0,prev=0;
		for(int i=s.length()-1;i>=0;i--) {
			int curr=map.get(s.charAt(i));
			if(curr<prev) {
				res -=curr;
			}else{
				res +=curr;
			}
			prev=curr;
		}
		
		return res;
	}

	public static void main(String[] args) {
		System.out.println(RomanToInteger.romanToInt("MCMXCIV"));
	}

}
