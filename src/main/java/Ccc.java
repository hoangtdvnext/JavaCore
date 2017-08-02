import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by hoangtd on 8/18/2017.
 */
public class Ccc {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("d.txt");
            Reader reader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader sc = new BufferedReader(reader);
            String str;
            while ((str = sc.readLine()) != null) {
                System.out.println("Ki tu: " + str + ",length " + str.length());
                for (int i = 0; i < str.length(); i++) {
                    System.out.println("ktt: " + i + str.charAt(i));
                }
            }
        } catch (Exception e) {

        }
    }
}
