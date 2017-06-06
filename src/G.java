import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String dathuc1 = input.nextLine();
            String dathuc2 = input.nextLine();

            answer.add(sumDaThuc(dathuc1,dathuc2));
        }

        answer.forEach(ans -> System.out.println(ans));
    }

    public static String sumDaThuc(String dathuc1, String dathuc2) {
        String str1[] = dathuc1.split("[\\s,+]+");
        String str2[] = dathuc2.split("[\\s,+]+");
        String output = "";

        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                int bac_dt1 = Integer.parseInt(str1[i].substring(str1[i].length() - 1));
                int bac_dt2 = Integer.parseInt(str2[j].substring(str2[j].length() - 1));
                // check dt1>dt2
                if (bac_dt1 < bac_dt2) {
                    output += str2[j] + " +";
                }
                //else dt1=dt2
                else if (bac_dt1 == bac_dt2) {
                    int value1 = Integer.parseInt(str1[i].charAt(0) + "");
                    int value2 = Integer.parseInt(str2[j].charAt(0) + "");
                    output += (value1 + value2) + str1[i].substring(1, str1[i].length()) + " +";
                }
                //else
                else {
                    output += str1[i] + " +";
                }
            }
        }

        return output.substring(0, output.length()-2);
    }
}
