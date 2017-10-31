package javaCore.reflection;

import java.lang.reflect.Method;

/**
 * Created by Hoang Ta Duy on 11/1/2017.
 */
public class ListMethod {

    protected void info(){}

    public static void testMethod1(){}

    public void testMethod2(){}

    public static void main(String[] args) {
        Method [] methods = ListMethod.class.getMethods();

        for (Method mt: methods){
            System.out.println(mt.getName());
        }
    }
}
