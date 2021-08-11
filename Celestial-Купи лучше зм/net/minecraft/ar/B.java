/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.ar;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.ar.v;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class B {
    private static final /* synthetic */ Logger a;

    private static byte[] a(int n2, Key key, byte[] arrby) {
        try {
            return B.a(n2, key.getAlgorithm(), key).doFinal(arrby);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            illegalBlockSizeException.printStackTrace();
        }
        catch (BadPaddingException badPaddingException) {
            badPaddingException.printStackTrace();
        }
        a.error("Cipher data failed!");
        return null;
    }

    public static PublicKey a(byte[] arrby) {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(arrby);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePublic(x509EncodedKeySpec);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            // empty catch block
        }
        a.error("Public key reconstitute failed!");
        return null;
    }

    private static Cipher a(int n2, String string, Key key) {
        try {
            Cipher cipher = Cipher.getInstance(string);
            cipher.init(n2, key);
            return cipher;
        }
        catch (InvalidKeyException invalidKeyException) {
            invalidKeyException.printStackTrace();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            noSuchPaddingException.printStackTrace();
        }
        a.error("Cipher creation failed!");
        return null;
    }

    public static byte[] b(Key key, byte[] arrby) {
        return B.a(1, key, arrby);
    }

    private static byte[] a(String string, byte[] ... arrby) {
        int n2 = v.b();
        try {
            MessageDigest messageDigest;
            block4: {
                MessageDigest messageDigest2 = MessageDigest.getInstance(string);
                for (byte[] arrby2 : arrby) {
                    messageDigest = messageDigest2;
                    if (n2 == 0) {
                        messageDigest.update(arrby2);
                        if (n2 == 0) continue;
                    }
                    break block4;
                }
                messageDigest = messageDigest2;
            }
            return messageDigest.digest();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return null;
        }
    }

    static {
        a = LogManager.getLogger();
    }

    private static NoSuchAlgorithmException a(NoSuchAlgorithmException noSuchAlgorithmException) {
        return noSuchAlgorithmException;
    }

    public static SecretKey b() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            return keyGenerator.generateKey();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Error(noSuchAlgorithmException);
        }
    }

    public static KeyPair a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.generateKeyPair();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            a.error("Key pair generation failed!");
            return null;
        }
    }

    public static byte[] a(String string, PublicKey publicKey, SecretKey secretKey) {
        try {
            return B.a("SHA-1", string.getBytes("ISO_8859_1"), secretKey.getEncoded(), publicKey.getEncoded());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            return null;
        }
    }

    public static SecretKey a(PrivateKey privateKey, byte[] arrby) {
        return new SecretKeySpec(B.a((Key)privateKey, arrby), "AES");
    }

    public static Cipher a(int n2, Key key) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");
            cipher.init(n2, key, new IvParameterSpec(key.getEncoded()));
            return cipher;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new RuntimeException(generalSecurityException);
        }
    }

    public static byte[] a(Key key, byte[] arrby) {
        return B.a(2, key, arrby);
    }
}

