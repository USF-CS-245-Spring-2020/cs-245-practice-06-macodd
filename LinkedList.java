package Practice06;

/**
 * Practice assigment 06:
 *      Linked List
 *
 * @author mcodd.
 * @param <T> Data type.
 *
 * Linked List algorithm with functions
 *           add, add +, get, remove, size.
 *
 */

public class LinkedList<T> implements List<T> {

    private int size;  // list size
    private Node<T> head;  // first Node of list

    /**
     * Constructor: LinkedList()
     * Initializes size and head variables.
     */
    public LinkedList(){
        this.size = 0;
        this.head = null;
    } // end constructor

    /**
     * Function: add()
     * @param item: data to be stored in Node
     */
    public void add(T item){

        if(this.head == null) {
            this.head =  new Node<T>(item); // head points to new Node
        }
        else {

            Node<T> curr = this.head;  // first Node of list

            while (curr.next != null)
                curr = curr.next;  // grab next Node until null its reached

            curr.next = new Node<T>(item);  // add Node to the end of list
        } // endif

        this.size++;  // increment size
    } // end add()

    /**
     * Function: add()+
     * @param pos: index of element to be placed in
     * @param item: data to be added to Node
     * @throws Exception: position out of bounds
     */
    public void add(int pos, T item) throws Exception{

        if(pos > this.size || pos < 0)
            throw new Exception("Linked List out of bounds");

        if(this.head == null) {
            this.head =  new Node<T>(item);  // head points to new Node
        }
        else {

            Node<T> curr = this.head;  // first element of list
            Node<T> prev = null;  // Node to store previous element

            for(int i = 0; i < pos; i ++){
                prev = curr;  // current Node stored in previous
                curr = curr.next;  // current Node becomes next element
            }

            if(prev != null)
                prev.next = new Node<T>(item, curr); // assign rest of list to new Node
        } // endif

        this.size++;  // increment size
    } // end add()+

    /**
     * Function: get()
     * @param pos: index of element
     * @return T: data stored in Node
     * @throws Exception: Out of bounds
     */
    public T get(int pos) throws Exception{

        if(pos > this.size || pos < 0)
            throw new Exception("Linked List out of bounds");

        Node<T> curr = this.head;  // grab first Node in list

        for(int i = 0; i < pos; i ++)
            curr = curr.next;  // current Node becomes next Node

        return curr.data;  // return data from Node
    } // end get()

    /**
     * Function: remove()
     * @param pos: index of element
     * @return T: data stored in Node
     * @throws Exception: out of bounds
     */
    public T remove(int pos) throws Exception{

        if(pos > this.size || pos < 0)
            throw new Exception("Linked List out of bounds");

        Node<T> curr = this.head;  // first element of list
        Node<T> prev = null;  // Node to store previous element

        for(int i = 0; i < pos; i ++){
            prev = curr;  // current element stored in previous
            curr = curr.next;  // current element becomes next element
        } // endfor

        if(prev != null)
            prev.next = curr.next;  // previous Node's next becomes current's next Node

        this.size--;  // decrease size of list

        return curr.data;  // returns data stored in Node

    } // end remove()

    /**
     * Function: size()
     * @return int: current size of list
     */
    public int size(){

        return this.size;
    } // end size()

} // end LinkedList
