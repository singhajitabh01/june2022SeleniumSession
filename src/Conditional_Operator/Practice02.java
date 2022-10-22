package Conditional_Operator;

public class Practice02 {
	public static void main(String[] args) {
		int total =45;
		if(total<=40) {
			System.out.println("Grade C");
			if(total>=60) {
				System.out.println("Grade B");
				if(total>=90) {
					System.out.println("Grade A");
					if(total>=100) {
						System.out.println("Grade A++");
					}
					else {
						System.out.println("Fail....");
					}
					
				}else {
					System.out.println("Fail...1");
				}
				
			}else {
				System.out.println("Fail...2");
			}
		}else {
			System.out.println("Fail...3");
		}
	}

}
