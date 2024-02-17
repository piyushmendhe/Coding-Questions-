package Reccursion;

public class SumFirstNnum {
    //Parameterized
    public void Adding(int sum,int N)
    {
        if(N<1)
        {
            System.out.println(sum);
            return;
        }
        Adding(sum+N,N-1);
    }

    //Functional

    public int Adding(int N)
    {
        if(N==0) return 0;

        return N + Adding(N-1);

    }

    public static void main(String[] args) {

        SumFirstNnum res = new SumFirstNnum();
        res.Adding(0,5);
        System.out.println(res.Adding(10));

}
}
