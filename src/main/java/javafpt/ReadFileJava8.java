package javafpt;

import javax.annotation.Resource;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by Hoang on 5/31/2018.
 */
public class ReadFileJava8 {

    public static Map<String, String> convertMap = new HashMap<>();

    public static String readFile(String filePath) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)),
                StandardCharsets.UTF_8);

        return content;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "a.txt";

        System.out.println(readFile(filePath));

        readFile();

        System.out.println(convertMap);

        System.out.println("DONE");
    }

    public static void readFile() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("ConvertChar");
        Enumeration e = resourceBundle.getKeys();

        while (e.hasMoreElements()) {
            String key = new String(e.nextElement().toString().getBytes(StandardCharsets.ISO_8859_1),
                    StandardCharsets.UTF_8);
            convertMap.put(key, new String(resourceBundle.getString(key).getBytes(StandardCharsets.ISO_8859_1),
                    StandardCharsets.UTF_8));
        }
    }

}
