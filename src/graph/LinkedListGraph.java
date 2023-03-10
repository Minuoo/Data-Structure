package graph;

import java.util.ArrayList;

public class LinkedListGraph {
    // vertex 번호와 가중치를 저장하는 Node 클래스
    private class Node {
        private int vertex;
        private int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        public int getVertex() {
            return this.vertex;
        }

        public int getWeight() {
            return this.weight;
        }
    }

    // 아래부터 인접리스트 구현
    private ArrayList<ArrayList<Node>> adList;
    private int size;

    public LinkedListGraph(int initSize) {
        this.adList = new ArrayList<ArrayList<Node>>();
        this.size = initSize;
        for (int i = 0; i < initSize + 1; i++)
            this.adList.add(new ArrayList<Node>());
    }

    // 아래는 가중치 그래프를 기반으로 진행
    // 만약 가중치가 없다면 weight를 단순히 1로 전달
    // 양방향 혹은 무방향 그래프인 경우 아래 활용
    public void put(int vertex_x, int vertex_y, int weight) {
        this.adList.get(vertex_x).add(new Node(vertex_y, weight));
        this.adList.get(vertex_y).add(new Node(vertex_x, weight));
    }

    // 단방향 그래프인 경우 아래 활용
    public void putSingleDirect(int vertex_x, int vertex_y, int weight) {
        this.adList.get(vertex_x).add(new Node(vertex_y, weight));
    }

    // 전체 그래프 가져오기
    public ArrayList<ArrayList<Node>> getGraph() {
        return this.adList;
    }

    // 특정 vertex의 list 정보 가져오기
    public ArrayList<Node> getVertex(int idx) {
        return this.adList.get(idx);
    }

    // 특정 vertex X와 vertex Y의 관계 반환
    public int getWeight(int vertex_x, int vertex_y) {
        return this.adList.get(vertex_x).get(vertex_y).getWeight();
    }

    // vertex가 0번 혹은 1번부터 시작할 수 있으니 startIdx를 가져온다.
    public void printGraph(int startIdx) {
        StringBuilder sb = new StringBuilder();
        for (int i = startIdx; i <= this.size; i++) {
            sb.append("정점 ").append(i).append("의 인접 정점 리스트");
            for (int j = 0; j < this.adList.get(i).size(); j++)
                sb.append(" -> ").append(this.adList.get(i).get(j).getVertex());
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
