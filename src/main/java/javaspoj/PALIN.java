package javaspoj;

import java.util.Scanner;

/**
 * Created by ASUS on 7/5/2017.
 */
public class PALIN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        for (int i = 0; i < t; i++) {
            String n = input.nextLine();

        }
    }

    public static String[] divideString(String input) {
        if (input.length() == 1)
            return new String[]{"", input};

        String[] output = new String[2];
        for (int i = 0; i > input.length(); i++) {
            output[0] += input.charAt(i);
        }

        if (input.length() % 2 != 0)
            output[1] += input.charAt(input.length() / 2);

        return output;
    }

    public static String nextNumber(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
//        List<Character> list = new ArrayList<>(stringBuilder.reverse());
        char output[] = input.toCharArray();
        int position = 0;
        while (output[position] == '9') {
            output[position] = '0';
            position++;
//            if(position == output.length)
//                output.
        }

        return null;
    }

    public static boolean isBigger(String left, String right) {
        if (left.length() != right.length())
            return (left.length() > right.length());

        for (int i = 0; i < left.length(); i++)
            if (left.charAt(i) != right.charAt(i))
                return (left.charAt(i) > right.charAt(i));

        return false;
    }

//    public static String NextPalindrome(String input)
//    {
//        char [] list = input.toCharArray();
//        if (input == null || input == "")//Nếu số ban đầu là null hoặc rỗng thì trả về "0"
//            return "0";
//        while (input.length() > 1)//Loại bỏ ký tự "0" ở đầu
//            if (input.charAt(0) == '0')
//                Input = Input.Remove(0, 1);
//        if (Input.Any(x => !Char.IsDigit(x)))//Nếu số ban đầu chứa ký tự không phải là chữ số thì chửi thằng nhập
//        return "WTF dude?";
//        var Material = DivideString(Input);
//        var Output = Material[0] + Material[1] + new string(Material[0].Reverse().ToArray());
//        if (IsBigger(Output, Input))
//            return Output;
//        else
//        {
//            var Left = Material[0] + Material[1];
//            var Next = NextNumber(Left);
//            if (Material[1] == null)
//                if (Next.Length == Left.Length)
//                    Output = Next + new string(Next.Reverse().ToArray());
//                else
//                    Output = Next.Substring(0, Left.Length) + Next.Last() + new string(Next.Substring(0, Left.Length).Reverse().ToArray());
//            else
//            if (Next.Length == Left.Length)
//                Output = Next.Substring(0, Next.Length - 1) + Next.Last() + new string(Next.Substring(0, Next.Length - 1).Reverse().ToArray());
//            else
//                Output = Next.Substring(0, Left.Length) + new string(Next.Substring(0, Left.Length).Reverse().ToArray());
//            return Output;
//        }
//    }
}
