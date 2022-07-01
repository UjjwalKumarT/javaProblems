import java.util.HashSet;
public class removing_duplicate {
    public static void main(String[]args){
        Scanner sc=
        int arr[]={1,5,7,3,1,4,5,1};
        int n=arr.length;
        HashSet<Integer>hs= new HashSet<Integer>();
    
    
    
        for(int i=0; i<n; i++){
            hs.add(arr[i]);
        }
        for(int val:hs){
           System.out.print(val+" ");
           }
    }






    
}
