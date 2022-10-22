package IncrementalAndDecremental;
/*
 * Post mean increase the value later
 * created :- 05-09-22
 */
public class PostIncrement {
	public static void main(String[] args) {
		int m = 1;
		int n = m++;
		
		System.out.println("Value of M is "+m);//2
		System.out.println("Value of N is "+n);//1
		
		System.out.println("===============");
		int p = -89;
		int q = p++;
		
		System.out.println(p);//-88
		System.out.println(q);//-89
		
		System.out.println("===================");
		
		int t = 0;
		int r = t++;
		System.out.println(t);//1
		System.out.println(r);//0
		
		System.out.println("...................");
		
		int total = 1;
		System.out.println(total++);//1
		System.out.println(total);//2
	}

}
