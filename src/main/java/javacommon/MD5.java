package javacommon;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ASUS on 5/23/2017.
 */
public final class MD5 {
    private static final String METHOD = "MD5";

    /**
     * Encode md5
     *
     * @param value
     * @return
     */
    public static final String encodeMd5(final String value) {
        if (value == null || value.trim() == null) {
            return null;
        }

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance(METHOD);
            md.update(value.getBytes());

            byte byteData[] = md.digest();

            return encodeFormat1(byteData);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Convert the byte to hex format method 1
     *
     * @param byteData
     * @return
     */
    private static String encodeFormat1(byte byteData[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

    /**
     * Convert the byte to hex format method 2
     *
     * @param byteData
     * @return
     */
    private static String encodeFormat2(byte byteData[]) {
        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }
}
