package graph;

public class ArrayGraph {
    private int[][] adArray;
    private int size;

    public ArrayGraph(int size) {
        // 그래프 생성
        // 1번부터 정점이 시작될 수 있으니 +1 하여 생성
        this.adArray = new int[size + 1][size + 1];
        this.size = size;
    }

    // 양방향 가중치 그래프를 가정하여 weight 전달
    // 만약 가중치가 없는 그래프라면 1로 전달
    public void put(int vertex_y, int vertex_x, int weight) {
        this.adArray[vertex_y][vertex_x] = this.adArray[vertex_x][vertex_y] = weight;
    }

    // 단방향 그래프 정보 추가
    public void putSingle(int vertex_y, int vertex_x, int weight) {
        this.adArray[vertex_y][vertex_x] = weight;
    }

    // 전체 그래프 가져오기
    public int[][] getGraph() { return this.adArray; }

    // 특정 Vertex의 인접 Vertex 정보를 1차원 배열로 반환하기
    public int[] getVertex(int idx) { return this.adArray[idx]; }

    // 특정 vertex X와 vertex Y의 관계 반환
    public int getWeight(int vertex_y, int vertex_x) { return this.adArray[vertex_y][vertex_x]; }

    public void printGraph() {
        StringBuilder sb = new StringBuilder();
        sb.append("인접 행렬을 구현한 2차원 배열 내역\n");
        for(int i = 0; i < this.adArray.length; i++) {
            for(int j = 0; j < this.adArray[i].length; j++)
                sb.append(this.adArray[i][j]).append(" ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
