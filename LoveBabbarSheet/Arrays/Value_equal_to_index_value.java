// package LoveBabbarSheet.Arrays;

import java.util.ArrayList;

public class Value_equal_to_index_value {

        public ArrayList<Integer> Solution(int arr[] , int n)
        {
        ArrayList<Integer> list = new ArrayList<Integer>();

            for(int i =0 ; i<n ;i++)
            {
                if(i+1==arr[i]) list.add(i+1);
            }
            System.out.println(list);
            return list;
        }
        
public static void main(String [] args)
{
    Value_equal_to_index_value result = new Value_equal_to_index_value();
    int N = 5;
    int Arr[] = {15, 2, 45, 12, 7};
    result.Solution(Arr,N);


}


}