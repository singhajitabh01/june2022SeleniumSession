package _13_ConstructorConcept;

public class Customer {
	
	String name;
	int age;
	String phn;
	String city;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public Customer(String name,int age,String phn,String city) {
		this.name = name;
		this.age = age;
		this.phn = phn;
		this.city = city;
		
	}
	
	
	public static void main(String[] args) {
		Customer c1 = new Customer("Aji");
		System.out.println(c1.city);
		System.out.println(c1.name);
		
		System.out.println("================");
		
		Customer c2 = new Customer("Ajitabh",28,"9876543210","Delhi");
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.city);
		System.out.println(c2.phn);
		
		
	}
	

}
