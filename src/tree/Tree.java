package tree;

// 비선형 자료구조 : 일직선으로 나타낼 수 없는 구조
// 계층적 구조 (ex. 조직도)
/*  ※ 값을 저장하는 방식
    1. 데이터와 연결 상태를 저장할 클래스 공간(= 노드) 생성
    2. 각각의 노드들에 값 저장
    3. 노드 간 연결 상태 정의
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    ※ 용어
    루트(root) : 트리 구조 중 최상위에 존재하는 노드(1을 가리킴)
    리프(leaf) : 자식이 없는 노드
    노드(node) : 트리에서 각각의 구성 요소
    레벨(level) : 트리에서 각각의 층(깊이)을 나타내는 단어(루트 노드 : 0)
    형제 노드(sibling) : 같은 레벨의 노드
    간선(edge) : 노드와 노드를 연결하는 선
    부모 노드(parent node) : 한 노드를 기준으로 바로 상위에 존재하는 노드
    자식 노드(child node) : 한 노드를 기준으로 바로 하위에 존재하는 노드
    높이(height) : 트리 중 최고 레벨
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    ※ 종류
    이진 트리 : 자식 노드가 최대 2개인 트리
    포화 이진 트리 : 모든 노드의 차수가 2
    완전 이진 트리 : 모든 노드가 왼쪽부터 생성
    편향 이진 트리 : 모든 노드의 차수가 1
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    ※ 순회 방식
    전위 순회 : 루트를 서브 트리에 앞서서 먼저 방문(루트 -> 왼쪽 자식 -> 오른쪽 자식)
    중위 순회 : 루트를 왼쪽과 오른쪽 서브 트리 중간에 방문(왼쪽 자식 -> 루트 -> 오른쪽 자식)
    후위 순회 : 루트를 서브 트리 방문 후에 방문(왼쪽 자식 -> 오른쪽 자식 -> 루트)
*/

public class Tree {
    int count;

    public Tree() {count = 0;}
    public class Node {
        Object data;
        Node left;
        Node right;

        public Node(Object data) {
            this.data = data;
            left = null;
            right = null;
        }
        public void addLeft(Node node) {
            left = node;
            count++;
        }
        public void addRight(Node node) {
            right = node;
            count++;
        }
        public void deleteLeft() {
            left = null;
            count--;
        }
        public void deleteRight() {
            right = null;
            count--;
        }
    }

    public Node addNode(Object data) {
        Node node = new Node(data);
        return node;
    }
    public void preOrder(Node node) {
        if(node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(Node node) {
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    public void postOrder(Node node) {
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
}
