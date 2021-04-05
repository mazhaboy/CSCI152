package queue;

public class TestQueue {
    public static void main(String[] args) throws Exception {
        ArrayIntQueue queue= new ArrayIntQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.enqueue(500);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.enqueue(600);
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        try {
            queue.dequeue();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        queue.printQueue();
        queue.printFront();
        queue.printBack();
    }
}
