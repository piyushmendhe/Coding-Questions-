public package LoveBabbarSheet.Arrays;

class StiklerThief {

  
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp =new int[n];
        return maxSum(dp,arr,0);
    }
        
        public int maxSum(int[] dp , int[] arr ,int curIndex)
        {
            if(curIndex>=arr.length)
            {
                return 0;
            }
            
            if(dp[curIndex]==0)
            {
                int curSteal = arr[curIndex] + maxSum(dp,arr,curIndex+2);
                int skipSteal = maxSum(dp,arr,curIndex+1);
                dp[curIndex]=Math.max(curSteal,skipSteal);
            }
            return dp[curIndex];
        }
    
}
