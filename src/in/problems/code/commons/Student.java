package in.problems.code.commons;

public class Student {

	private int studentId;
	private String name;
	private String department;
	private String rollNo;
	
	
	public Student(int studentId, String name, String department, String rollNo) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.department = department;
		this.rollNo = rollNo;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", department=" + department + ", rollNo="
				+ rollNo + "]";
	}
	
	
}
