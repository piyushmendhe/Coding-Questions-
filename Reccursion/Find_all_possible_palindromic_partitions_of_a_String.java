package Reccursion;

import java.util.ArrayList;

public class Find_all_possible_palindromic_partitions_of_a_String {

    public ArrayList<ArrayList<String>> allPalindromicPerms(String S) {

        int n = S.length();
        ArrayList <ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        falg(0,n,ans,temp,S);
        return ans;
    }
    private void falg(int index , int n ,ArrayList <ArrayList<String>> ans ,ArrayList<String> temp,String S )
    {
        if(index == n)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index ;i<n;i++)
        {
            if(isPallin(index,i,S))
            {   
                temp.add(S.substring(index,i+1));
                falg(i+1, n, ans, temp, S);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPallin(int start , int end , String S)
    {
        while(start<=end)
        {
            if(S.charAt(start)!=S.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        
        String S = "geeks";
        Find_all_possible_palindromic_partitions_of_a_String res=new Find_all_possible_palindromic_partitions_of_a_String();

        System.out.println(res.allPalindromicPerms(S));

    }
    
}
