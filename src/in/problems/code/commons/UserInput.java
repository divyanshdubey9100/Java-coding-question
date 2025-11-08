package in.problems.code.commons;

import java.util.Scanner;

public class UserInput {
	
	public static Scanner getUserInput() {
		Scanner scanner=new Scanner(System.in);
		return scanner;
	}
	
	public static int getIntegerInput() {
		Scanner sc=getUserInput();
		return sc.nextInt();
	}
	
	public static String getStringInput() {
		Scanner sc=getUserInput();
		return sc.next();
	}
	
	public static String getStringSentenceInput() {
		Scanner sc=getUserInput();
		return sc.nextLine();
	}
	
	public static long getLongInput() {
		Scanner sc=getUserInput();
		return sc.nextLong();
	}
	
	
}
