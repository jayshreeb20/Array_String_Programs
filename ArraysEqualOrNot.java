package Array;

import java.util.Arrays;

public class ArraysEqualOrNot {

	public static void main(String[] args) 
	{
		int array1[]= {1,2,3,4,5};
		int array2[]= {1,2,3,4,5};
		
		//char array1[]= {'a', 'b'};
		///char array2[]= {'a', 'c'};
		
		String array3[]= {"jayshree", "Pravin"};
		
		boolean answer= Arrays.equals(array1, array2);
	
		
		if (answer==true)
			
		{
			System.out.println("the given arrays are equal");
			
		}
		
		else
		{
			System.out.println("the given arrays are not equal");
		}

	}

}
