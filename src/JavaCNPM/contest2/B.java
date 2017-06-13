package JavaCNPM.contest2;

/**
 * Created by Hoang Ta Duy on 6/13/2017.
 */
public class B {
    /* Sắp xếp nổi bọt(Bubble Sort)
    * So sánh lần lượt phần tử thứ i với i+i,
    * Nếu a[i]>a[i+1> -> Đổi chỗ
    * Tiếp tục như vậy cho tới khi mảng được sắp xếp
    *
    * */

    public static void main(String[] args) {

    }

    public static void bubbleSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean checkSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                // so sánh phần tử cạnh nhau
                if (a[j] > a[j + 1]) {
                    // dao
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j] = tmp;
                    // gan checkSwapped
                    checkSwapped = true;
                }
            }

            display(a, n);
            if (checkSwapped) break;
        }
    }

    public static void display(int a[], int n) {

    }
}
