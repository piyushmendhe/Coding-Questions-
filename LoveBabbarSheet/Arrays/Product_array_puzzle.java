public class Product_array_puzzle {

    public static long[] productExceptSelf(int nums[], int n) 
    {
        long[] left = new long[n];
        long[] right = new long[n];
        long[] ans = new long[n];

        left[0]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        
        right[n-1]=0;
        for (int j = n-2; j >=0; j--) 
        {
              right[j]=right[j+1]*nums[j+1];  
        }

        for (int i = 0; i < n; i++) 
        {

            ans[i]=left[i]*right[i];

        }
        return ans;


    }
    
}
