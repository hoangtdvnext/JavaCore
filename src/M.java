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

        postfix(arr);
    }

    public static void postfix(String[] elementMath) {
        String s1 = "", E[];
        Stack<String> S = new Stack<String>();
        for (int i = 0; i < elementMath.length; i++) {    // duyet cac phan tu
            char c = elementMath[i].charAt(0);  // c la ky tu dau tien cua moi phan tu

            if (!isOperator(c))         // neu c khong la toan tu
                s1 = s1 + elementMath[i];     // xuat elem vao s1
            else {                       // c la toan tu
                if (c == '(') S.push(elementMath[i]);   // c la "(" -> day phan tu vao Stack
                else {
                    if (c == ')') {          // c la ")"
                        char c1;        //duyet lai cac phan tu trong Stack
                        do {
                            c1 = S.peek().charAt(0);    // c1 la ky tu dau tien cua phan tu
                            if (c1 != '(') s1 = s1 + S.peek();    // trong khi c1 != "("
                            S.pop();
                        } while (c1 != '(');
                    } else {
                        while (!S.isEmpty() && priority(S.peek().charAt(0)) >= priority(c)) {
                            // Stack khong rong va trong khi phan tu trong Stack co do uu tien >= phan tu hien tai
                            s1 = s1 + S.peek();   // xuat phan tu trong Stack ra s1
                            S.pop();
                        }
                        S.push(elementMath[i]); //  dua phan tu hien tai vao Stack
                    }
                }
            }
        }
        while (!S.isEmpty()) {   // Neu Stack con phan tu thi day het vao s1
            s1 = s1 + S.peek();
            S.pop();
        }

        System.out.println(s1);
    }

    // thiet lap thu tu uu tien
    public static int priority(char c) {
        if (c == '+' || c == '-') return 1;
        else if (c == '*' || c == '/') return 2;
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
