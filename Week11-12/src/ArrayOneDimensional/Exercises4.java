package ArrayOneDimensional;
import java.util.*;
public class Exercises4 {

	public static void main(String[] args) {
		//The variable list1 and list2 are reference arrays that each have 5 elements. Write code that copies the values in list1 to list2. Values in list1 are input by user.
        
		final int x =5;
		
		int[] array_1 = new int[x];
		int[] array_2 = new int[x];
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter " +x + " numbers: ");
		
		for(int i=0; i<x ; i++)
		{
			array_1[i] = in.nextInt();
		}
		for(int i=0; i<x ;i++)
		{
			array_2[i] = array_1[i];
		}
		
		System.out.println("Elements of array 2 : ");
		for(int i =0; i<x ; i++)
		{
			System.out.println(array_2[i]);
		}
	}

}
