package stack;

import java.util.Arrays;

public class ArrayIntStack implements IntStack {
    int[] values;
    int size;
    /**
     * Constructs a new object.
     */
    public ArrayIntStack() {
        values= new int[10];
    }

    /**
     * Puts the given element on the top of
     * the stack
     *
     * @param value element to be added on the top
     * of the stack
     * @throws Exception if the stack is empty
     */
    @Override
    public void push(int value)  {
        if (size==values.length){
            int[] newValues = new int[values.length*2];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values=newValues;
            values[size]=value;
            ++size;
        } else {
            values[size]=value;
            ++size;
        }

    }

    /**
     * Removes and returns the top most element of
     * the stack
     *
     * @return the top most element of the stack
     * @throws Exception if the stack is empty
     */
    @Override
    public int pop() throws Exception {
        if (getSize()==0){
            throw new Exception("The stack is empty");
        } else {
            values[size-1]=0;
            --size;
            return values[size-1];
        }

    }

    /**
     * @return the size of the stack
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Removes all elements from the stack
     */
    @Override
    public void clear() {
        values= new int[10];
        size=0;
    }

    /**
     * Prints array representation of the stack
     */
    @Override
    public void printStack() {
        for (int i = 0; i < values.length; i++) {
            if (i==0) {
                System.out.print("["+values[i]+", ");
            } else if (i==values.length-1){
                System.out.println(values[i]+"]");
            } else {
                System.out.print(values[i]+", ");
            }

        }
    }
}
