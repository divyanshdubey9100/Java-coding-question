package in.sp.string;

import java.util.Scanner;

public class StringComparision {
	private static String stringComparision(String s) {
		if(s.isEmpty() || s.contains(null)) {
			return "";
		}
		StringBuilder sb=new StringBuilder();
		char prev=s.charAt(0);
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("Input String .. : "+input);
		System.out.println("replaced String : "+stringComparision(input));

	}

	

}
