package DP;
public class Fibo {
    //Top-down
    
    public int Fibonac(int n)
    {
        int[] dp = new int[n+1]; //Declare dp array of size(n+1) 
        return soln(dp,n);
    }

    public int soln(int[] dp , int n)
    {
        if(n<=1) return n;

        if(dp[n]!=0) return dp[n]; //Check if value is present in DP return that value

        dp[n]= soln(dp,n-1)+soln(dp,n-2); //Save recurring solution to dp
        
        return dp[n];
    }

    //bottom-up

    public int fiboBU(int n)
    {
        int[] dp = new int[n+1]; //Declaring DP

        if (n <= 1) {
            return n;
        }

        dp[0]=0;                 //Basecase
        dp[1]=1;

        for(int i =2 ;i<=n;i++)  //For Loop
        {
            dp[i]=fiboBU(i-1)+fiboBU(i-2); //Save reccuring solution to DP
        }
        return dp[n];

    }

    //Space optimization 
    public int prevBU(int n)
    {
        int prev2=0;
        int prev1=1;

        for(int i =2 ;i<=n;i++)
        {
            int cur=prev1+prev2;

            prev2=prev1;
            prev1=cur;

        }
        return prev1;

    }




    public static void main(String[] args) {
       
        Fibo res = new Fibo();
        int a = res.Fibonac(6);
        int b = res.fiboBU(6);
        System.out.println(a);
        System.out.println(b);
        int c = res.prevBU(6);
        System.out.println(c);
    }
    
}
