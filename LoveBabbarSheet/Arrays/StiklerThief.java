//package LoveBabbarSheet.Arrays;

class StiklerThief {

  //top Down
    
    public int FindMaxSum(int arr[], int n)
    {
        
        int[] dp =new int[n];
        return maxSum(dp,arr,0);
    }
        
        public int maxSum(int[] dp , int[] arr ,int curIndex)
        {
            if(curIndex>=arr.length)
            {
                return 0;
            }
            
            if(dp[curIndex]!=0) return dp[curIndex];
            
                int curSteal = arr[curIndex] + maxSum(dp,arr,curIndex+2);
                int skipSteal = maxSum(dp,arr,curIndex+1);
                dp[curIndex]=Math.max(curSteal,skipSteal);
            
            return dp[curIndex];
        }
//bottom up 
        public int bottomUp(int[] arr)
        {
            int[] dp = new int[arr.length +2];
            dp[arr.length]=0;

            for(int i=arr.length-1;i>=0;i--)
            {
                dp[i]=Math.max(arr[i]+dp[i+2],dp[i+1]);

            }
            return dp[0];
        }

        public int spaceOpt(int[] arr)
        {
            int iplus1=0;
            int iplus2=0;

            for(int i=arr.length-1;i>=0;i--)
            {
               int curi=Math.max(arr[i]+iplus2,iplus1);
               iplus2=iplus1;
               iplus1=curi;

            }
            return iplus1;
        }

        public static void main(String[] args) {
            StiklerThief solution = new StiklerThief();
             int[] arr = {6, 7, 1, 30, 8, 2, 4};
             int n = arr.length;
                     int result = solution.bottomUp(arr);
                     int result2 = solution.FindMaxSum(arr, n);
                     int result3 = solution.spaceOpt(arr);
                     System.out.println("Maximum money the thief can get via top down: " + result2);
                     System.out.println("Maximum money the thief can get via bottom up: " + result);
                     System.out.println("Maximum money the thief can get via bottom up: " + result3);
         }
}
