package Practice06;

/**
 * Practice assigment 06:
 *      ArrayList
 *
 * @author mcodd.
 * @param <T> Data type.
 *
 * ArrayList algorithm with functions
 *           add, add +, get, remove, size.
 *
 */

public class ArrayList<T> implements List<T> {

    private int size;  // Array size
    private T[] arr;

    /**
     * ArrayList Constructor
     */
    public ArrayList() {
        this.size = 0;
        this.arr = (T[]) new Object[10];  // Create data type array
    } // end constructor()

    /**
     * Function: add()
     * @param item: element to be added to array list
     */
    public void add(T item){

        if(this.size == this.arr.length)
            doubledArray();  // if array is full, size gets doubled.

        this.arr[this.size++] = item;  // add item to index size
    } // end add()

    /**
     * Function: add()+
     * @param pos: index in array to place element
     * @param item: element to be added to array
     * @throws Exception: thrown if index is out of bound
     */
    public void add(int pos, T item) throws Exception {

        if(pos > this.size || pos < 0)
            throw new Exception("ArrayList out of bounds");

        if(this.size == this.arr.length)
            doubledArray();  // if array is full, size gets doubled.

        for(int i = this.size - 1; i >= pos; i--)
            this.arr[i + 1] = this.arr[i];  // moves elements from the end of array one index up.

        this.arr[pos] = item;  // places element in desire index
        this.size++;
    } // end add()+

    /**
     * Function: get()
     * @param pos: index in array to place element
     * @return T: data from requested index
     * @throws Exception: thrown if index is out of bound
     */
    public T get(int pos) throws Exception {

        if(pos > this.size || pos < 0)
            throw new Exception("ArrayList out of bounds");

        return this.arr[pos];  // data from index
    } // end get()

    /**
     * Function: remove()
     * @param pos: index in array to remove element
     * @return T: data from requested index
     * @throws Exception: thrown if index is out of bound
     */
    public T remove(int pos) throws Exception {

        if(pos > this.size || pos < 0)
            throw new Exception("ArrayList out of bounds");

        T item = this.arr[pos];  // data from index

        for(int i = pos; i < this.size - 1; i++)
            this.arr[i] = this.arr[i + 1];  // moves elements from the end of array one index up.

        this.size--;
        return item;
    } // end remove()

    /**
     * Function: size()
     * @return : size of array
     */
    public int size(){

        return this.size;
    } // end size()

    /**
     * Function: doubleArray()
     * Use to double size of array if size of array equals
     * length of array.
     */
    private void doubledArray(){

        int n = this.arr.length * 2;  // new size
        T[] copyArray = (T[]) new Object[n];

        System.arraycopy(this.arr, 0, copyArray, 0, this.arr.length);  // Copy old array into new array

        this.arr = copyArray;  // reference old array as new
    } // doubleArray()

} // end ArrayList
