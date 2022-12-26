package stack.linkedliststack;

public class LinkedListStack {
    public class Node {
        private int item;
        private Node node;
        public Node(int item) {
            this.item = item;
            this.node = node;
        }
        private void linkNode(Node node) {this.node = node;}
        private int getData() {return this.item;}
        private Node getNextNode() {return this.node;}
    }

    Node top;
    public LinkedListStack() {
        this.top = null;
    }
    public void push(int data) {
        Node node = new Node(data);
        node.linkNode(top);
        top = node;
    }
    public void pop() {
        top = top.getNextNode();
    }
    public int peek() {
        return top.getData();
    }
}
