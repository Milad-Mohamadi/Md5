# Md5
Encrypt your String(pass,data,etc) to save on database and send to server

1- create LMD5 class:

    public class LMd5 {
    public static String md5(String s) {
    String salt="lkjasghdjkashdkjasasdfsd1224";//add salt for custom md5
    s=salt+s;
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
    
2- use function to hash and encrypt your pass and data any where
    
    String password="123456789";
    LMd5.md5(password);
    
    
