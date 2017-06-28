package JavaCNPM.contest2;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/13/2017.
 */
public class B {
    /* Sắp xếp nổi bọt(Bubble Sort)
    * So sánh lần lượt phần tử thứ i với i+i,
    * Nếu a[i]>a[i+1> -> Đổi chỗ
    * Tiếp tục như vậy cho tới khi mảng được sắp xếp
    * Trường hợp trung bình là Ο(n2) với n là số phần tử.
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        bubbleSort(a, n);
    }

    public static void bubbleSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            // check xem mảng đã được sắp xếp chưa để kết thúc vòng lặp, tránh việc lặp thừa
            boolean checkSwapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                // so sánh phần tử cạnh nhau-> đổi chỗ
                // Mục đích làm nổi bọt
                if (a[j] > a[j + 1]) {
                    // dao
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    // gan checkSwapped
                    checkSwapped = true;
                }
            }

            // Nếu không còn phàn tử a[i] nào > a[i+1] thì break;
            if (!checkSwapped) break;
            // hiển thị mảng sau mỗi bước sắp xếp
            display(a, n, i+1);
        }
    }

    public static void display(int a[], int n, int buoc) {
        System.out.print("Buoc " + buoc + ": ");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) System.out.print(a[i]);
            else System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
