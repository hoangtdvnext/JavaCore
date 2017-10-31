package javaCore.reflection;

import java.lang.reflect.Field;

/**
 * Created by Hoang Ta Duy on 11/1/2017.
 */
public class FieldExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Lấy ra đối tượng Class mô tả class Cat
        Class<Cat> aClass = Cat.class;

        // Lấy ra field có tên 'NUMBER_OF_LEGS'
        Field field = aClass.getField("NUMBER_OF_LEGS");

        // Ghi ra kiểu của Field
        Class<?> fieldType = field.getType();
        System.out.println("Field type: " + fieldType.getSimpleName());

        // Lấy ra field có tên 'age' public
        Field fieldAge = aClass.getField("age");
        Cat cat = new Cat("Tom", 10);
        // get giá trị trường age
        int age = (Integer)fieldAge.get(cat);

        System.out.println("Age " + age);

        // Set đặt lại giá trị cho trường age
        fieldAge.set(cat, 20);
        System.out.println("Age " + cat.getAge());
    }
}
