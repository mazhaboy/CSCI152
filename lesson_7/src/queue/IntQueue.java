package queue;

public interface IntQueue {
    /**
     * Adds an element to the end of the queue.
     *
     * @param value element to be added to the end of the queue
     */
    public void enqueue(int value);

    /**
     * Removes and returns the front most element of the queue
     *
     * @return the front most element of the queue
     * @throws Exception if thw queue is empty
     */
    public int dequeue() throws Exception;

    /**
     * @return the size of the queue
     */
    public int getSize();

    /**
     * Removes all elements from the queue
     */
    public void clear();

    /**
     * Prints array representation of the queue
     */
    public void printQueue();

    /**
     * Prints back of the queue
     */
    public void printBack();

    /**
     * Prints front of the queue
     */
    public void printFront();

}
