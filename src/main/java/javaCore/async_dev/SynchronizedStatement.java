package javaCore.async_dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ASUS on 5/30/2017.
 */
//
//synchronized(objectidentifier) {
//        // Access shared variables and other shared resources
//        }
public class SynchronizedStatement {
    static String lastName = "";
    static int nameCount = 0;
    static List<String> nameList = new ArrayList<>();


    public void addName(String name) {
        synchronized(this) {
            lastName = name;
            nameCount++;
        }
        nameList.add(name);
    }

    public static void main(String[] args) {
        SynchronizedStatement async = new SynchronizedStatement();
        async.addName("hoang");
        async.addName(new Scanner(System.in).nextLine());

        nameList.forEach(item -> System.out.println(item));
        System.out.println(nameCount);
    }
}
