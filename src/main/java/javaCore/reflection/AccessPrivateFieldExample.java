package javaCore.reflection;

import java.lang.reflect.Field;

/**
 * Created by Hoang Ta Duy on 11/1/2017.
 */
public class AccessPrivateFieldExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Lấy ra đối tượng Class mô tả class Cat
        Class<Cat> aClass = Cat.class;

        // Class.getField(String) chỉ lấy được các trường public
        // Sử dụng Class.getDeclaredField(String)
        // Lấy ra được field mô tả trường name của class Cat
        // trường khi báo trong class này
        Field privateNameField = aClass.getDeclaredField("name");

        // Cho phép để truy cập vào các trường private
        privateNameField.setAccessible(true);

        Cat cat = new Cat("Tom", 10);

        // get value field private
        String fieldName = (String)privateNameField.get(cat);
        System.out.println("NAME: " + fieldName);

        // get value to field private
        privateNameField.set(cat, "Hoang");
        System.out.println("NAME: " + cat.getName());
    }
}
