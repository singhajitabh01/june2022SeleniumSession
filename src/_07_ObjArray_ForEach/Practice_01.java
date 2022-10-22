package _07_ObjArray_ForEach;

public class Practice_01 {
	public static void main(String[] args) {
		int rollNum[] = new int[4];
		rollNum[0] = 11;
		rollNum[1] = 71;
		rollNum[2] = 31;
		rollNum[3] = 12;
		//rollNum[4] = 21;//exception : AIOB
		
		for(int totalRoll : rollNum) {
			System.out.println(totalRoll);
			if(totalRoll==31) {
				System.out.println("NUmber is 31");
				break;
			}
		}
		
	
		
	}

}
