import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Secondandthirdlargestelement {
	public static void main (String[] args) {
                      // Your code here
			int N;					
			int largest=0;
			int secondlargest=0;
			int thirdlargest=0;
					  
			int arr[]= new int[N];

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			

		}
		int size = arr.length;
		for(int i=0; i<size; i++){

		if(arr[i]>firstlargest){

		    secondlargest=firstlargest;
		    largest = arr[i];
		}
		else if(arr[i]>secondlargest){
		    thirdlargest=secondlargest;
		    secondlargest=arr[i];
		}
         else if (arr[i]> thirdlargest){
			thirdlargest= arr[i];
		}
		}
	System.out.pritln("secondlargest="+ secondlargest+ "thirdlargest="+ thridlargest);		

			
	
	}
}