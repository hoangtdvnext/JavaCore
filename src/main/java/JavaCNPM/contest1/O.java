package JavaCNPM.contest1;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/7/2017.
 * P178PROJ
 */
public class O {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer n = Integer.parseInt(input.nextLine());
        PriorityQueue<Long> queue = new PriorityQueue<>();
        //1. input data
        for (int i = 0; i < n; i++) {
            queue.add(input.nextLong());
        }
        //2. giai thuat
        Integer MOD = (int) Math.pow(10, 9) + 7;
        long tong = 0;
        while (queue.size() > 1) {
            long a1 = queue.peek();
            queue.poll();
            long a2 = queue.peek();
            queue.poll();
            long sum = (a1 + a2) % MOD;
            queue.add(sum);
            tong = (tong + sum) % MOD;
        }

        System.out.println(tong);
    }
}

//7
//2 4 1 2 10 2 3 -> 1 2 2 2 3 4 10
//2 2 3 3 4 10-> 3
//3 3 4 4 10->4
//4 4 6 10->6
//6 8 10->8
//10 14->14
//24

