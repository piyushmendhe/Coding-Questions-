public class Cyclically_rotate_an_array_by_one{

    
    public void rotatearray(int arr[],int n)
    {
        int last = arr[n-1];
        for(int i =1;i<n;i++)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    } 
       
}