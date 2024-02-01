package DP;

public class adjacentSum {
    //top-down (Memoization)
    public int adjacent(int n , int[] arr)
    {
        int[] dp = new int[n];
        return maxSum(dp,n-1,arr);
    }

    private int maxSum(int[] dp , int n , int[] arr)
    {
        if (n<0) return 0;

        if(dp[n]!=0) return dp[n];
        int sum = arr[n] +maxSum(dp, n-2, arr);
        int skip = maxSum(dp, n-1, arr);
        dp[n]=Math.max(sum, skip);
        return dp[n];
    }
//Bottom-up (Tabulation)

    public int Tabu(int n , int[] arr)
    {
        if(n<1) return 0;

        int[] dp = new int[n+2];

       
        for(int i =n-1;i>=0;i--)
        {
            dp[i]=Math.max(arr[i] + dp[i+2], dp[i+1]);
        }
        return dp[0];
    }
    //space optimized

    public int spaceOpt(int n , int[] arr)
    {
        if(n<1) return 0;
        int iplus1=0;
        int iplus2=0;
        for(int i =n-1;i>=0;i--)
        {
            int curi=0;
            int step = arr[i] + iplus2;
            int skip = iplus1;
            curi=Math.max(step, skip);
            iplus2=iplus1;
            iplus1=curi;
        }
        return iplus1;
    }
    
    public static void main(String[] args) {
        adjacentSum res = new adjacentSum();
        int n = 7;
        int[] arr ={1,2,4,2,5,6,11}; 
        int a = res.adjacent(n, arr);
        System.out.println(a);
        int b = res.Tabu(n, arr);
        System.out.println(b);
        int c = res.spaceOpt(n, arr);
        System.out.println(c);
    }
}
