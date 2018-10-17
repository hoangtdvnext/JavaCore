package javafpt;

/**
 * Created by Hoang on 6/28/2018.
 */
public class FPTMasterCache {

    private static Class<Product> product = Product.class;

    private static String classKey = "";

    public static Class<?> getKey(){
        return product;
    }

    public static void main(String[] args) {
        classKey = product.getName();
        System.out.println(product.getName());

        try {
            Class<?> classKeyObj = Class.forName(classKey);
            System.out.println(classKeyObj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
