package in.problems.code.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import in.problems.code.commons.UserInput;

public class ListToMapConversion {
	public static Map<Integer, Integer> doConvertListToMapJava8(List<Integer> list){
		//alternate method
				AtomicInteger index = new AtomicInteger(1);
//for index.getAndIncrement()
//				return list.stream()
//				        .collect(Collectors.toMap(
//				                i -> index.getAndIncrement(),   // unique key
//				                i -> i
//				        ));

		return list.stream().collect(Collectors.toMap(i -> i, j -> j));
	}
	private static Map<Integer, Integer> doConvertListToMap(List<Integer> list) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<list.size();i++) {
			map.put(i,list.get(i));
		}
		return map;
	}
	
	public static void main(String[] args) {
		UserInput.traverseMapOfIntegers(doConvertListToMap(UserInput.listUserInput()));
	}

}
