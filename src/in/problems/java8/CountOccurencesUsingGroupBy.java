package in.problems.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurencesUsingGroupBy {

	public static  Map<String, Long> doCountOccurencesUsingGroupBy(List<String> list) {
		return list.stream().collect(Collectors.groupingBy(str->str,
				Collectors.counting()));
	}
	public static void main(String[] args) {
		List<String> words = Arrays.asList(
		        "apple", "banana", "apple", "orange", "banana", "apple"
		);
		
		Map<String, Long> word=doCountOccurencesUsingGroupBy(words);
		word.forEach((str, l) -> System.out.println(str + " " + l));

	}
}
