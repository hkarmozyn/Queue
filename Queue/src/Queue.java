/*
HK
11/17/23
CZ
 */
public class Queue <T> {
    private int size; // size
    private QueueNode<T> front = new QueueNode<>(); // the front of the queue
    private QueueNode<T> back= new QueueNode<>();// the back of the queue

    public Queue() { // default constructor

    }

    public void enqueue(T element) { // enqueue adds element
        QueueNode<T> n = new QueueNode<>(element);

        if(isEmpty()){ // checks if the queue is empty
            front = n;
        }else{ // if the queue isn't empty it adds the element to the next open spot
            back.setChild(n);
        }
        back = n;
        size++;


    }

    public T dequeue(){ // method for dequeue to remove elements from the queue
        if(size>= 1) { // checks to see if size is greater than 0
            T data = front.getData();
            front = front.getChild();
            size--;
            return data;
        }
        if(front==null){ // if the queue is empty it returns nulll
            back=null;
        }
        return null;
    }
    public boolean isEmpty(){ // methodd to check if the queue is empty
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    public int size() {
        return size;
    } // returns size
    public T peek(){ // returns the first element in the queue
        return front.getData();

    }
}
