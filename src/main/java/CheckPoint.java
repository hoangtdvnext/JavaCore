import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ASUS on 6/29/2017.
 */
public class CheckPoint {
    private static final String FILENAME = "input.txt";

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(new File(FILENAME));
            String s;
            StringBuilder output = new StringBuilder();
            for(int i=0;i<6816;i++){
                output.append(input.nextLine()).append(",").append("\n");
            }
            System.out.println(output.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
//            int pointA = 0, pointB = 0, pointC = 0, pointD = 0;
//            String sCurrentLine;
//            while ((sCurrentLine = br.readLine()) != null) {
//                String[] point = new String[5];
//                point = sCurrentLine.split(" ");
//                for (int i = 1; i < point.length; i++) {
//                    switch (point[i]) {
//                        case "A":
//                            pointA += i;
//                            break;
//                        case "B":
//                            pointB += i;
//                            break;
//                        case "C":
//                            pointC += i;
//                            break;
//                        case "D":
//                            pointD += i;
//                            break;
//                        default:
//                            break;
//                    }
//                }
//            }
//            System.out.println("A :" + pointA);
//            System.out.println("B :" + pointB);
//            System.out.println("C :" + pointC);
//            System.out.println("D :" + pointD);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
