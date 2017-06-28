package JavaCNPM.algorithms;

/**
 * Created by Hoang Ta Duy on 6/17/2017.
 * Rất tốn bộ nhớ, không tối ưu
 */
public class GiaiThua {

    public static int giaiThua(int n) {
        if (n == 0) return 1;
        else return (n * giaiThua(n - 1));
    }

    public static void main(String[] args) {

    }
}
