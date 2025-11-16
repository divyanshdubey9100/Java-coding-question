package in.problems.code;

import in.problems.code.commons.UserInput;

public class SwapNumberWithoutThirdVar {
	
	public static int[] swapWithout3rdvar(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		return new int[] {a,b};
	}

	public static void main(String[] args) {
		int[] result=swapWithout3rdvar(UserInput.getIntegerInput(),UserInput.getIntegerInput());
		System.out.println("a :"+result[0]+" b :"+result[1]);

	}

}
