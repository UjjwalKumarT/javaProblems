import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PairSum2 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
       
        int target = 9;
        Map<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<n; i++){
            //if( hm.containsKey(target- arr[i])){
            System.out.printf(" %d", arr[hm.get(7)]);
        
   }
    }}

