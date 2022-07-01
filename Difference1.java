import java.util.HashSet;
import java.util.Set;
public class Difference1 {
    public static void findPair(int A[], int diff){
        Set<Integer> set= new HashSet<>();
        for(int i: A){
            if(set.contains(i-diff)){
                System.out.println("("+ i+ ","+ (i-diff)+")");
            }
            //check i+diff exist 
            if(set.contains(i+diff)){
                System.out.println("("+ (i+diff)+ ","+  i+ ")");
            }
            // insert the current element into the set

            set.add(i);
        }
    }
    public static void main(String[]args){
        int A[]= {5,3,2,1,6,};
        int diff=3;
        findPair(A,diff);
    }
    
}
