package com.example.lococoder.md5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static podia.system.Config.SALT;

public class LMd5 {


  public static String md5(String s) {
    s=SALT+s;
    MessageDigest mdEnc = null;
    try {
      mdEnc = MessageDigest.getInstance("MD5");
    } catch (NoSuchAlgorithmException e) {
      System.out.println("Exception while encrypting to md5");
      e.printStackTrace();
    } // Encryption algorithm
    mdEnc.update(s.getBytes(), 0, s.length());
    String md5 = new BigInteger(1, mdEnc.digest()).toString(16);
    while ( md5.length() < 32 ) {
      md5 = "0"+md5;
    }
    return md5;
  }
}
