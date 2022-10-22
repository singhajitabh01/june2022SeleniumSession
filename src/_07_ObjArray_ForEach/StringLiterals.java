package _07_ObjArray_ForEach;

public class StringLiterals {

	public static void main(String[] args) {
		String Student[] = {"Tom","Peter","Ravi","Sanjay","Dhoni"};
		
		for(String allMembers : Student) {
			System.out.println(allMembers);
			if(allMembers.equals("Ravi")) {
				System.out.println("Cosin brother");
				break;
			}
		}
		System.out.println("=====================");
		
	    Object EmployeeDetail [] = {"Amit",10,6.5,true};
	    
	    for(Object allEmp : EmployeeDetail) {
	    	System.out.println(allEmp);
	    }

	}

}
