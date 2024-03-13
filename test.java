import java.util.ArrayList;

public class test {

    String[] keys = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public ArrayList <String> possibleWords(int a[], int N)
    {
        ArrayList<String> ans = new ArrayList<>();
        possi(N,a,ans,"",0);
        return ans;
    }
    private void possi(int N , int[] a, ArrayList<String> ans,String temp,int count)
    {
        if(count==N)
        {
            ans.add(temp);
            return;
        }
        for(int i = 0 ;i< keys[a[count]].length();i++)
        {
            possi(N,a,ans,temp+keys[a[count]].charAt(i),count+1);
        }
    }


    public static void main(String[] args) {
        int N = 3, a[] = {2, 3, 4};
        test res = new test();
        
        System.out.println(res.possibleWords(a, N));
    }
}
