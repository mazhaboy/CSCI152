package queue;

import java.util.Arrays;

public class ArrayIntQueue implements IntQueue {

    private int[] values;
    private int size;
    private int front;
    private int back;

    public ArrayIntQueue() {
        values = new int[5];
        size = 0;
        front = 0;
        back = 0;
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param value element to be added to the end of the queue
     */
    @Override
    public void enqueue(int value) {

        if (front == 0) {
            if (values.length==getSize()){
                int[] newValues = new int[values.length*2];
                System.arraycopy(values, 0, newValues, 0, values.length);
                values=newValues;
            }

        } else {
            if (values.length==getSize()){
                int[] b = Arrays.copyOfRange(values,front, values.length);
                int[] c = Arrays.copyOfRange(values,back-front, front);
                int[] newV = new int[values.length];
                System.arraycopy(b, 0, newV, 0, b.length);
                System.arraycopy(c, 0, newV, b.length, c.length);
                values=newV;
                front=0;
                back=size;
                int[] newValues = new int[values.length*2];
                System.arraycopy(values, 0, newValues, 0, newV.length);
                values=newValues;
            }
            if (back==values.length){
                back = 0;
            }

        }
        values[back] = value;
        back++;
        size++;

    }

    /**
     * Removes and returns the front most element of the queue
     *
     * @return the front most element of the queue
     * @throws Exception if thw queue is empty
     */
    @Override
    public int dequeue() throws Exception {
        if (getSize() == 0) {
            throw new Exception("Queue is empty");
        } else if (back == values.length && front != 0) {
            values[front] = 0;
            back = 0;
            front++;
            size--;
        } else {
            values[front] = 0;
            size--;
            if (front == values.length - 1) {
                front = back - 1;
            } else {
                front++;
            }

        }
        return values[front];
    }

    /**
     * @return the size of the queue
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Removes all elements from the queue
     */
    @Override
    public void clear() {
        values = new int[5];
        size = 0;
        front = 0;
        back = 0;
    }

    /**
     * Prints array representation of the queue
     */
    @Override
    public void printQueue() {
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                System.out.print("[" + values[i] + ", ");
            } else if (i == values.length - 1) {
                System.out.println(values[i] + "]");
            } else {
                System.out.print(values[i] + ", ");
            }
        }
    }

    @Override
    public void printBack() {
        System.out.println(back);
    }

    @Override
    public void printFront() {
        System.out.println(front);
    }
}
