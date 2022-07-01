import java.util.Set;
public class MinimumIndexofrepeatingelement {
    public static int first(int A[]){
        Set<Integer>set= new HashSet<>();
        int minIndex=A.length;
        for(int i<A.length-1;i>=0; i++){
            if(set.contains(arr[i]));
            {
                minIndex=i;
            }
            else{
                set.add(A[i]);
            }
        }
        // invalid input
        if (minIndex == A.length) {
            return -1;
        }
 
        // return minimum index
        return minIndex;
    }
    public static void main(String[] args)
    {
        int[] A = { 5, 6, 3, 4, 3, 6, 4 };
 
        int minIndex = findMinIndex(A);
 
        if (minIndex != A.length) {
            System.out.print("The minimum index of the repeating element is " +
                    minIndex);
        }
        else {
            System.out.print("Invalid Input");
        }
    }

    
}
