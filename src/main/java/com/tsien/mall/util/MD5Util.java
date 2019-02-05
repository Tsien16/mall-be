package com.tsien.mall.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/2/4 0004 10:17
 */

public class MD5Util {
    private static String byteArrayToHexString(byte b[]) {
        StringBuilder resultSb = new StringBuilder();
        for (byte b1 : b) {
            resultSb.append(byteToHexString(b1));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return HEX_DIGITS[d1] + HEX_DIGITS[d2];
    }

    /**
     * 返回大写MD5
     *
     * @param origin 原始字符
     * @return 加密后的MD5
     */
    private static String md5encode(String origin) {
        String resultString = null;
        try {
            resultString = origin;
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHexString(md.digest(resultString.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception ignored) {
        }
        return resultString.toUpperCase();
    }

    public static String md5encodeutf8(String origin) {
        origin += PropertiesUtil.getProperty("password.salt", "");
        return md5encode(origin);
    }


    private static final String[] HEX_DIGITS = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

}
