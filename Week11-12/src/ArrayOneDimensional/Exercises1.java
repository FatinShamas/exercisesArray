package ArrayOneDimensional;
import java.util.*;
public class Exercises1 {

	public static void main(String[] args) {
		//declare an array alpha of 15 element og type integer
		
		int[] alpha= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] beta= new int [20];
		
		//output of the tenth element of the array alpha
		
		System.out.println(alpha[9]);
		
		//set the value of the fifth element in the array alpha

		alpha[4]=35;
		System.out.println(alpha[4]);
		
		//Set the value of the ninth component of the array alpha to the sum of the sixth and thirteen component of the array alpha
		
		alpha[8]=alpha[5]+alpha[12];
		System.out.println("Sum = " + alpha[8]);
		


	}

}
