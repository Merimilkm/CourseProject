package com.nyha.webfinal.util;

import java.math.BigInteger;
import java.util.Base64;


public class PasswordEncryption {
    private PasswordEncryption() {
    }


    public static String encrypt(String unencrypted) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytesEncoded = encoder.encode(unencrypted.getBytes());
        BigInteger bigInt = new BigInteger(1, bytesEncoded);
        String encrypted = bigInt.toString(16);
        return encrypted;
    }
}
