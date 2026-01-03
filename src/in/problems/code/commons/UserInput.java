package in.problems.code.commons;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class UserInput {

	public static Scanner getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("UserInput Request Initiated...");
		return scanner;
	}

	public static int getIntegerInput() {
		Scanner sc = getUserInput();
		System.out.println("Enter Integer Number: ");
		return sc.nextInt();
	}

	public static String getStringInput() {
		Scanner sc = getUserInput();
		System.out.println("Enter String: ");
		return sc.next();
	}

	public static String getStringSentenceInput() {
		Scanner sc = getUserInput();
		System.out.println("Enter Complete Sentance: ");
		return sc.nextLine();
	}

	public static long getLongInput() {
		Scanner sc = getUserInput();
		System.out.println("Enter Long Number: ");
		return sc.nextLong();
	}

	public static int[] getArrayInput() {
		System.out.print("Enter the size of the array: ");
		int size = getIntegerInput();

		int[] array = new int[size];
		System.out.println("Enter " + size + " integer values:");

		for (int i = 0; i < size; i++) {
			System.out.print("Arr[" + i + "] : ");
			array[i] = getIntegerInput();
		}
		return array;
	}

	public static List<Integer> arrToListConversion(int[] arr) {
		System.out.println("Array Converted to List<Integer>: ");
		return Arrays.stream(arr).boxed().collect(Collectors.toList());
	}

	public static List<Integer> listUserInput() {
		System.out.println("List userInput: ");
		return Arrays.stream(getArrayInput()).boxed().collect(Collectors.toList());
	}

	public static void traverseListOfIntegers(List<Integer> list) {
		System.out.println("Traversing List<Integer>: ");
		list.stream().forEach(System.out::println);
	}

	public static void traverseMapOfIntegers(Map<Integer, Integer> map) {
		System.out.println("Traversing Map<Integer, Integer>: ");
		map.forEach((key, value) -> System.out.println(key + " = " + value));
	}

	public static Map<Integer, Integer> mapUserInput() {
		Scanner sc = getUserInput();

		System.out.print("Enter number of entries in the Map: ");
		int size = sc.nextInt();

		Map<Integer, Integer> map = new java.util.HashMap<>();

		System.out.println("Enter " + size + " key-value pairs (Integer key and Integer value):");

		for (int i = 0; i < size; i++) {
			System.out.print("Key " + (i + 1) + ": ");
			int key = sc.nextInt();

			System.out.print("Value " + (i + 1) + ": ");
			int value = sc.nextInt();

			// Prevent overwriting if key already exists
			if (map.containsKey(key)) {
				System.out.println("⚠️ Key already exists! Overwriting the old value.");
			}

			map.put(key, value);
		}

		return map;
	}

	public static void traverseArrayOfInt(int[] arr) {
		System.out.println("Traversing Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arr[" + i + "] = " + arr[i]);
		}
	}

	public static void traverseStringArray(String[] arr) {
		System.out.println("Traversing String Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arr[" + i + "] = " + arr[i]);
		}
	}

	public static void traverseCharArray(char[] arr) {
		System.out.println("Traversing Char Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arr[" + i + "] = " + arr[i]);
		}
	}

	public static List<String> listStringUserInput() {
		Scanner sc = getUserInput();

		System.out.print("Enter number of elements in the List<String>: ");
		int size = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		List<String> list = new java.util.ArrayList<>();

		System.out.println("Enter " + size + " string values:");

		for (int i = 0; i < size; i++) {
			System.out.print("Element " + i + ": ");
			list.add(sc.nextLine());
		}

		return list;
	}

	public static void traverseListOfStringsStream(List<String> list) {
		System.out.println("Traversing List<String> (Stream):");
		list.forEach(System.out::println);
	}
}
