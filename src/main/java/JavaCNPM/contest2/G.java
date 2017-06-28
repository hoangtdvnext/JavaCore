package JavaCNPM.contest2;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/13/2017.
 */
public class G {
    /*
    * Thuật toán Tìm kiếm nhị phân
    * Ý tưởng:
    * So sánh giá trị cần tìm với phần tử giữa của danh sách -> có 3 khả năng
    * 1. a[mid]> x->  Tìm phía trái a[mid]
    * 2. a[mid]< y-> Tìm bên phải a[mid]
    * 3. Chính là phần tử giữa -> return
    *
    * Example: x = 2
    * ------1 2 3 4 5 6 7 8 9 10
    *
    * ________________Các bước thực hiện_________________
    * B1. Sắp xếp các dãy theo thứ tự nhất định
    * B2. gán left = 0; right = n-1
    * B3. Lặp tới khi left > right
    *   Gán mid = (left+right)/2;
    *   if(a[mid] == x) return;
    *   if(a[mid] > x) right = mid -1 -> Tìm phía trái phần tử mid
    *   if(a[mid] < x) left = mid  + 1-> Tìm phía bên phải mid
    * B4. Trả về kết quả tìm thấy hoặc không tìm thấy
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int size = input.nextInt();
            int x = input.nextInt();
            int a[] = new int[size];
            for (int j = 0; j < size; j++) {
                a[j] = input.nextInt();
            }

            int result = binarySearch(a, size, x);
            if (result != -1) {
                System.out.println(result + 1);
            } else {
                System.out.println(-1);
            }
        }
    }

    // search dequi
    public static int searchDQ(int a[], int l, int r, int x) {
        int mid = (l + r) / 2;

        if (a[mid] == x) return mid;
        else if (a[mid] > x) searchDQ(a, l, mid - 1, x);
        else searchDQ(a, mid + 1, r, x);

        return -1;
    }

    // search binarySearch
    public static int binarySearch(int a[], int n, int x) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) return mid;
            else if (a[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    // nếu mảng chưa sắp xếp -> Sắp xếp nó tăng or giảm nhất định
    public static int[] sort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j] > a[i]) {
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }

        return a;
    }
}
