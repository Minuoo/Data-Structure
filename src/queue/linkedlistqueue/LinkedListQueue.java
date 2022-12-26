package queue.linkedlistqueue;

public class LinkedListQueue {
    public class Node {
        int value;
        Node node;

        public Node(int value) {
            this.value = value;
            node = null;
        }
        public int getValue() {return value;}
        public Node getNextNode() {return node;}
        public void setNextNode(Node node) {this.node = node;}
    }

    private Node front, rear;

    public LinkedListQueue() {front = rear = null;}
    public boolean isEmpty() {
        if(front == null && rear == null)
            return true;
        else
            return false;
    }
    public void enqueue(int value) {
        Node node = new Node(value);
        if(isEmpty())
            front = rear = node;
        else {
            front.setNextNode(node);
            front = node;
        }
    }
    public Node dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        } else {
            Node popNode = rear;
            rear = rear.getNextNode();
            return popNode;
        }
    }
    public Node peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return rear;
    }
    public int size() {
        Node tempFront = front;
        Node tempRear = rear;
        int count = 0;

        while(tempFront != tempRear && tempRear != null) {
            count++;
            tempRear = tempRear.getNextNode();
        }

        return count;
    }
}
