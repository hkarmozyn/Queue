public class Queue <T> {
    private int size;
    private QueueNode front;
    private QueueNode back;

    public Queue() {

    }

    public void enqueue(T element) {
        QueueNode n = new QueueNode(element);
        size++;
        if(size==0){
            n = front;
        }else{
            n.setChild(back);
            n = back;
        }


    }

    public T dequeue(){
        T data = (T)front.getData();
        front = front.getChild();
        if(front==null){
            back=null;
        }
        return data;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    public int getSize() {
        return size;
    }
    public T peek(){
        return (T)front.getData();

    }
}
