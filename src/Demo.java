import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by ASUS on 5/23/2017.
 */
public class Demo {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        System.out.println(input.nextLine());
////        int a[] = new int[100];
////        for(int i=0;i<3;i++){
////            a[i] = input.nextInt();
////            System.out.println(a[i]);
////        }
////
////        for(int i=0;i<3;i++){
////            a[i] = input.nextInt();
////            System.out.println(a[i]);2 4 1 2 10 2 3
////        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<7;i++){
            queue.add(input.nextInt());
        }

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        int a = 12223;
    }

}
