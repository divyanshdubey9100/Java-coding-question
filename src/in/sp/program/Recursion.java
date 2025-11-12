package in.sp.program;

import java.util.Scanner;

public class Recursion {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fibonacci(n-1)+ fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter no to find : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int result = Recursion.factorial(n);
		for(int i=0;i<n;i++) {
			System.out.println(fibonacci(i));
		}
//		System.out.println("Factorial of : " + n + " : " + result);
		
		
	}
}
