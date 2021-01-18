package com.yc.shop_server.config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密工具类
 */
public class MD5Utile {

    public static String code(String str){
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(str.getBytes());
            byte[] digest = md5.digest();
            int i;
            StringBuffer stringBuffer = new StringBuffer("");
            for (int offset = 0; offset < digest.length; offset++){
                i = digest[offset];
                if (i<0){
                    i+=256;
                }
                if (i<16){
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i));
            }
            return stringBuffer.toString();
//            return stringBuffer.toString().substring(8,24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

            return null;
        }
    }

    public static void main(String[] args) {
        for (int i = 0;i<30;i++) {
            String code = code("123456abc");
            System.out.println(code);
        }
    }
}
