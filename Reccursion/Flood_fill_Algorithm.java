package Reccursion;

import java.util.Arrays;

public class Flood_fill_Algorithm {


    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        int intiColor= image[sr][sc];
        int [][] ans = image;
        int row = sr;
        int col = sc;
        int[] delrow = {-1,0,+1,0};
        int[] delcol = {0,+1,0,-1};
        dfs(intiColor ,ans,image,row,col ,newColor,delrow,delcol);
        return ans;
    }

    private void dfs(int ini , int [][] ans, int[][]image,int row,int col , int newColor,int[] delrow ,int[] delcol)
    {
        ans[row][col] = newColor;
        int n  = image.length;
        int m = image[0].length;

        for(int i = 0 ; i<4;i++)
        {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==ini && ans[nrow][ncol]!=newColor)
            {
                dfs(ini, ans, image, nrow, ncol, newColor, delrow, delcol);
            }
        }
    }

    public static void main(String[] args) {
        Flood_fill_Algorithm res = new Flood_fill_Algorithm();

        int[][]image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] newres = res.floodFill(image,sr,sc,newColor);

        for (int i = 0; i < newres.length; i++) {
            System.out.println(Arrays.toString(newres[i]));
        }
    }
    
}
