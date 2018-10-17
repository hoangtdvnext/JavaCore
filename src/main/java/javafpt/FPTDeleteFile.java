package javafpt;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Hoang on 6/15/2018.
 */
public class FPTDeleteFile {

    public static void main(String[] args) {
        File directory = new File("test");
        try {
            FileUtils.cleanDirectory(directory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
