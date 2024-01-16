// package LoveBabbarSheet.Arrays;

import java.util.Arrays;

public class Array_Subset_of_another_array {

    public String solution(int a1[],int a2[],int m ,int n)
    {
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i =0; 
        int j =0; 
        int count =0;
        while(i<m && j<n)
        {
            if(a2[j]==a1[i])
            {
                count++;
                j++;
            }
            i++;
        }

        if(count==n)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
 




    public static void main(String[] args) {
        
        Array_Subset_of_another_array ans =new Array_Subset_of_another_array();

        int a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
	    int a2[] = {11, 3, 7, 1, 7};
        int m = 8;
        int n =5;
        
        System.out.println(ans.solution(a1, a2,m, n));
    }
    
}
