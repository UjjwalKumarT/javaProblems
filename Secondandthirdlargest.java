import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Secondandthirdlargestelement {
	public static void main (String[] args) {
                      // Your code here
			int N;					
			int first=0;
			int second=0;
			int third=0;
            
            Scanner sc=new Scanner(System.in);
            N=sc.nextInt();
					  
			int arr[]= new int[N];

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			

		}
		int size = arr.length;
		for(int i=0; i<size; i++){

		if(arr[i]>first){

		    second=first;
		    first = arr[i];
		}
		else if(arr[i]>second){
		    third=second;
		    second=arr[i];
		}
         else if (arr[i]> third){
			third= arr[i];
		}
		}
	System.out.println(+ second+ " "+ third);		

			
	
	}
}