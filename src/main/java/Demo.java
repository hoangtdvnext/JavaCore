import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 * Created by ASUS on 5/23/2017.
 */
public class Demo {

    private static DateTimeFormatter dateTimeFormatter2 = DateTimeFormat.forPattern("yyyy/MM/dd");

    static int x = 100;

    static {
        x += 100;
    }

    static public void method() {
        x += 200;
    }

    public static void main(String[] args) {
        Demo o = new Demo();
        o.x += 300;

        Demo.x += 500;
        Demo.method();

        System.out.println(o.x);
        System.out.println(Demo.x);


        String str = "ta duy hoang";
        if(str.contains("a")){
            System.out.println("TRUE");
        }
        DateTime dateTime = new DateTime(System.currentTimeMillis());
        String dateStr = dateTime.toString(dateTimeFormatter2);
        System.out.println(dateStr);
    }
// Biến là static có giá trị như nhau, không liên quan tới việc khởi tạo object.
}
