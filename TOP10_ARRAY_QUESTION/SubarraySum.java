package TOP10_ARRAY_QUESTION;

public class SubarraySum {
    public static void sum(int arr[], int k, int n){
        int cur_sum=0;
        for(int i=0; i<n; i++){
            cur_sum=arr[i];
            for(int j=i+1; j<=n; j++){
                cur_sum +=arr[j];
                if(cur_sum== k){
                    return;
                }
                
            }            
        }
    }
    
}
