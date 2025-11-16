package in.problems.code.commons;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserInput {
	
	public static Scanner getUserInput() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("UserInput Request Initiated...");
		return scanner;
	}
	
	public static int getIntegerInput() {
		Scanner sc=getUserInput();
		System.out.println("Enter Integer Number: ");
		return sc.nextInt();
	}
	
	public static String getStringInput() {
		Scanner sc=getUserInput();
		System.out.println("Enter String: ");
		return sc.next();
	}
	
	public static String getStringSentenceInput() {
		Scanner sc=getUserInput();
		System.out.println("Enter Complete Sentance: ");
		return sc.nextLine();
	}
	
	public static long getLongInput() {
		Scanner sc=getUserInput();
		System.out.println("Enter Long Number: ");
		return sc.nextLong();
	}
	
	public static int[] getArrayInput() {
        System.out.print("Enter the size of the array: ");
        int size = getIntegerInput();

        int[] array = new int[size];
        System.out.println("Enter " + size + " integer values:");

        for (int i = 0; i < size; i++) {
        	System.out.print("Arr["+i+"] : ");
            array[i] = getIntegerInput();
        }
        return array;
    }
	
	public static List<Integer> arrToListConversion(int[] arr){
		System.out.println("Array Converted to List<Integer>: ");
		return Arrays.stream(arr).boxed().collect(Collectors.toList());
	}
	
	public static List<Integer> listUserInput(){
		System.out.println("List userInput: ");
		return Arrays.stream(getArrayInput())
                .boxed()
                .collect(Collectors.toList());
	}
	
	
}
