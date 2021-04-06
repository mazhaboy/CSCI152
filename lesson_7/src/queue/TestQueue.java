package queue;

public class TestQueue {

    public static void main(String[] args) throws Exception {

        ArrayIntQueue queue= new ArrayIntQueue();
        enqueueToQueue(queue,6,0);
        dequeueFromQueue(queue,3);
        enqueueToQueue(queue,8,111);
        queue.printFront();
        queue.printBack();
        queue.printQueue();
        try {
            dequeueFromQueue(queue,12);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            queue.printQueue();
        }


    }
    public static void enqueueToQueue(ArrayIntQueue queue, int nbr, int val) {
        for (int i = 1; i <= nbr; i++) {
           queue.enqueue(i+val);
        }
        queue.printQueue();
    }
    public static void dequeueFromQueue(ArrayIntQueue queue, int nbr) throws Exception{
        for (int i = 1; i <= nbr; i++) {
                queue.dequeue();
        }
        queue.printQueue();
    }
}
