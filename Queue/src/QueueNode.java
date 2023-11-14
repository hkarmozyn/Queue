public class QueueNode <T> {

        private T data; //Data stored in the node
        private QueueNode<T> child; //Reference to the parent node

        //Default constructor
        public QueueNode() {

        }

        //Constructor that sets data of the node
        public QueueNode(T data) {
            this.data = data;
        }

        //Constructor that sets data, parent, and child
        public QueueNode(T data, QueueNode<T> child) {
            this.data = data;
            this.child = child;
        }

        //Returns the data stored in the node
        public T getData() {
            return data;
        }

        //Sets the data for this node
        public void setData(T data) {
            this.data = data;
        }


        public QueueNode<T> getChild() {
            return child;
        }


        public void setChild(QueueNode<T> n) {
            child = n;
        }

        //Provides a string representation of the node by converting its data to a string
        public String toString() {
            return "Node: " + this.data.toString();
        }

        //Compares the data of the node with the data of another node 'n'
        public boolean equals(QueueNode<T> n) {
            return this.data.equals(n.getData());
        }
    }

