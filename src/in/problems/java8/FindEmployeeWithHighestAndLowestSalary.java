package in.problems.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import in.problems.code.commons.Employee;

public class FindEmployeeWithHighestAndLowestSalary {
	
	public static Employee getHighestPaidEmployee(List<Employee> employee) {
		System.out.println("Lowest Paid Employee:"+getLowestPaidEmployee(employee));
		return employee.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
	}

	private static Employee getLowestPaidEmployee(List<Employee> employee) {
		return employee.stream().min(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
	}
	
	public static void main(String[] args) {
		List<Employee> team = Arrays.asList(
	            new Employee(123, "Alice", 50000),
	            new Employee(474, "Bob", 120000), // Max
	            new Employee(987, "Charlie", 90000)
	        );
		System.out.println("Highest Paid Employee: "+getHighestPaidEmployee(team));
	}
	

}
