import org.joda.time.DateTime;

/**
 * Created by hoangtd on 9/22/2017.
 */
public class DateTimeNow {

    public static void main(String[] args) {
        DateTime dateTime = DateTime.now();

        // thứ - ngày - tháng hiện tại

        // t6 - 22 - 09

        // ngày thứ 2 cách t6 = 3 ngày => Ngày thứ 2 có thể là 7x + 3

        // 7x + 3 + y(y là ngày của tháng hiện tại) <= 30

        // => x = 7x + 3 + 22 >=30 => x >= 30-22-3/7 => x = 1

        // => ngày thứ 2 đầu tiên của tháng = 7 + 3 = 10 + 22 = 32(mùng 1 nếu tháng 31 ngày, mùng 2 nếu tháng 30 ngày)

    }
}
