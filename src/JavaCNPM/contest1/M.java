package JavaCNPM.contest1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine();
        }

        for (int i = 0; i < n; i++) {
            postfix(arr[i]);
        }

    }

    public static void postfix(String infix) {
        String s1 = "";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < infix.length(); i++) {    // duyet cac phan tu
            char s = infix.charAt(i);

			// neu c khong la toan tu -> đẩy ra kết quả
            if (!isOperator(s))         
                s1 += s;     // xuat elem vao s1
            else 
			// c la "(" -> day phan tu vao Stack
			if (s == '(') {
                stack.push(s);  
            } else if (s == ')') {
				// Lấy ra cho đến khi nào gặp dấu ')' trong stack
                char x = stack.pop();
                while (x != '(') {
                    s1 += x;
                    x = stack.pop();
                }
            }
            // c la dau
            else {
				//Kiem tra neu trong stack van con va phan tu s co du uu tien < trong stack thi lay ra
                while (stack.size() > 0
                        && priority(s) <= priority(stack.peek())) {
                    s1 += stack.pop();
                }
				// push s vao stack thay cho
                stack.push(s);
            }
        }

        while(stack.size()>0){   // Neu Stack con phan tu thi day het vao s1
            s1 += stack.pop();
        }

        System.out.println(s1);
    }

    // thiet lap thu tu uu tien
    public static int priority(char c) {
        if (c == '+' || c == '-') return 1;
        else if (c == '*' || c == '/' || c == '%') return 2;
        else return 0;
    }

    // kiem tra xem co phai toan tu
    public static boolean isOperator(char c) {
        char operator[] = {'+', '-', '*', '/', ')', '('};
        Arrays.sort(operator);
        if (Arrays.binarySearch(operator, c) > -1)
            return true;
        else return false;
    }
}
