package in.problems.leetcode.easy;

import java.util.Arrays;

import in.problems.code.commons.UserInput;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
		StringBuilder builder=new StringBuilder();
		if(strs==null || strs.length==0)return "";
		Arrays.sort(strs);
		UserInput.traverseStringArray(strs);//printing sorted array
		char[] prev=strs[0].toCharArray();// prev = first string
		char[] last = strs[strs.length - 1].toCharArray(); // last = last string
		for (int i = 0; i < prev.length && i < last.length; i++) {
            if (prev[i] != last[i]) {	//If characters differ → stop the loop -> 
            	break;				//Because the prefix ends where characters start to differ.
            }
			builder.append(prev[i]);
		}
		System.out.println("response : "+builder.toString());
		return builder.toString();
	}

	public static void main(String[] args) {
		String[] strs= {"flower","flow","flight"};
		String res=longestCommonPrefix(strs) ;
		if(res.length() != 0) {
			System.out.println(res);
		}else {
			System.out.println("There is no common prefix among the input strings."+res);
		}
		

	}

}
