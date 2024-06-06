public class Graph19 {
    int vertex;
    DoubleLinkedLists19 list[];

    public Graph19(int v) {
        vertex = v;
        list = new DoubleLinkedLists19[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists19();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
        }
        // outDegree
        totalOut = list[asal].size();

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean cekJalur(int asal, int tujuan) throws Exception {
        boolean[] visited = new boolean[vertex];
        if (list[asal].size() > 0 && list[asal].getFirst() == tujuan) {
            return true;
        } else {
            return !cekKeterhubungan(asal, tujuan, visited);
        }
    }
    
    public boolean cekKeterhubungan(int asal, int tujuan, boolean[] visited) throws Exception {
        if (asal == tujuan)
            return false;
    
        visited[asal] = true;
        for (int i = 0; i < list[asal].size(); i++) {
            int neighbor = list[asal].get(i);
            if (!visited[neighbor]) {
                if (neighbor == tujuan)
                    return true;
                if (!cekKeterhubungan(neighbor, tujuan, visited)) {
                    return false;
                }
            }
        }
        return true;
    }
}    