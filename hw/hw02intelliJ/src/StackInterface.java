/**
 * Interface detailing the methods required for implementing a Stack.
 * DO NOT EDIT THIS FILE!
 *
 * @author CS 1332 TAs
 * @version 1.1
 */
public interface StackInterface<T> {
    public static final int INITIAL_CAPACITY = 10;

    /**
     * Push a new item onto the stack with the given data.
     *
     * This method should be implemented in O(1) time for the linked list-backed
     * implementation and amortized O(1) time for the array-backed
     * implementation.
     *
     * For array-backed implementations, double the size of the backing array if
     * it is full and you are trying to add another item.
     *
     * @param item the data to push.
     * @throws IllegalArgumentException if data is null.
     */
    void push(T item);

    /**
     * Pop from the stack.
     *
     * This method should be implemented in O(1) time.
     *
     * For array-backed implementations:
     * - you do not need to shrink the backing array.
     * - you must put {@code null} in the popped element's slot.
     *
     * @return the data from the top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty.
     */
    T pop();

    /**
     * Return the size of the stack.
     *
     * This method should be implemented in O(1) time.
     *
     * @return number of items in the stack
     */
    int size();

    /**
     * Return true if empty, false otherwise.
     *
     * This method should be implemented in O(1) time.
     *
     * @return boolean representing whether the list is empty
     */
    boolean isEmpty();
}
