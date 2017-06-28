package JavaCNPM.DoThi;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Hoang Ta Duy on 6/17/2017.
 */
public class BFS {


    static int chuaXet[], G[][], n;


    public static void main(String[] args) {

    }

    public static void init() {
        for (int i = 0; i < n; i++) {
            chuaXet[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (chuaXet[i] == 1)
                bfs(i);
        }
    }

    public static void bfs(int v) {
        int u;
        Queue queue = new LinkedList();
        queue.add(v);
        chuaXet[v] = 0;
        while (!queue.isEmpty()) {
            u = (int) queue.poll();
            for (int j = 0; j < n; j++) {
                if (chuaXet[j] == 1 && G[u][j] == 1) {
                    queue.add(j);
                    chuaXet[j] = 0;
                }
            }
        }
    }
}
