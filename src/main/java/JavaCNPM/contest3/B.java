package JavaCNPM.contest3;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/29/2017.
 */
public class B {
    /*
    * Qui hoạch động
    * Khoi tạo 2 mảng, 1 mảng lưu độ dài tốt nhất tại thời điểm i
    * Duyệt từng phần từ 1
    * Nếu có phần tử nào đứng trước nó nhỏ hơn nó thì sẽ lấy giá trị max
    * trong mảng kết quả  + 1
    * else gán giá trị mảng độ dài tại vị trí đó bằng 1
    * Độ phức tạp O(n^2)
    *
    * 3 4 5 6 8 2 2 1 9
    * 1 2 3 4 5 1 1 1 6
    * =================
    * 7 8 9 1 2 3 4 5 6
    * 1 2 3 1 2 3 4 5 6
    * */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        // init mảng
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        //1. Cơ sở qui hoặc động
        b[0] = 1;
        int lMax;
        // qui hoạch động
        //2. xây dựng bảng phương án
        for (int i = 1; i < n; i++) {
            lMax = 0;
            //tìm xem có bao nhiêu phần tử nhỏ hơn a[i]
            for (int j = 0; j < i; j++) {
                // tìm trong số list phần tử nhỏ hơn a[i] và b[j] max
                if (a[j] < a[i] && lMax < b[j])
                    lMax = b[j];
            }

            //cập nhật giá trị vào mảng kết quả
            b[i] = lMax + 1;
        }

        int max = 0;
        //3. tìm max
        for (int i = 0; i < n; i++) {
           if(max < b[i]) max = b[i];
        }

        System.out.println(max);
    }
}
