import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class L {
    static int top = -1;
    static int stack[];

    public static void init() {
        top = -1;
        stack = new int[1000];
    }

    public static void push(int x) {
        stack[++top] = x;
    }

    public static void pop() {
        if (top != -1) {
            top--;
        }
    }

    public static void size() {
        System.out.println(top + 1);
    }

    public static void top() {
        if (top != -1) {
            System.out.println(stack[top]);
        } else System.out.println(-1);
    }

    public static void isEmty() {
        if (top == -1) {
            System.out.println("empty");
        } else System.out.println(0);
    }

    public static void show() {
        if (top == -1) {
            System.out.println("empty");
        } else System.out.println(0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> listInputs = new ArrayList<>();
        String str_ = "";
        while (!str_.equalsIgnoreCase("end")) {
            str_ = input.nextLine();
            listInputs.add(str_);
        }
        init();
        for (String str : listInputs) {
            String tocken[] = str.split(" ");
            switch (tocken[0]) {
                case "push":
                    push(Integer.parseInt(tocken[1]));
                    break;
                case "pop":
                    pop();
                    break;
                case "show":
                    show();
                    break;
                case "empty":
                    isEmty();
                    break;
                default:
                    break;
            }
        }
    }
}
