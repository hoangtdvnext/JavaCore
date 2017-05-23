package common;

import java.util.UUID;

/**
 * Created by ASUS on 5/23/2017.
 */
public class Random {
    public static void main(String[] args) {
        // Id random
        String randomId = UUID.randomUUID().toString();

        System.out.println("Id random: " + randomId);
    }
}
