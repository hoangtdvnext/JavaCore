package JavaCNPM.algorithms;

/**
 * Created by Hoang Ta Duy on 6/29/2017.
 */
public class Resever {

    public static int[] resever(int a[]) {
        int length = a.length;
        int dau = 0, cuoi = length - 1;
        while (dau <= cuoi) {
            int tmp = a[dau];
            a[dau] = a[cuoi];
            a[cuoi] = tmp;
            dau++;
            cuoi--;
        }
        return a;
    }

    public static String resever(String str) {
        char a[] = str.toCharArray();
        int length = a.length;
        int dau = 0, cuoi = length - 1;
        while (dau <= cuoi) {
            char tmp = a[dau];
            a[dau] = a[cuoi];
            a[cuoi] = tmp;
            dau++;
            cuoi--;
        }

        return a.toString() ;
    }

    public static char[] resever(char a[]) {
        int length = a.length;
        int dau = 0, cuoi = length - 1;
        while (dau <= cuoi) {
            char tmp = a[dau];
            a[dau] = a[cuoi];
            a[cuoi] = tmp;
            dau++;
            cuoi--;
        }

        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        a = resever(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        String str = "hoang";
        System.out.println(resever(str));

        System.out.println();
        char chs[] = {'a','d','g','y','k','j','n','f'};
        chs = resever(chs);
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }
    }
}
