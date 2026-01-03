package in.problems.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ListToMapConversionUsingStream {
	public static Map<Integer,Integer> convertListToMap(List<Integer> list){
		AtomicInteger key=new AtomicInteger();
		return list.stream().collect(Collectors.toMap(k->key.getAndIncrement(), e->e));
	}
	public static int doSumOfListUsingReduce(List<Integer> list) {
		return list.stream().reduce(0,(a,b)->a+b);
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30);
		Map<Integer,Integer> map=convertListToMap(list);
		map.forEach((i1,i2)->{System.out.println(i1+" "+i2);});
		System.out.println("Sum: "+doSumOfListUsingReduce(list));
	}
}
