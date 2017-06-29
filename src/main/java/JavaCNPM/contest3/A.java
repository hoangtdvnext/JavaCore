package JavaCNPM.contest3;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/28/2017.
 */
public class A {
    /*Bài toán xâu con chung lớn nhất
    * Sử dụng thuật toán qui hoạch động
    * Độ phức tạp:m O(m*n)
    * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        int arr[][] = new int[500][500];
        createTable(arr, str1.toCharArray(), str2.toCharArray());
    }

    public static void createTable(int arr[][], char str1[], char str2[]) {
        int length1 = str1.length;
        int length2 = str2.length;

        for (int i = 0; i <= length1; i++) {
            for (int j = 0; j <= length2; j++) {
                //1. xét hàng và cột đầu bằng 0, để có trường hợp sẽ k có xâu con chung nào
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                    continue;
                }
                //2. kiểm tra nếu có phần tử giống nhau thì sẽ lấy giá trị hàng i-1 và cột j-1 công thêm 1
                if (str1[i - 1] == str2[j - 1]) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                }
                // nếu khác nhau, thì kiểm tra giá trị hàng [i-1][j] và [i][j-1]
                else {
                    arr[i][j] = (arr[i - 1][j] > arr[i][j - 1]) ? arr[i - 1][j] : arr[i][j - 1];
                }
            }
        }

        //3. Giá trị cuối cùng của bảng là giá trị cần tìm
        System.out.println(arr[length1][length2]);
    }

    public static void truyVet(int arr[][], char str1[], char str2[]) {
        for (int i = str1.length; i > 0; ) {
            for (int j = str2.length; j > 0; ) {
                if (str1[i - 1] == str2[j - 1]
                        && arr[i - 1][j - 1] == arr[i - 1][j]
                        && arr[i - 1][j - 1] == arr[i][j - 1]) {

                    System.out.println(str1[i - 1]);
                }

                if (arr[i - 1][j - 1] >= arr[i - 1][j]
                        && arr[i - 1][j - 1] >= arr[i][j - 1]) {
                    i--;
                    j--;
                } else if (arr[i][j - 1] > arr[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }

                if (arr[i][j] == 0) {
                    return;
                }
            }
        }
    }
}
