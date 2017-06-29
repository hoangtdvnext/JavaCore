package JavaCNPM.algorithms;

/**
 * Created by Hoang Ta Duy on 6/25/2017.
 */
public class QHD_Balo {
    public static void main(String[] args) {
        //1. Input giá trị khoi luong và do vat
        //2. Khoi tao mang gia tri
        //3. Tao bảng
    }

    // truy vết
    public static void truyVet(int k[][], int weight[], int worth[], int n, int w) {
        System.out.println("Các phần tử nên chọn: ");
        int j = w;
        for (int i = n; i > 0; i--) {
            if (k[i][j] != k[i - 1][j]) {
                System.out.print(" " + i);
            }

            if (k[i][j] == 0)
                return;
        }
    }

    // Qui hoac dong
    public static void algorithms(int k[][], int weight[], int worth[], int n, int w) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    k[i][j] = 0;
                    continue;
                }

                if (j < weight[i]) {
                    k[i][j] = k[i - 1][j];
                    continue;
                }

                int x = j - weight[i];
                if (k[i - 1][j] > worth[i] + k[i - 1][x])
                    k[i][j] = k[i - 1][j];
                else
                    k[i][j] = worth[i] + k[i - 1][x];
            }
        }
    }
}
