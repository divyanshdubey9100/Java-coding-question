package in.problems.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import in.problems.code.commons.Employee;
public class GroupEmployeesByDepartment {
	
	
	public static Map<String,List<Employee>> getEmployeeByDept(List<Employee> list) {
		return list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	}
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
		        new Employee(123,"Alice", 60000, "IT"),
		        new Employee(300,"Bob", 50000, "HR"),
		        new Employee(911,"Charlie", 70000, "IT"),
		        new Employee(512,"David", 55000, "HR"),
		        new Employee(789,"Eve", 65000, "Finance")
		);
		Map<String,List<Employee>> empByDept=getEmployeeByDept(employees);
		empByDept.forEach((dept, empList) -> {
		    System.out.println(dept + " -> " + empList.size());
		});
	}

}
