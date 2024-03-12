package Reccursion;

public class Find_the_string_in_grid {

    public int[][] searchWord(char[][] grid, String word)
    {
          int count = 0;
          int n  = grid.length;
          int m = grid[0].length;
          int s = word.length();
          int[] x = {-1,-1,0,1,1,1,0,-1};
          int[] y = {0,1,1,1,0,-1,-1,-1};
          int[][] ans =new int[n*m][2];
          int[] p = new int[2]; 
          for(int i = 0; i<n;i++)
          {
            for(int j = 0;j<n;j++)
            {
                if(find(grid,word,n,m,x,y,i,j,s))
                {
                    p[0] = i;
                    p[1] = j;
                    ans[count][0] = i;
                    ans[count][1] = j;
                    count++;
                }
            }
          }
          int[][] result = new int[count][2];
          for (int k = 0; k < count; k++) {
              result[k] = ans[k];
          }
          return result;
    }


    private boolean find(char[][] grid , String word , int n , int m , int[] x , int [] y , int i , int j ,int s)
    {
        for(int k = 0; k<8;k++)
        {
            int ni=i;
            int nj=j;
            int l=0;
            while(ni>=0 && ni<n && nj>=0 &&nj<m && l<s)
            {
                if(word.charAt(l)!=grid[ni][nj])
                {
                    break;
                }
                ni+=x[k];
                nj+=x[k];
            }
            if(l==s)
            {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        
        char[][]grid = {{'a','b','c'},{'d','r','f'},{'g','h','i'}};
        String word = "abc";
        Find_the_string_in_grid res = new Find_the_string_in_grid();

        System.out.println(res.searchWord(grid, word));
    }
    
}
