package JavaCNPM.contest2;

/**
 * Created by ASUS on 6/13/2017.
 */
public class E {

    public static boolean checkNt(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++)
            if (a % i == 0) return false;

        return true;
    }
}
