package in.problems.code.corejava;

import in.problems.code.commons.UserInput;

public class FibonacciSeries {
	
	public static void fibonacciSeries(int n) {
		int first=0,second=1;
		System.out.print("fibonacci Series : "+first+" + "+second);
		for(int i=2;i<n;i++) {
			int next=first + second;
			System.out.print(" + "+next);
			first=second;
			second=next;
		}
	}
	
	public static void recursiveMethod(int n) {
	    for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
	}

	

	private static int fibonacci(int n) {
		if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		System.out.println("Enter no pf term to generate series: ");
		fibonacciSeries(UserInput.getIntegerInput());

	}

}
