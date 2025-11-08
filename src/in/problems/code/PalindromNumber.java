package in.problems.code;

import in.problems.code.commons.UserInput;

public class PalindromNumber {

	public static int palindromNumber(int num) {
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
//			System.out.println("following opertion digit generated :" + digit);
			rev= rev * 10 + digit;
//			System.out.println("following opertion reverse generated :" + rev);
			num /= 10;
//			System.out.println("following opertion reverse generated :" + num);
		}
		System.out.println("following opertion reverse generated :" + rev);
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("Enter Number to check Palindrom :");
		int input = UserInput.getIntegerInput();
		if (input == palindromNumber(input)) {
			System.out.println(input + " : palindrom Number");
		} else {
			System.out.println(input + " : is not a palindrom Number");
		}
	}
}
