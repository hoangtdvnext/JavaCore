package JavaCNPM.algorithms;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ASUS on 5/5/2017.
 */
public class InsertionSort {

    //1. Kiểm tra nếu phần tử đầu tiên đã được sắp xếp, thì trả về 1
    //2. Lấy phần tử kế tiếp
    //3. So sánh với tất cả các phần tử trong danh sách con đã qua sắp xếp
    //4. Dịch chuyển tất cả các phần tử trong danh sách con mà lớn hơn giá trị để được sắp xếp
    //5. Chèn giá trị đó
    //6. Lặp lại cho tới khi danh sách được sắp xếp

    public static void main(String[] args) {
        List<Integer> arrInt = Arrays.asList(21, 23, 1, 4, 5, 62, 52, 14, 6, 34);
        insertionSort(arrInt);
    }

    public static void insertionSort(List<Integer> arrInt) {
        int valueToInsert;
        int holePosition;
        int i;

        // lap qua tat ca cac so
        for (i = 1; i < arrInt.size(); i++) {

            // chon mot gia tri de chon
            valueToInsert = arrInt.get(i);

            // lua chon vi tri de chen
            holePosition = i;

            // kiem tra xem so lien truoc co len hon gia tri duoc chen khong
            while (holePosition > 0 && arrInt.get(holePosition - 1) > valueToInsert) {
                arrInt.set(holePosition, arrInt.get(holePosition - 1));
                holePosition--;
                System.out.print("Di chuyen phan tu: %d\n" + valueToInsert + holePosition);
            }

            if (holePosition != i) {
                arrInt.set(holePosition, valueToInsert);
            }
        }

        System.out.println("Vong lap thu: " + i);
        arrInt.forEach(item -> System.out.print(item + " "));
    }
}
