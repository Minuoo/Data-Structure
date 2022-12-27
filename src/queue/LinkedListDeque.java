package queue;

// 앞, 뒤에서 삽입고 ㅏ삭제가 가능한 자료구조 -> 스택 + 큐

public class LinkedListDeque {
    Node front;
    Node rear;

    public LinkedListDeque() {
        front = null;
        rear = null;
    }
    public class Node {
        char data;
        Node rlink;
        Node llink;
    }

    public boolean isEmpty() {return (front == null);}
    public void insertFront(char item) {
        Node newNode = new Node();
        newNode.data = item;

        if(isEmpty()) {
            front = newNode;
            rear = newNode;
            newNode.rlink = null;
            newNode.llink = null;
        } else {
            front.llink = newNode;
            newNode.rlink = front;
            newNode.llink = null;
            front = newNode;
        }
        System.out.println("Front Inserted Item : " + item);
    }
    public void insertRear(char item) {
        Node newNode = new Node();
        newNode.data = item;

        if(isEmpty()) {
            front = newNode;
            rear = newNode;
            newNode.rlink = null;
            newNode.llink = null;
        } else {
            rear.rlink = newNode;
            newNode.rlink = null;
            newNode.llink = rear;
            rear = newNode;
        }
        System.out.println("Rear Inserted Item : " + item);
    }
    public char deleteFront() {
        if(isEmpty()) {
            System.out.println("Front Deleting fail! DQueue is empty!!");
            return 0;
        } else {
            char item = front.data;

            if(front.rlink == null) {
                front = null;
                rear = null;
            } else {
                front = front.rlink;
                front.llink = null;
            }
            return item;
        }
    }
    public char deleteRear() {
        if(isEmpty()) {
            System.out.println("Rear Deleting fail! DQueue is empty!!");
            return 0;
        } else {
            char item = rear.data;

            if(rear.llink == null) {
                rear = null;
                front = null;
            } else {
                rear = rear.llink;
                rear.rlink = null;
            }
            return item;
        }
    }
    public char peekFront() {
        if(isEmpty()) {
            System.out.println("Front Peekinkg fail! DQueue is empty!!");
            return 0;
        } else
            return front.data;
    }
    public char peekRear() {
        if(isEmpty()) {
            System.out.println("Rear Peeking fail! DQueue is empty!!");
            return 0;
        } else
            return rear.data;
    }
    public void printDQueue() {
        if(isEmpty())
            System.out.println("DQueue is empty!!");
        else {
            Node temp = front;
            System.out.print("DQueue>> ");
            while(temp != null) {
                System.out.print(temp.data + ", ");
                temp = temp.rlink;
            }
            System.out.println();
        }
    }
}
