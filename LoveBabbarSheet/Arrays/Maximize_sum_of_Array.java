import java.util.Arrays;

public class Maximize_sum_of_Array {

    int Maximize(int arr[], int n)
    {
        Arrays.sort(arr);
        int ans = 0;
        int mod = 1000000007;
        for(int i=0;i<n;i++)
        {
           ans = (ans+arr[i]*i)%mod; 
        }
        return ans;
    }
}
