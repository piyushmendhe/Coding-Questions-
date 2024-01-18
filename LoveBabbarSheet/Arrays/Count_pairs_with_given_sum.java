import java.util.*;

public class Count_pairs_with_given_sum {

    int getPairsCount(int[] arr, int n, int k) 
    {
       Map<Integer,Integer> map = new HashMap<>();

       int count =0;

       for (int i:arr) {

        int diff = k-i;
        if(map.containsKey(diff))
        {
            count+=map.get(diff);
        }
        map.put(i,map.getOrDefault(i, 0)+1);
        
       }

       return count;


    }

    //Alternate solution

    class Solution {
        int getPairsCount(int[] arr, int n, int k) {
            // code here
           HashMap<Integer,Integer> map = new HashMap<>();
           int count = 0;
           for(int a : arr){
                count+=map.getOrDefault(k-a,0);
                map.put(a,map.getOrDefault(a,0)+1);
           }
           return count;
        }
    }    
    
}
