package javaCore.reflection;

import java.lang.reflect.Modifier;

/**
 * Created by Hoang Ta Duy on 11/1/2017.
 * Class
 */
public final class ShowClassInfo {

    public static void main(String[] args) {
        // Lấy ra đối tượng Class mô tả class ShowClassInfo
        Class<ShowClassInfo> aClass = ShowClassInfo.class;

        // ghi ra tên class, bao gồm cả tên package
        System.out.println("Class name " + aClass.getName());

        // ghi ra tên đơn giản của class
        System.out.println("Simple Class name " + aClass.getSimpleName());

        // thông tin của package
        Package pk = aClass.getPackage();
        System.out.println("Package name " + pk.getName());

        // modifier
        int modifiers = aClass.getModifiers();

        boolean isPublic = Modifier.isPublic(modifiers);
        boolean isInterface = Modifier.isInterface(modifiers);
        boolean isAbstract = Modifier.isAbstract(modifiers);
        boolean isFinal = Modifier.isFinal(modifiers);

        // true
        System.out.println("Is Public? " + isPublic);
        // true
        System.out.println("Is Final? " + isFinal);
        // false
        System.out.println("Is Interface? " + isInterface);
        // false
        System.out.println("Is Abstract? " + isAbstract);
    }
}
