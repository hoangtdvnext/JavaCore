package JavaCNPM.DoThi;

/**
 * Created by Hoang Ta Duy on 6/17/2017.
 */
public class DFS {
    // Depth First Search
    // Sử dụng Stack
    /**
     * Qui tắc 1: Duyết tiếp tới đỉnh liền kề mà chưa được duyệt. Đánh đấu đỉnh mà đã được duyệt và đẩy nó vào Stack
     * Qui tắc 2: Nếu không thấy đỉnh liền kề thì lấy 1 đỉnh trong Stack
     * Qui tắc 3: Lặp lại 1 và 2 cho tới khi Stack rỗng
     */

    static int chuaXet[], n, G[][];

    public static void dfs(int v) {
        chuaXet[v] = 0;
        int u;
        for (u = 0; u < n; u++) {
            if (G[v][u] == 1 && chuaXet[u] == 1) dfs(u);
        }
    }

    public static void init() {
        chuaXet = new int[n];
        for (int i = 0; i < n; i++) {
            chuaXet[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (chuaXet[i] == 1)
                dfs(i);
        }
    }
}
