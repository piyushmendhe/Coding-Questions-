package Reccursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations_of_a_given_string {
    public List<String> find_permutation(String S) {

        int n = S.length();
        boolean [] flag = new boolean[n];
        Set<String> ans = new HashSet<>();
        perm(S,ans,flag,n,"",0);
        List<String> result = new ArrayList<>(ans);
        Collections.sort(result);
        return result;
    }

    private void perm(String S , Set<String> ans, boolean [] flag , int n , String temp ,int count)
    {
        if(count == n )
        {
            ans.add(temp);
            return;
        }
        for(int i = 0 ; i<n;i++)
        {
            if(!flag[i])
            {
                flag[i]=true;
                perm(S, ans, flag, n, temp+S.charAt(i), count+1);
                flag[i]=false;
            }
        }
    }


    public static void main(String[] args) {
        Permutations_of_a_given_string res = new Permutations_of_a_given_string();

        String S= "ABC";
        System.out.println(res.find_permutation(S));
    }
}
