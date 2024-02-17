package Reccursion;

public class Nto1Backtracking {

    public void Printing(int n)
    {
        
        if (n<=0) {
            return;
        }
        System.out.println(n); 
        Printing(n-1);
    }

    public static void main(String[] args)
    {
        Nto1Backtracking res = new Nto1Backtracking();
        res.Printing(5);
    }

    
}
