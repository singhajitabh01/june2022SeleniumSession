package _12_MainMethodOverLoading;

public class CarType {
	
	String Name;
	String colour;
	static int wheel = 4;
	
	public static void main(String[] args) {
		CarType ct = new CarType();
		ct.Name = "BMW";
		ct.colour = "RED";
		
		ct.Name = "Maruti";
		ct.colour = "Black";
		
		ct.Name = "Tata";
		ct.colour = "White";
		
		System.out.println(CarType.wheel);
		
		
	}

}
