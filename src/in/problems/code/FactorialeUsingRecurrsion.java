package in.problems.code;

import in.problems.code.commons.UserInput;

public class FactorialeUsingRecurrsion {
	
	public static long factorial(long n) {
		if(n==0 || n==1)
			return 1;
		return n * factorial(n-1);
	}

	public static void main(String[] args) {
		System.out.println("Enter Integer No to find factorial :");
		System.out.println(factorial(UserInput.getLongInput()));

	}

}
