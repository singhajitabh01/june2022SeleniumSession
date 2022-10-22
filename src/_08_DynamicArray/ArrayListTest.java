package _08_DynamicArray;
/**
 * THis is called generics in ArrayList
 */
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<Integer>Marks = new ArrayList<Integer>();
		
		System.out.println(Marks);
		
		Marks.add(10);
		Marks.add(20);
		Marks.add(30);
		Marks.add(40);
		Marks.add(50);
		//to print the size of virtual length
		System.out.println(Marks.size());
		
		Marks.remove(3);
		
		System.out.println(Marks.size());
		for(int a : Marks) {
			System.out.println(a);
		}
		//to print specific index value 
		System.out.println(Marks.get(2));
	}

}
