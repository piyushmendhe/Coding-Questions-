package LoveBabbarSheet.Arrays;

public class PalindromicArray {

    public int checkPallin(int arr[],int N)
    {
        
        for (int i = 0 ;i<N; i++)
        {   int origi = arr[i];
            int rev=0;

            while(origi!=0)
            {
                int digit = origi%10;
                rev = rev*10+digit;
                origi/=10;
            }
            if(arr[i]==rev)continue;
            else return 0;
        }
        return 1;
    }

//Alternate solution 

    public int Alternatesoln(int arr[],int N)
    {
        for(int i=0;i<N;i++)
        {
            String word = String.valueOf(arr[i]);
            int f=0;
            int b=word.length()-1;
                  while(b>f)
                  {
                    if(word.charAt(b)!=word.charAt(f))
                    {
                        return 0;
                    }
                    
                    f++;
                    b--;
                  }     
        }
        return 1;
    }





    public static void main(String[] args) {

        PalindromicArray result = new PalindromicArray();

       int N =5;
       int Arr[]  ={111,222,333,444,555};
       int a = result.checkPallin(Arr, N);
       int b = result.Alternatesoln(Arr, N);
       System.out.println(a);
       System.out.println(b);
        
    }

    
}