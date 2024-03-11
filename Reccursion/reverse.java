package Reccursion;

import java.util.Arrays;

public class reverse {

    public void reversed(int[] arr)
    {
        int l = 0;
        int n = arr.length;
        // swap(l,n,arr);
        twap(l,n,arr);
    }
    // public void swap(int l,int r, int[] arr)
    //     {
    //         if(l>=r) return;

    //         swap(l+1,r-1,arr);
    //         int temp = arr[l];
    //         arr[l] = arr[r];
    //         arr[r] = temp;
            
    //     }

        public void twap(int l,int n, int[] arr)
        {
            if(l>=n/2) return;

            twap(l+1,n-l-1,arr);
            int temp = arr[l];
            arr[l] = arr[n-1];
            arr[n-1] = temp;
            
        }

        public static void main(String[] args) {
            reverse red = new reverse();
            int[] arr = {1,2,3,4,5};
            red.reversed(arr);
            System.out.println("Reversed array: " + Arrays.toString(arr));
        }
}
