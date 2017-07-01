package JavaCNPM.contest3;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/29/2017.
 */
public class C {

    /**
     * Dãy con có tổng bằng S
     * <p>
     * Giải thuật
     * Đặt L[i, t] = 1 nếu có thể tạo ra tổng t từ một dãy con của dãy gồm các phần tử A1, A2...Ai, ngược lại thì L[i,t] = 0
     * Nếu L[n,S] = 1 thì đáp án của bài toán trên là "có"
     * <p>
     * Ta có thể tính L[i,t] theo công thức: L[i,t] = 1 nếu L[i-1,t] = 1 hoặc L[i-1, t-a[i]] = 1
     * <p>
     * Nhìn công thức trên này thì ta cần dùng bảng hai chiều. Nhưng thấy rằng, để tính dòng thứ i ta chỉ cần tính dòng i - 1.
     * Bảng phương án khi đó chỉ cần 1 mảng 1 chiều L[0..S] và được tính như sau
     * <p>
     * <p>
     * L[t]:=0, L[0] = 1;
     * for i:1 to n do
     * for t:=S downto a[i] do
     * if(L[t] =0 and L[t-a[i]] =1) then L[t] = 1;
     * <p>
     * Độ phức tạp: O(n * m): m là tổng của n số.
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//6
        int s = sc.nextInt();//13
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        gt(a, n, s);
    }

    public static void gt(int a[], int n, int s) {
        int l[] = new int[s + 1];
        l[s] = 0;
        l[0] = 1;

        // l[i,t] = 1 nếu l[i-1,t] = 1 hoặc l[i-1, t-a[i]] =1
        for (int i = 1; i <= n; i++) {
            for (int j = s; j >= a[i]; j--) {
                if (l[j] == 0 && l[j - a[i]] == 1)
                    l[j] = 1;

                if (l[s] == 1) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
