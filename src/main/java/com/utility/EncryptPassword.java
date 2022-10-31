package com.utility;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptPassword {
    private static final String ALGO = "AES";

    private static final byte[] keyValue = new byte[] { 'm', 'Y', 'p', 'U', 'b', 'l', 'I', 'c', 'k', 'E', 'y', 'n', 'A',
            'e', 'E', 'M' };

    public static String decrypt(String encryptedData) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        //byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decordedValue = Base64.getDecoder().decode(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }

    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
    }

    public static String encrypt(String Data) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        //String encryptedValue = new BASE64Encoder().encode(encVal);
        String encryptedValue = Base64.getEncoder().encodeToString(encVal); 
        return encryptedValue;
    }

    public static void main(String[] args) throws Exception {
        String password = "123456q@";
        String passwordEnc = EncryptPassword.encrypt(password);
        System.out.println("Plain Text : " + password + " and it's Encryption is ::    " + passwordEnc);
        String passwordDec = EncryptPassword.decrypt(passwordEnc);
        System.out.println("Decrypted Text : " + passwordDec);
    }
}
