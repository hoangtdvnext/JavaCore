package JavaCNPM.algorithms;

/**
 * Created by Hoang Ta Duy on 6/29/2017.
 */
public class DaoNguoc {

    public static void daoNguoc(int a[]) {
        int length = a.length;
        int dau = 0, cuoi = length - 1;
        while (dau <= cuoi) {
            int tmp = a[dau];
            a[dau] = a[cuoi];
            a[cuoi] = tmp;
            dau++;
            cuoi--;
        }
    }
}
