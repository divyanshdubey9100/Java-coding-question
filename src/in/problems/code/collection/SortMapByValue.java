package in.problems.code.collection;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import in.problems.code.commons.UserInput;

public class SortMapByValue {

	private static Map<Integer, Integer> doSortMapByValuesInReverseOrder(Map<Integer, Integer> map) {
		
		return map.entrySet()
	            .stream()
	            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
	            .collect(Collectors.toMap(
	                    Map.Entry::getKey,
	                    Map.Entry::getValue,
	                    (e1, e2) -> e1,
	                    LinkedHashMap::new
	            ));
	}
	


	private static Map<Integer, Integer> doSortMapByValues(Map<Integer, Integer> map) {
		
		return map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1,e2) ->e1,
						LinkedHashMap::new));
	}

	public static void main(String[] args) {
		UserInput.traverseMapOfIntegers(doSortMapByValues(UserInput.mapUserInput()));//ascending
		
		UserInput.traverseMapOfIntegers(doSortMapByValuesInReverseOrder(UserInput.mapUserInput()));//descending

	}

}
