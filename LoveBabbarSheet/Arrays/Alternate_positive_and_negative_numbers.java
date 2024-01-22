import java.util.ArrayList;

public class Alternate_positive_and_negative_numbers {
    
     void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        
        for(int num : arr)
        {
            if(num>=0)
            {
                pos.add(num);
            }
            else
            {
                neg.add(num);
            }
        }
        
        int i = 0 ;
        int j = 0 ;
        int k = 0;
        while(i<pos.size()&& j<neg.size())
        {
            arr[k++]=pos.get(i++);
            arr[k++]=neg.get(j++);
        }
        
        while(i<pos.size())
        {
            arr[k++]=pos.get(i++);
        }
        
        while(j<neg.size())
        {
            arr[k++]=neg.get(j++);
        }
        
    }
}
