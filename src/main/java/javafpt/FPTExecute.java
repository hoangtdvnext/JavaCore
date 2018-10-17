package javafpt;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hoang on 5/29/2018.
 */
public class FPTExecute {

    public static void main(String[] args) {
        Product product1 = new Product(1, "a", 1);
        Product product2 = new Product(2, "a", 2);
        Product product3 = new Product(3, "a", 3);
        Product product4 = new Product(2, "a", 4);
        Product product5 = new Product(3, "a", 5);
        Product product6 = new Product(4, "a", 2);
        Product product7 = new Product(1, "a", 1);

        Map<String, Product> treeMap = new HashMap<>();

        // thực hiện put vào treeMap
        putMap(treeMap, product1);
        putMap(treeMap, product2);
        putMap(treeMap, product3);
        putMap(treeMap, product4);
        putMap(treeMap, product5);
        putMap(treeMap, product6);
        putMap(treeMap, product7);

        // Lấy ra list product
        Collection<Product> products = treeMap.values();
        products.stream()
                .forEach(item -> System.out.println("Key: " + item.getId()
                        + "\nCount: " + item.getCount()));

    }

    private static void putMap(Map<String, Product> treeMap, Product product) {
        if (treeMap.containsKey(String.valueOf(product.getId()))) {
            // sum count
            Product productBefore = treeMap.get(String.valueOf(product.getId()));
            productBefore.setCount(product.getCount() + productBefore.getCount());
            treeMap.replace(String.valueOf(product.getId()), productBefore);
        } else {
            treeMap.put(String.valueOf(product.getId()), product);
        }
    }
}
