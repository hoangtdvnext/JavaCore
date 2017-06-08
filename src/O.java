import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/7/2017.
 */
public class O {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer n = Integer.parseInt(input.nextLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //1. input data
        String str[];
        for(int i=0;i<n;i++){
            queue.add(input.nextInt());
        }
        //2. giai thuat
        Integer MOD = (int) Math.pow(10, 9) + 7;
        while (queue.size() != 1) {
            int a1 = queue.peek();
            queue.poll();
            int a2 = queue.peek();
            queue.poll();
            queue.add((a1 + a2) % MOD);
        }

        System.out.println(queue.peek() % MOD);
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

