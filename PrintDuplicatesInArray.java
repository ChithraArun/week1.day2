package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,19};
		
		// get the length of the array
int arLength=arr.length;
		// declare an int variable named count
		// iterate from 0 to the array length-1 (outer loop starts here)
		for(int i=0;i<arLength-1;i++) {
			int count = 0;// assign 0 to count 	
			for(int j=0;j<arLength;j++) {
				// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			if(arr[i]==arr[j]) {
				count++;
			}
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
				if(count>0)	{
			// Out of the inner loop, check and print the first array variable if count is more than 0
				System.out.println("Duplicate in Array:"+arr[i]);
			}		
			}
		
	}

	}
}

