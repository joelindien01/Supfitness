/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supfitness.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author asus
 */

public class PasswordEncryption {

     private static MessageDigest messageDigest;

    static {
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String Md5Encryptor(String value) {
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("String to encript cannot be null or zero length");
        }
        messageDigest.update(value.getBytes());
        byte[] hash = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        
        for (int i = 0; i < hash.length; i++) {
            if ((0xff & hash[i]) < 0x10) { stringBuffer.append("0" + Integer.toHexString((0xFF & hash[i]))); }
            else { stringBuffer.append(Integer.toHexString(0xFF & hash[i])); }
        }
        return stringBuffer.toString();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
