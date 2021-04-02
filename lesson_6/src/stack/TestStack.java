package stack;

import java.util.ArrayList;

public class TestStack {
    public static void main(String[] args) {
        ArrayIntStack stack =  new ArrayIntStack();
        pushStack(stack,11);
        stack.printStack();
        System.out.println(stack.getSize());
        stack.clear();
        stack.printStack();
        pushStack(stack,21);
        System.out.println(stack.getSize());
        stack.printStack();
        stack.clear();
        pushStack(stack,2);
        stack.printStack();
        System.out.println(stack.getSize());
        try{
            System.out.println(stack.pop());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        stack.printStack();
        System.out.println(stack.getSize());
        try{
            System.out.println(stack.pop());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        stack.printStack();
        System.out.println(stack.getSize());



    }
    public static void pushStack(ArrayIntStack stack, int nbr){
        for (int i=1; i<=nbr; i++) {
            stack.push(i);
        }
    }

}
