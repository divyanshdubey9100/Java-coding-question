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
		List<Employee> employees = Arrays.asList(
		        new Employee(123,"Alice", 60000, "IT"),
		        new Employee(300,"Bob", 50000, "HR"),
		        new Employee(911,"Charlie", 70000, "IT"),
		        new Employee(512,"David", 55000, "HR"),
		        new Employee(789,"Eve", 65000, "Finance")
		);
		System.out.println("Highest Paid Employee: "+getHighestPaidEmployee(employees));
	}
	

}
