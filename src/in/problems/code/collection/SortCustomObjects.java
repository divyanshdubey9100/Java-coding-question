package in.problems.code.collection;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import in.problems.code.commons.Employee;

public class SortCustomObjects{

	public static List<Employee> doCustomSort(List<Employee> employees) {
//		return Collections.sort(employees, new Comparator<Employee>() {		//alternate metodh
//			public int compare(Employee e1, Employee e2) {
//				e1.getName().compareTo(e2.getName());
//			}
//		});
//		employees.sort(Comparator.comparingInt(Employee::getId));  //compare id
		employees.sort(Comparator.comparingDouble(Employee::getSalary));//compare salary
		return employees;
		
	}

	public static void main(String[] args) {
		 List<Employee> employees = Arrays.asList(
		            new Employee(3, "Alice", 60000),
		            new Employee(1, "John", 50000),
		            new Employee(2, "Bob", 70000)
		        );
		for(Employee e:doCustomSort(employees)) {
			System.out.println(e);
		}
	}
}
