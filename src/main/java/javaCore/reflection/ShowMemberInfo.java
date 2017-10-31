package javaCore.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Hoang Ta Duy on 11/1/2017.
 */
public class ShowMemberInfo {
    public static void main(String[] args) {
        // Lấy ra đối tượng Class mô tả Class Cat
        Class<Cat> catClass = Cat.class;

        // lấy ra danh sách các cấu tử của Cat
        Constructor<?>[] constructors = catClass.getConstructors();

        //
        System.out.println("Contructors");
        for(Constructor<?> ct: constructors){
            System.out.println("Name: " + ct.getName());
        }

        // Lấy ra dnah sách các method public của Cat
        // Bao gồm các method kế thừa từ interface và class cha
        Method[] methods = catClass.getMethods();
        System.out.println("Method");
        for(Method mt: methods){
            System.out.println("Method public : " + mt.getName());
        }

        // lấy ra danh sách các field public
        System.out.println("Field");
        Field[] fields = catClass.getFields();
        for(Field fi: fields){
            System.out.println("Field public : " + fi.getName());
        }
    }
}
