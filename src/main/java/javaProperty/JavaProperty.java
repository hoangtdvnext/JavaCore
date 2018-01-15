package javaProperty;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by Hoang Ta Duy on 1/5/2018.
 */
public class JavaProperty {
    public static void main(String[] args) {
        Product p = new Product();

        p.setaDate(new Date());
        p.setTheDate(new Date());

        try {
            PropertyUtils.setProperty(p,"aDate",new Date());

            System.out.println(PropertyUtils.getProperty(p, "aDate"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
