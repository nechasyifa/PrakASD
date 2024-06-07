public class GraphMatriks19 {
    int vertex;
    int[][] matriks;

    public GraphMatriks19(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public int InDegree(int node) {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != -1) {
                count++;
            }
        }
        return count;
    }

    public int OutDegree(int node) {
        int count = 0;
        for (int j = 0; j < vertex; j++) {
            if (matriks[node][j] != -1) {
                count++;
            }
        }
        return count;
    }

    public void Degree(int node) {
        int inDe = InDegree(node);
        int outDe = OutDegree(node);
        System.out.println("InDegree Gedung " + (char) ('A' + node) + "     : " + inDe);
        System.out.println("OutDegree Gedung " + (char) ('A' + node) + "    : " + outDe);
        System.out.println("Degree Gedung " + (char) ('A' + node) + "       : " + (inDe + outDe));
        System.out.println();
    }
}