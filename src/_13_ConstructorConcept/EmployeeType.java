package _13_ConstructorConcept;

public class EmployeeType {
	
	String name;
	int age;
	double salary;
	
	public void   TestType() {
		System.out.println("Default Method Salary...");
	}
	
	public  EmployeeType() {
		System.out.println("Default Salary...");
	}
	
	public EmployeeType(int a) {
		System.out.println("One Param...."+a);
	}
	
	public EmployeeType(String b,int a) {
		System.out.println("Two Param....");
	}
	
	public static void main(String[] args) {
		
		EmployeeType et = new EmployeeType(10);
	}
	
}
