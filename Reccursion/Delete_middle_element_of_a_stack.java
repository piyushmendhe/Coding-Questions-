package Reccursion;

import java.util.Stack;

public class Delete_middle_element_of_a_stack {

    public void deleteMid(Stack<Integer>stack,int sizeOfStack){
        
        if(stack.size()==(sizeOfStack+1)/2)
        {
            stack.pop();
            return;
        }
        int n = stack.pop();
        deleteMid(stack, sizeOfStack);
        stack.push(n);
    }

    public static void main(String[] args) {
        
        int sizeOfStack = 5;
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        Delete_middle_element_of_a_stack res = new Delete_middle_element_of_a_stack();
        System.out.println(stack);
        res.deleteMid(stack, sizeOfStack);
        System.out.println(stack);

    }
}
