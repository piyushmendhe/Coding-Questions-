package Reccursion;

import java.util.ArrayList;

public class Possible_Words_From_Phone_Digit {

    ArrayList<String> ans;
    String[] keys = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public ArrayList <String> possibleWords(int a[], int N)
    {
        
        ans = new ArrayList<>();
        result(a,N ,"",0);
        return ans;
    }
    private void result(int[] a , int n , String temp,int i )
    {
        if(i==n)
        {
            ans.add(temp);
            return;
        }
        for(int j = 0 ; j<keys[a[i]].length();j++)
        {
            result(a, n, temp+keys[a[i]].charAt(j),i+1);
        }
    }
    
    public static void main(String[] args) {
        Possible_Words_From_Phone_Digit ans = new Possible_Words_From_Phone_Digit();

        int[] a = {2,3,5};
        int N=3 ;
        System.out.println(ans.possibleWords(a, N));

    }
}
