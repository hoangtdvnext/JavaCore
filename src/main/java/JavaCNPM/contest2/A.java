package JavaCNPM.contest2;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/12/2017.
 */
public class A {
    /*
    * Sắp xếp chèn(InsertionSort): Độ phức tạp O(n^2)
    * B1. Kiểm tra nếu phần tử đầu tiên đã được sắp xếp -> Trả về 1
    * B2. Lấy phần tử kế tiếp
    * B3. So sánh với tất cả các phần tử trong danh sách con đã qua sắp xếp
    * B4. Di chuyển tất cả các phần tử trong danh sách con mà lớn hơn giá trị để được sắp xếp
    * B5. Chèn giá trị đó
    * B6. Lặp lại cho tới khi danh sách được sắp xếp
    *
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        insertionSort(a, n);
    }

    public static void insertionSort(int a[], int n) {
        //1.vi tri insert and value
        int vt;
        int value;
        //2. for sort
        for (int i = 0; i < n; i++) {
            // chon 1 gia tri de chen
            value = a[i];
            vt = i;
            // kiem tra neu co phan tu vt-1 lon hon vt thi doi cho
            while (vt > 0 && a[vt - 1] > value) {
                // doi cho a[vt] cho a[vt-1]
                a[vt] = a[vt - 1];
                // giam bien vt de tim phan tu tiep theo
                vt--;
            }

            // chen gia tri tai vi tri tren
            a[vt] = value;
            // show gia tri mang
            display(a, i);
        }
    }

    public static void display(int a[], int n) {
        System.out.print("Buoc " + n + ": ");
        for (int i = 0; i <= n; i++) {
            if (i == n) System.out.print(a[i]);
            else System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
