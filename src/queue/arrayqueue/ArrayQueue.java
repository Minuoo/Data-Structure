package queue.arrayqueue;

public class ArrayQueue {
    int MAX = 1000;
    int front; //머리 쪽에 위치할 index, pop할 때 참조하는 index
    int rear; //꼬리 쪽에 위치할 index, push할 때 참조하는 index
    int[] queue;

    public ArrayQueue() {
        front = rear = 0;
        queue = new int[MAX];
    }
    public boolean isEmpty() {return front == rear;}
    public boolean isFull() {
        if(rear == MAX - 1)
            return true;
        else
            return false;
    }
    public int size() {return front - rear;}
    public void enqueue(int value) {
        if(isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        queue[rear++] = value;
    }
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int popValue = queue[front++];
        return popValue;
    }
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int popValue = queue[front];
        return popValue;
    }
}
