package DP;

public class NinjasTraining {

    //top-bottom (memoization)
    static int topB(int n,int[][] arr)
    {
        int last =3;
        int[][] dp = new int[n][4];
        return maxS(dp,n-1,arr,last);
    } 
    static int maxS(int[][] dp,int n ,int[][] arr, int last)
    {
       
           if(n<1)
           {
            int max=0;
            for(int i=0;i<3;i++)
            {
                
                if(i!=last)
                {
                    max=Math.max(max,arr[0][i]);
                }
            }
            return dp[n][last]=max;
           }

           
           if(dp[n][last]!=0) return dp[n][last];
           int max = 0;
           for(int i =0;i<3;i++)
           {
            if(i!=last)
            {
                int act = arr[n][i] + maxS(dp, n-1, arr, i);
                max=Math.max(max, act);
            }

           }
           return dp[n][last] = max;
    }

    public static void main(String[] args) {
        
        int[][] points = {{10, 40, 70},
                          {20, 50, 80},
                          {30, 60, 90}};

        int n = points.length; // Get the number of days
        System.out.println(topB(n, points)); // Calculate and print the maximum points
    }
}


