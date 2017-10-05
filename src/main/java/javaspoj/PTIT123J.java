package javaspoj;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author hoangtd
 *         24/10/2016
 */
public class PTIT123J {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();
        String s = "";
        while (!s.equals(".")) {
            s = input.nextLine();
            if (!s.equals(".")) buffer.append(s);
        }
        String str[] = buffer.toString().split("[.]");
        for (int i = 0; i < str.length; i++) {
            check(str[i]);
        }
    }

    public static void check(String s) {
        Stack<Integer> stack = new Stack<>();
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push(1);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == 1) {
                        stack.pop();
                    }else check = false;
                    break;
                case '[':
                    stack.push(2);
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == 2) {
                        stack.pop();
                    }else check = false;
                    break;
                default:
                    break;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("yes");
        } else System.out.println("no");
    }
}
