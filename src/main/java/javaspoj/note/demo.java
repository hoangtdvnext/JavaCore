package javaspoj.note;

/**
 * @author hoangtd
 *         24/10/2016
 */
public class demo {
    public static void main(String[] args) {
        String s = "dsdas.vdv";
        String str[]  = s.split("[.]");
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
