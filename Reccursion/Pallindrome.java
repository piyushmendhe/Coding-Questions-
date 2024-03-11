package Reccursion;

public class Pallindrome {

    public boolean pallin(String S)
    {
        int l = 0;
        int r = S.length()-1;
        char[] arr= S.toCharArray();
        return check(l, r, arr);
    }
    public boolean check(int l, int r, char[] arr)
    {
        if(l>=r) return true;

        if(arr[l]!=arr[r]) return false;
        return check(l+1,r-1, arr);        
    }

    public static void main(String[] args) {
        
        String arr = "MADAM";
        Pallindrome P = new Pallindrome();
        System.out.println(P.pallin(arr));
    }
    
}
