package _10_ObjRefrence_Function;
//Diference Between argument and parameter
public class Employee {
	
	public String getName() {
		System.out.println("My name is Ajitabh");
		return "Ajitabh";
	}
	
	public int getSalary() {
		int a = 10;
		int b = 11;
		int c = a+b;
		return c;
		
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		String name=e1.getName();
		System.out.println(name);
		
		int Total_Salary = e1.getSalary();
		
		System.out.println(Total_Salary);
	}

}
