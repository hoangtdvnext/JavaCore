package JavaCNPM.contest2;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ASUS on 6/13/2017.
 */
public class O {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        for (int i = 0; i < t; i++) {
            String str = input.nextLine();
            checkValue(str);
        }
    }

    public static void checkValue(String input) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '(':
                    stack.push(1);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek().equals(1)) {
                        stack.pop();
                    }
                    break;
                case '[':
                    stack.push(2);
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek().equals(2) ) {
                        stack.pop();
                    }
                    break;
                case '{':
                    stack.push(3);
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek().equals(3)) {
                        stack.pop();
                    }
                    break;
                default:
                    break;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
