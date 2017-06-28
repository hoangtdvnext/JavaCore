package javaCore;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by ASUS on 6/19/2017.
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");

        // sinh 1 số nguyên lớn
        SecureRandom r = new SecureRandom();
        System.out.println(r);
        // cộng
        System.out.println(a.add(b));
        // trừ
        System.out.println(a.subtract(b));
        // nhân
        System.out.println(a.multiply(b));
        // chia
        System.out.println(a.divide(b));
        // hàm tính ước chung lớn nhất

        // tính phần tử ngược


        // hàm tính mod n
        // tìm m = m^e mod n
        //m = m.modPow(e,n)
        BigInteger mod = new BigInteger("100000000");
        BigInteger value = a.modPow(b, mod);
    }
}
