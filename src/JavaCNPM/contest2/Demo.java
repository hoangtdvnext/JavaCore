package JavaCNPM.contest2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ASUS on 6/13/2017.
 */
public class Demo {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
