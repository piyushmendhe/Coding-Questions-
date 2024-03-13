package Reccursion;

import java.util.Stack;

public class Insert_an_Element_at_the_Bottom_of_a_Stack {

    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty())
        {
            st.push(x);
            return st;
        }
        int n = st.pop();
        insertAtBottom(st, x);
        st.push(n);
        return st;
    }
    public static void main(String[] args) {
      Insert_an_Element_at_the_Bottom_of_a_Stack res = new Insert_an_Element_at_the_Bottom_of_a_Stack();
      int  n = 5;
      int x = 2;
      Stack<Integer> st = new Stack<>();
      st.push(4);
      st.push(3);
      st.push(2);
      st.push(1);
      st.push(8);
      System.out.println(st);

      res.insertAtBottom(st, x);

      System.out.println(st);

    }
    
}
