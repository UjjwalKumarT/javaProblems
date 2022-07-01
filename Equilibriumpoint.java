public class Equilibriumpoint {
    public static int Equilibrium(int arr[], int n){

       int leftsum, rightsum;
        for(int i=0; i<n; i++){
            leftsum=0;
            for(int j=0; j<i ; j++ ){
                leftsum += arr[j];
            }
            rightsum=0;
            for(int j=i+1; j<n; j++){
                rightsum += arr[j];
            }


            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;

    }
    public static void main(String [] args){
        int arr[] ={-1,-3,-6,6,4,2};
        int arr_size = arr.length;
        System.out.println(Equilibrium(arr, arr_size));
    }
    
}
