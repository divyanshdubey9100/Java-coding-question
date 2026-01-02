package in.problems.java8;

import java.util.List;
import java.util.stream.Collectors;

import in.problems.code.commons.UserInput;

public class CovertStringToUpperCase {
	
	public static String doConversionToUpperCase(List<String> list) {
		return list.stream()
	               .map(s -> s.toUpperCase())
	               .collect(Collectors.joining(", "));
	}
	public static void main(String[] args) {
		System.out.println(doConversionToUpperCase(UserInput.listStringUserInput()));
	}
}