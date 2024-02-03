import java.util.HashMap;

public class MajorityElement {

    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i :a)
        {
                map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int num :map.keySet())
        {
            if(map.get(num)>size/2)
            {
                return num;
            }
        }
        return -1;
    }
    
}
