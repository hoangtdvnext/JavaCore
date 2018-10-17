package javacommon;

/**
 * Created by Hoang on 9/22/2018.
 */
public class ExcelUtils {

    public static int getExcelColumnNumber(String column) {
        int result = 0;

        for (int i = 0; i < column.length(); i++) {
            result *= 26;
            result += column.charAt(i) - 'A' + 1;
        }

        return result;
    }

    public static String getExcelColumnName(int number) {
        final StringBuilder sb = new StringBuilder();

        int num = number - 1;
        while (num >= 0) {
            int numChar = (num % 26) + 65;
            sb.append((char) numChar);
            num = (num / 26) - 1;
        }

        return sb.reverse().toString();
    }

    // Test
    public static void main(String[] args) {
        // convert column to number
        System.out.println(getExcelColumnNumber("ABC"));

        // convert number to column name
        System.out.println(getExcelColumnName(123));
    }
}
