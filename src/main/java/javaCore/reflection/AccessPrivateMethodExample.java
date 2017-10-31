package javaCore.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Hoang Ta Duy on 11/1/2017.
 */
public class AccessPrivateMethodExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Lấy ra đối tượng Class mô tả class Cat
        Class<Cat> aClass = Cat.class;

        // Class.getMethod(String) chỉ lấy được các method public.
        // Sử dụng Class.getDeclaredMethod(String):
        // Lấy ra đối tượng Method mô tả method setName(String) của class Cat.
        // (Phương thức khai báo trong class).
        Method method = aClass.getDeclaredMethod("setName", String.class);

        // cho phép truy cập vào method private
        method.setAccessible(true);

        Cat cat = new Cat("tom", 20);
        // set value name
        method.invoke(cat, "Hoàng Demo");

        System.out.println(cat.getName());
    }
}
