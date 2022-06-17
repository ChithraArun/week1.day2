package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int length1= arr1.length;
		int length2 = arr2.length;
		for(int i1=0;i1<length1;i1++) {
			for(int i2=0;i2<length2;i2++) {
				if(arr1[i1]==arr2[i1]) {
					System.out.println("The number matched in Array1 and Array2 is"+arr1[i1]);
				}
			}
		}
	}

}
