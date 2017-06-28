package JavaCNPM.contest1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class L {
    static int top = -1;
    static int stack[]= new int[1000];

    public static void push(int x) {
        stack[++top] = x;
    }

    public static void pop() {
        if (top != -1) {
            top--;
        }
    }

    public static void show() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> listInputs = new ArrayList<>();
        String str_ = "";
        while (true) {
            str_ = input.nextLine();
            listInputs.add(str_);
            String tocken[] = str_.split(" ");
            boolean check = false;
            switch (tocken[0]) {
                case "push":
                    push(Integer.parseInt(tocken[1]));
                    break;
                case "pop":
                    pop();
                    break;
                case "show":
                    if (top == -1) {
                        System.out.println("empty");
                        check = true;
                    } else {
                        show();
                    }
                    break;
                default:
                    break;
            }

            if (check) break;
        }


    }
}
