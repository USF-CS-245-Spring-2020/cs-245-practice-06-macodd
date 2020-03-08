package Practice06;

/**
 * Practice assigment 06:
 *      Node<T> class
 *
 * @author : mcodd
 * @param <T>: data type of Node
 *
 * Node elements used to store data to be
 * used by Linked List
 */

public class Node<T> {

    protected T data;  // data stored in Node with type T
    protected Node<T> next;  // Node linked to this Node

    /**
     * Constructor: Node
     * @param data: Data to be stored in Node
     */
    public Node(T data){
        this.data = data;  // stores passed data
        this.next = null;  // sets next Node to null
    } // end constructor

    /**
     * Constructor Node
     * @param data: Data to be stored in Node
     * @param next: Node linked to this Node
     */
    public Node(T data, Node<T> next){
        this.data = data;  // stores passed data
        this.next = next;  // sets next Node to passed Node
    } // end constructor

} // end Node
