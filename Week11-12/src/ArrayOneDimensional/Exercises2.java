package ArrayOneDimensional;

public class Exercises2 {

	public static void main(String[] args) {
		
	//write a statement that declare a string array initialize with the following
	//string: sunday, monday, tuesday, wednesday, thursday, friday, saturday
	
		//write a loop that display content of each element in the array that u declared
		
		String[] days = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
		
		System.out.println("FOR");
		
		for(int i=0; i<days.length; i++)
		{
			System.out.println(days[i]);
		}
		
		System.out.println();
		System.out.println("WHILE");
		
		int j=0;
		
		while(j<days.length)
		{
			System.out.println(days[j++]);
			
		}
		
		System.out.println();
		System.out.println("DO WHILE");
		
		int z=0;
		do {
			System.out.println(days[z]);
			z++;
		}
		while(z < days.length);


	}

}