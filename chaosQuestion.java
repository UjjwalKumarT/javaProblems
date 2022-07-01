import java.io.*; // for handling input/output
import java.util.*;
import java.util.Scanner; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class chaosQuestion {
	public static void main (String[] args) {
        int input;
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		
		input = sc.nextInt();
		System.out.println("Enter array value");
		 
		for(int i =0; i< input-1; i++ ){
			 
			int [i]arr = sc.nextInt();

		 
		 }
                      // Your code here
		int sum=0;
		int n= arr.length;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				System.out.print(sum+" "); //printing the first value as zero
			        if(arr[i]> arr[j]){
				    	sum += arr[i] - arr[j] ; //this will find the total amount as charged

						System.out.print(arr[i]- arr[j]+" ");
						System.out.println(\n sum);
			}
			else{
				System.out.print(0+" ");
				
			}

			}
			
           

		}
	}
}