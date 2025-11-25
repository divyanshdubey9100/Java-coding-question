package in.problems.code.corejava;

import in.problems.code.commons.UserInput;

public class DecimalToBinaryConversion {
	
	public static String doConversion(int num) {
		StringBuilder sb=new StringBuilder();
		while(num > 0) {
			int reminder=num % 2;
			sb.append(reminder);
			num=num/2;
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(doConversion(UserInput.getIntegerInput()));
		System.out.println("using Integer.toBinaryString : "+Integer.toBinaryString(UserInput.getIntegerInput())); //Using Integer.toBinaryString

	}

}
