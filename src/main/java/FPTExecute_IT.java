import javaspoj.Product;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Hoang on 5/18/2018.
 */
public class FPTExecute_IT {

    public static void main(String[] args) {
        Map<String, Product> mapdata = new HashMap<>();

        mapdata.put("A1", new Product("A1", "B1"));
        mapdata.put("A2", new Product("A2", "B2"));
        mapdata.put("A3", new Product("A3", "B3"));
        mapdata.put("A4", new Product("A4", "B4"));
        mapdata.put("A5", new Product("A5", "B5"));


        Iterator<String> ite = mapdata.keySet().iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        System.out.println("2400".compareTo("3") < 0);

        System.out.println(getOverDateTime("3"));
    }

    public static String getOverDateTime(String time) {

        if (time == null) {
            return null;
        }
        // 2400�����Z���ĕԂ��B
        int i = Integer.parseInt(time);
        i = i + 2400;
        DecimalFormat df = new DecimalFormat("0000");
        return df.format(i);
    }
}
