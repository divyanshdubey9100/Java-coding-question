package in.problems.code.numbers;

public class FibonacciSeries {
	public static void fibonacci(int count) {
		int first =0,second =1;
		System.out.println("Fibonacci series upto count :"+count );
		for(int i=0;i<count;i++) {
			System.out.println(first+" ");
			int next=first + second;
			first =second;
			second=next;
		}
	}
	public static void main(String[] args) {
		FibonacciSeries.fibonacci(15);
	}
}
