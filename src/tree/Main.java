package tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // 노드 생성
        Tree.Node node1 = tree.addNode(1);
        Tree.Node node2 = tree.addNode(2);
        Tree.Node node3 = tree.addNode(3);
        Tree.Node node4 = tree.addNode(4);
        Tree.Node node5 = tree.addNode(5);
        Tree.Node node6 = tree.addNode(6);
        Tree.Node node7 = tree.addNode(7);

        // 트리 연결관계 생성
        node1.addLeft(node2);
        node1.addLeft(node3);
        node2.addLeft(node4);
        node2.addLeft(node5);
        node3.addLeft(node6);
        node3.addLeft(node7);
    }
}
