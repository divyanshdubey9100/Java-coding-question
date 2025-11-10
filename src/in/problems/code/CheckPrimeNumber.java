package in.problems.code;

import java.util.stream.IntStream;

import in.problems.code.commons.UserInput;

public class CheckPrimeNumber {
	public static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n % i==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPrimeByStream(int n) {
		return n > 1 && IntStream.rangeClosed(2,  (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
	}

	public static void main(String[] args) {
		System.out.println("Enter no to find Prime : ");
//		System.out.println("is Prime !! "+isPrime(UserInput.getIntegerInput()));
		System.out.println("is Prime !! "+isPrimeByStream(UserInput.getIntegerInput()));

	}

}
