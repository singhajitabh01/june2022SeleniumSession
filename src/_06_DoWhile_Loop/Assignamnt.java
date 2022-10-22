package _06_DoWhile_Loop;
/**
 * Print the value of array in reverse oder in Array itteration
 * @author Ajitabhg
 *
 */
public class Assignamnt {
	public static void main(String[] args) {
		int count[] = new int[5];
		count [0]=10;
		count [1]=20;
		count [2]=30;
		count [3]=40;
		count [4]=50;
		
		for(int i=0;i<=count.length-1;i++) {
			System.out.println(count[i]);
		}
		
		System.out.println("--------------------");
		
		for(int a = count.length-1;a>=0;a--) {
			System.out.println(count[a]);
		}
		
	}

}
