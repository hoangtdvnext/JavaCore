import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

/**
 * Created by Hoang on 5/10/2018.
 */
public class SplitCharacter {

    public static void main(String[] args) {
        String input = "Tạ \tDuy\" \' \nHoàng \\";

        // split character
        System.out.println(input);

        StringBuilder s = new StringBuilder(input.length());

        CharacterIterator it = new StringCharacterIterator(input);
        for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
            switch (ch) {
                case '&':
                    s.append("&amp;");
                    break;
                case '<':
                    s.append("&lt;");
                    break;
                case '\\':
                    s.append("a");
                    break;
                case '\"':
                    s.append("b");
                    break;
                case '\n':
                    s.append("c");
                    break;
                case '\t':
                    s.append("d");
                    break;
                case '\'':
                    s.append("e");
                    break;
                default:
                    s.append(ch);
                    break;
            }
        }

        System.out.println(s.toString());
    }
}
