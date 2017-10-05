package javacommon;

import java.util.UUID;

/**
 * Created by ASUS on 5/23/2017.
 */
public class Random {

    public static final String randomUUID(){
        String output = UUID.randomUUID().toString();

        return output;
    }
}
