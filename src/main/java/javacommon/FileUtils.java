package javacommon;

import org.apache.commons.lang.StringUtils;

import java.io.*;

/**
 * Created by Hoang Ta Duy on 1/15/2018.
 */
public final class FileUtils {

    private static String tmp = "";
    private static final String DOT = "\\.";
    private static final int BYTE_BUFFER = 1024 * 100;
    private static final String BLANK = "";

    public static void dirTree(String path) {
        File sf = new File(path);
        if (!sf.exists()) {
            System.out.println("File not exists");
        }

        if (sf.isDirectory()) {
            File[] listFile = sf.listFiles();
            for (File f : listFile) {
                if (f.isDirectory()) {
                    System.out.println(tmp + " + " + f.getName());
                    tmp += " ";
                    dirTree(f.getAbsolutePath());
                    tmp = tmp.substring(0, tmp.length() - 1);
                } else {
                    System.out.println(tmp + "-" + f.getName());
                }
            }
        } else {
            System.out.println(tmp + "-" + sf.getName());
        }
    }

    /**
     * Chia file theo kich thuoc size
     *
     * @param path
     * @param size
     * @return
     * @throws IOException
     */
    public static boolean splitFile(String path, long size) throws IOException {
        File sf = new File(path);

        if (!sf.exists()) {
            return false;
        }

        long fSize = sf.length();
        long count = fSize / size;
        long remain = fSize % size;
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sf));

        for (int i = 1; i <= count; i++) {
            // file name split
            String df = sf.getPath() + DOT + String.format("%1$04d", i);
            System.out.println(df);
            // file output
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(df));
            writeFileByte(size, bis, bos);
            bos.flush();
            bos.close();
        }

        if (remain > 0) {
            // file name split
            String df = sf.getPath() + "." + String.format("%1$04d", count + 1);
            // file output
            System.out.println(df);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(df));
            writeFileByte(remain, bis, bos);
            bos.flush();
            bos.close();
        }

        System.out.println("Finish");
        return true;
    }

    /**
     * Ghi file theo input size
     *
     * @param size
     * @param bis
     * @param bos
     * @throws IOException
     */
    @Deprecated
    public static void writeFile(long size, BufferedInputStream bis,
                                  BufferedOutputStream bos) throws IOException {
        for (int i = 0; i < size; i++) {
            bos.write(bis.read());
        }
    }

    /**
     * Ghi file theo input size
     *
     * @param size
     * @param bis
     * @param bos
     * @throws IOException
     */
    public static void writeFileByte(long size, BufferedInputStream bis,
                                      BufferedOutputStream bos) throws IOException {
        // read and write with byte
        byte[] arr = new byte[BYTE_BUFFER];
        long remain = size;
        int byteRead, readSize;
        while (remain > 0) {
            readSize = (int) ((arr.length < remain) ? arr.length : remain);
            byteRead = bis.read(arr, 0, readSize);
            bos.write(arr, 0, byteRead);
            remain -= byteRead;
        }
    }

    /**
     * Merge file by list file children
     *
     * @param path
     * @return
     * @throws IOException
     */
    public static boolean joinFile(String path) throws IOException {
        File sf = new File(path);
        if (!sf.exists()) {
            return false;
        }

        String mineType = path.substring(path.length() - sizeType(path), path.length());
        String df = path.substring(0, path.length() - sizeType(path));
        OutputStream ous = new BufferedOutputStream(new FileOutputStream(df + "_JOIN_" + mineType));
        File listFile[] = sf.getParentFile().listFiles();
        for (File f : listFile) {
            // Chi lay nhung file duoc tach tu file goc
            System.out.println(f.getName());
            String name = f.getName().substring(0, f.getName().length() - sizeType(f.getName()));
            if (name.equals(sf.getName())) {
                InputStream is = new BufferedInputStream(new FileInputStream(f.getAbsolutePath()));
                byte[] arr = new byte[BYTE_BUFFER];
                while ((is.read(arr)) != -1) {
                    ous.write(arr);
                }
                is.close();
            }
        }
        ous.flush();
        ous.close();

        System.out.println("Finish");
        return true;
    }

    /**
     * Get size mineType
     * @param fileName
     * @return
     */
    private static int sizeType(String fileName) {
        return getMineTypeByFileName(fileName).length();
    }

    /**
     * Get mineType file by file name
     * @param fileName
     * @return
     */
    @Deprecated
    private static String getMineTypeByFileName_1(String fileName){
        if (StringUtils.isEmpty(fileName)) {
            return BLANK;
        }
        String arr[] = fileName.split(DOT);
        if(arr.length == 1){
            return BLANK;
        }else{
            String mineType = DOT + arr[arr.length - 1];
            return mineType;
        }
    }

    /**
     * Get mineType file by file name
     * @param fileName
     * @return
     */
    private static String getMineTypeByFileName(String fileName){
        if (StringUtils.isNotEmpty(fileName) && fileName.contains(".")) {
            String mineType = fileName.substring(fileName.lastIndexOf('.'),fileName.length());
            return mineType;
        }

        return BLANK;
    }

}
