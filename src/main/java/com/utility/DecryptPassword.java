package com.utility;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class DecryptPassword {
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
}
