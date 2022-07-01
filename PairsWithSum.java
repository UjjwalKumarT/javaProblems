import java.util.*;

public class PairsWithSum {
    public static void main(String[] args){
    int []arr1={1,2,4,5,7};
    int []arr2={5,6,3,4,8};
    int a1=arr1.length;
    int a2= arr2.length;
    System.out.println(a1,a2);
    int x=9;//target   //for(int i=0; i<a1; i++)
    int i=0, j=0;

 
while(i<a1 && j<a2){
    if(arr1[i]+ arr2[j]==x){  //arr1[i]= 1    arr2[j]= 5

        System.out.println(i+" "+j);
}
j++;
i++;

}
}
}