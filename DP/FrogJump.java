package DP;
public class FrogJump {
    
    // Top-Down
    public int frogTD(int n,int[] height)
    {
        int[] dp = new int[n+1];                        //Initialise DP
        return soltn(dp,n-1,height);
    }

    public int soltn(int[] dp,int n , int[] height)
    {
        if(n<1) return 0;

        if(dp[n]!=0) return dp[n];                      // Check weather it has dp[n]

        int left = soltn(dp,n-1,height) + Math.abs(height[n]-height[n-1]) ;
        int right =Integer.MAX_VALUE;
        if(n>1){
            right = soltn(dp,n-2,height) + Math.abs(height[n]-height[n-2]) ;
        }
        dp[n]= Math.min(left,right);                    //Store in DP
        return dp[n];

    }


    //Bottom-up
    public int frogBU(int n,int[] height)
    {
        int [] dp = new int[n];

        dp[0]=0;

        for (int i = 1; i < n; i++) {

            int fs = dp[i-1]+ Math.abs(height[i]-height[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1) ss= dp[i-2]+ Math.abs(height[i]-height[i-2]);

            dp[i]=Math.min(fs, ss);
            
        }
        return dp[n-1];
    }

    //Bottom up space optimization
    public int frogprev(int n,int[] height)
    {
        int prev=0;
        int prev2=0;

        for (int i = 1; i < n; i++) {

             int fs = prev + Math.abs(height[i]-height[i-1]);
             int ss = Integer.MAX_VALUE;
             if(i>1) ss= prev2 + Math.abs(height[i]-height[i-2]);
            
            int cur=Math.min(fs, ss);
            prev2 =prev;
            prev = cur;
        }
        return prev;
    }

    public static void main(String[] args) {
        FrogJump res = new FrogJump();
        int n = 6;
        int[] height = {30,10,60,10,60,50};
        int a = res.frogTD(n,height);
        System.out.println(a);

        int b = res.frogBU(n,height);
        System.out.println(b);

        int c = res.frogprev(n,height);
        System.out.println(c);
    }

}
