import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by ASUS on 6/29/2017.
 */
public class CheckPoint {
    private static final String FILENAME = "input.txt";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            int pointA = 0, pointB = 0, pointC = 0, pointD = 0;
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                String[] point = new String[5];
                point = sCurrentLine.split(" ");
                for (int i = 1; i < point.length; i++) {
                    switch (point[i]) {
                        case "A":
                            pointA += i;
                            break;
                        case "B":
                            pointB += i;
                            break;
                        case "C":
                            pointC += i;
                            break;
                        case "D":
                            pointD += i;
                            break;
                        default:
                            break;
                    }
                }
            }
            System.out.println("A :" + pointA);
            System.out.println("B :" + pointB);
            System.out.println("C :" + pointC);
            System.out.println("D :" + pointD);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
