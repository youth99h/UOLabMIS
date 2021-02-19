package com.ychs.uolab.util;
 

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密实用类
 * @author  wuzhijun
 * @version 1.0
 */
public class Md5Util {

    /**
     * 对原始密码进行加密
     * 
     * @param password 原始密码
     * @return 使用MD5加密后的密码
     */
    public static String getMD5(String password){
        String newPassword = "";
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(password.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            newPassword = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return newPassword;
    }

    /**
     * 验证密码是否正确
     * 
     * @param password     当前获取的密码
     * @param passwordInDb 数据库查到的密码
     * @return 验证成功返回true，失败返回false
     */
    public static boolean validatePassword(String password, String passwordInDb) {
        boolean result = false;
        if (getMD5(password).equals(passwordInDb)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * @param args 加密测试
     *
     */
    public static void main(String[] args) {
        // 解密网站：https://www.cmd5.com/

        // 定义原始密码
        String oldStr = "123456";
        System.out.println("加密前：" + oldStr);

        // 使用MD5加密后的密码
        String newStr = getMD5(oldStr);
        System.out.println("加密后：" + newStr);

        // 验证密码时候正确
        boolean result = validatePassword(oldStr, newStr);
        System.out.println("验证密码结果：" + result);

    }

}
