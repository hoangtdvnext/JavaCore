package javaCore.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Hoang Ta Duy on 11/1/2017.
 */
public class ContructorExample {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // Lấy ra đối tượng Class mô tả class Cat
        Class<Cat> aClass = Cat.class;

       // Lấy ra cấu tử có tham số(String, int) của class Cat
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);

        // Lấy ra thông tin kiểu tham số của cấu tử
        Class<?>[] paramClasses = constructor.getParameterTypes();
        for(Class<?> pr: paramClasses){
            System.out.println(pr.getSimpleName());
        }

        // Khởi tạo đối tượng Cat theo cách thông thưởng
        Cat tom1 = new Cat("Tom1", 3);
        System.out.println("Name: " + tom1.getName() + " Age: " + tom1.getAge());

        // Khởi tạo theo cách của reflection
        Cat tom2 = (Cat)constructor.newInstance("Tom2", 2);
        System.out.println("Name: " + tom2.getName() + " Age: " + tom2.getAge());

    }
}
