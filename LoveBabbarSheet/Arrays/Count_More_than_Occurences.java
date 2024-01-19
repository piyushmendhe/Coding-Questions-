import java.util.HashMap;
import java.util.Map;

public class Count_More_than_Occurences {

    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        Map<Integer,Integer> map = new HashMap<>();
        
        int a = n/k;
        int count =0;
        for(int num :arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            
            
        }
        
        for(int num : map.keySet())
        {
            if(map.get(num)>a)
            {
                count++;
            }
        }
        
        return count;
    }
    
}
