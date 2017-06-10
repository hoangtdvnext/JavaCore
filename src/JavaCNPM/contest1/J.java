package JavaCNPM.contest1;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/11/2017.
 */
public class J {
    /*khai bao bien*/
    static int ok = 1;
    static int n, k, a[], b[] = new int[100];

    public static void next() {
        a = new int[]{0, 3, 4, 5, 6};//2 3 5
        b = new int[]{0, 3, 4, 5, 6};
        sinhTH();
        xuat();
    }

    /*
    * B1. Khởi tạo cấu hình đầu tiên
    * B2: Lặp nếu chưa tìm thấy tổ hợp cuối cùng
    *   B2.1 Xuất tổ hợp hiện tại
    *   B2.2 Tìm tổ hợp kế tiếp
    *       B2.1.1 i = k
    *           Bắt đầu từ cuối tổ hợp hiện tại,
    *           tìm a[i] sao cho a[i] != n+i-k;
    *       B2.1.2 Cập nhật a[i] = a[i] + 1;
    *       B2.1.3 Nếu i>0 thì cập nhật nốt các phần tử chỉ số i của tổ hợp a[j] = a[i] + j - i;
    *           ngược lại thì kết thúc
    * */
    public static void sinhTH() {
        //2.1.Gan i = vi tri chap k cua n
        int i = k;
        //2.1.1 tim a[i] != n+i-k
        while (i > 0 && a[i] == n + i - k) i--;
        if (i > 0) {
            //2.1.2 -> cap nhat lai a[i] = a[i] + 1
            a[i]++;
            //2.1.3 gan lai gia tri tu vi tri i+1 -> k
            // a[j] = a[i] + j - i;
            for (int j = i + 1; j <= k; j++) {
                a[j] = a[i] + j - i;
            }
        } else {
            ok = 0;
        }
    }

    public static void xuat() {
        int i = 1;
        int dem = 0;
        while (i <= k) {
            if (a[i] == b[i]) dem++;
            i++;
        }

        if (dem == 0) System.out.println(k);
        else System.out.println(dem);
    }

    public static void main(String[] args) {
        ok = 1;
        n = new Scanner(System.in).nextInt();
        k = new Scanner(System.in).nextInt();
        next();
    }
}
