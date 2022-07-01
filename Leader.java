import java.util.Arrays;
public class Leader {
    
    int countTriplet(int arr[], int n) {
        // code here
      
        for(int i=0; i< A.length-1; i++){
	    int sum=0;
	        for(int j=0; j<A.length; j++){
		        sum += A[j];
		        if(A[i]> sum);{
			        return A[i];
                }
            }
            
        }
        return A[n-1];
    }
        
    public static void main(String []args ){
            int A[] ={16,17,4,3,5,2};
            int A_size= A.length;
            System.out.println(countTriplet(A, A_size));
        }
        
        
    }

