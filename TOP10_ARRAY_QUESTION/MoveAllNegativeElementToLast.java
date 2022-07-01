package TOP10_ARRAY_QUESTION;
public class MoveAllNegativeElementToLast {
    public static void segregateElements(int arr[], int n){
        int temp[]= new int [n];
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] >0){
                temp[j++]= arr[i];
            }
        }
        if(j==n || j==0) //checking, arr is all +tive or -ve/*In Java programming, the return statement is used for returning a value when the execution of the block is completed. The return statement inside a loop will cause the loop to break and further statements will be ignored by the compiler. */
        {
            return;
        }
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                temp[j++]= arr[i];
            }
        }
        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[]args){
        int arr[]={-1,4,5,-2,7};
        int n= arr.length;
        
        segregateElements(arr, n);
 
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    
}
