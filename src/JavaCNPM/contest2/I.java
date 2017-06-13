package JavaCNPM.contest2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by ASUS on 6/13/2017.
 */
public class I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = Integer.parseInt(input.nextLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(input.nextLine());
            //enqueue: thêm (hay lưu trữ) một phần tử vào trong hàng đợi.
            //dequeue(): xóa một phần tử từ hàng đợi.
            //peek(): lấy phần tử ở đầu hàng đợi, mà không xóa phần tử này.
            //isFull(): kiểm tra xem hàng đợi là đầy hay không.
            //isEmpty(): kiểm tra xem hàng đợi là trống hay hay không.
            //poll(): Lấy ra và xóa phần tử trong hàng đợi
            //cuoi ================> đầu
            Queue queue = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                String str[] = input.nextLine().split(" ");
                int key = Integer.parseInt(str[0]);
                switch (key) {
                    case 1:
                        System.out.println(queue.size());
                        break;
                    case 2:
                        if (queue.isEmpty()) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                        break;
                    case 3:
                        // day dữ liệu vào cuối queue
                        int num = Integer.parseInt(str[1]);
                        queue.add(num);
                        break;
                    case 4:
                        // loại bỏ phần tử
                        if (!queue.isEmpty())
                            queue.poll();
                        break;
                    case 5:
                        // trả về phần tử đầu queue
                        if (queue.isEmpty()) System.out.println(-1);
                        else System.out.println(queue.peek());
                        break;
                    case 6:
                        // convert queue to list
                        List list = (List) queue;
                        if (queue.isEmpty()) System.out.println(-1);
                        else System.out.println(list.get(queue.size() - 1));
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
