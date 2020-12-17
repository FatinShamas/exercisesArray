package ArrayOneDimensional;
import java.util.*;
public class Exercises3 {

	public static void main(String[] args) {
		//Write a program that creates an array of 10 elements size. 
		//Your program should prompt the user to input numbers in array and then display the sum of all array elements.
		
		final int size =10;
		int[] numb = new int [size];
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter " +size+ " number:");
		
		for(int i=0; i < size; i++) {
			numb[i] = in.nextInt();
		}
		int sum=0;
		
		for(int i=0; i<size; i++)
		{
			sum += numb[i];
		}
		
		System.out.println("Sum all numbers: " +sum);
		
		
	}

}
