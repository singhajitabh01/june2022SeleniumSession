package _09_ArrayList_Method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer>Salary = new ArrayList<Integer>();
		Salary.add(20);
		Salary.add(40);
		Salary.add(30);
		Salary.add(80);
		Salary.add(10);
		
		System.out.println(Salary.size());
		
		System.out.println("=================");
		
		Collections.sort(Salary);//for shorting the valuew in incremental oder
		
		for(int e :Salary) {
			System.out.println(e);
		}
		
		System.out.println("=================");
	
		Collections.sort(Salary,Collections.reverseOrder());//for shorting the valuew in decremental oder
		for(int a : Salary) {
			System.out.println(a);
		}
		
		ArrayList<String>EmpName = new ArrayList<String>();
		
		EmpName.add("Varsha");
		EmpName.add("Kabir");
		EmpName.add("Rishu");
		
		
		Collections.sort(EmpName);
		for(String AllEmp : EmpName) {
			
			System.out.println(AllEmp);
			if(AllEmp.contains("Kabir")) {
				System.out.println("Preeti is coming");
				break;
			}
		}
		
		
		
		
		
		
		
		
	}
	
	

}
