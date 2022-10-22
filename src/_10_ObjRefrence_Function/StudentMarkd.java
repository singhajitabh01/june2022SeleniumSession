package _10_ObjRefrence_Function;

public class StudentMarkd {
	
	public int studentMarks(String Student_Name) {
		System.out.println("Name of Student : "+Student_Name);
		if(Student_Name.equals("Tom")) {
			return 90;
		}
		else if(Student_Name.equals("Ramesh")) {
			return 80;
		}
		else if(Student_Name.equals("Ajitabh")) {
			return 35;
		}else {
			System.out.println("Proper Name is required"+Student_Name);
			return -1;
		
		}
	}
	public static void main(String[] args) {
		StudentMarkd sm = new StudentMarkd();
		int m=sm.studentMarks("Tom");
		System.out.println(m);
		
		
	}
	
}
