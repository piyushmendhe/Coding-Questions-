package DP;

public class FrogJumpfromK{

    public int JumpTD(int n,int[] height)
    {
        int[] dp = new int[n];
        return soltn(dp,n-1,height);
    }

    private int soltn(int[] dp,int n , int[] height)
    {
        if(n<0) return 0 ;

        if(dp[n]!=0) return dp[n];
        int steps = Integer.MAX_VALUE;
        for(int i = 1;i<=n;i++)
        {
            if(height[n] - height[n-i]>0) 
            {steps = dp[n-i]+Math.abs(height[n] - height[n-i]);}
            
        }
        dp[n]=steps;
        return dp[n];
    }

    public static void main(String[] args) {
        FrogJumpfromK res = new FrogJumpfromK();
        int n = 8;
        int[] height = {0, 1, 3, 5, 6, 8, 12, 17};
        int a = res.JumpTD(n,height);
        System.out.println(a);

        // int b = res.frogBU(n,height);
        // System.out.println(b);

        // int c = res.frogprev(n,height);
        // System.out.println(c);
    }
}