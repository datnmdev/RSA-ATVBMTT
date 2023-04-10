/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.demo_rsa;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 *
 * @author MINHDAT
 */
public class RSA {
    private final static BigInteger ONE = BigInteger.ONE;
    private int keyLength;

//    Constructors
    public RSA() {
    }

    public RSA(int keyLength) {
        this.keyLength = keyLength;
    }
    
//    Methods
    public Keys autoGenerateKeys() {
        // Sinh số nguyên tố p và q
        BigInteger p = BigInteger.probablePrime(keyLength / 2, new SecureRandom());
        BigInteger q = BigInteger.probablePrime(keyLength / 2, new SecureRandom());
        
        // Tính n = p*q và phi(n) = (p-1)(q-1)
        BigInteger n = p.multiply(q);
        BigInteger phi = (p.subtract(ONE)).multiply(q.subtract(ONE));
        
        // Tìm số e sao cho gcd(e, phi) = 1
        BigInteger e = BigInteger.probablePrime(keyLength / 2, new SecureRandom());
        while (phi.gcd(e).compareTo(ONE) > 0 && e.compareTo(phi) < 0) {
            e.add(ONE);
        }
        
        // Tính d sao cho d*e = 1 mod phi(n)
        BigInteger d = e.modInverse(phi);
        
        // Tổng hợp khóa
        Key publicKey = new Key(e, n);
        Key privateKey = new Key(d, n);
        
        return new Keys(privateKey, publicKey);
    }
    
    public Keys generateKeys(BigInteger p, BigInteger q, BigInteger e) {
//        Tính n và phi(n)
        BigInteger n = p.multiply(q);
        BigInteger phi = (p.subtract(ONE)).multiply(q.subtract(ONE));
        
        // Tính d sao cho d*e = 1 mod phi(n)
        BigInteger d = e.modInverse(phi);
        
        // Tổng hợp khóa
        Key publicKey = new Key(e, n);
        Key privateKey = new Key(d, n);
        
        return new Keys(privateKey, publicKey);
    }
    
    public static String getEncrypt(String plainText, Key key) throws Exception {
        StringBuilder plainBinary = new StringBuilder();
        for (int i = 0; i < plainText.length(); ++i) {
            String charCodeBinary = Integer.toBinaryString(plainText.codePointAt(i));
            plainBinary.append(String.format("%32s", charCodeBinary).replace(' ', '0'));
        }
        
//       Mã khối với mỗi khối dài 32 bit (khối có thể thay đổi tùy ý) (trong demo này định dạng 32 bit ứng với 1 kí tự)
        int length = plainBinary.length();
        int repeat;
        if (length % 32 == 0) {
            repeat = length / 32;
        } else {
            repeat = length / 32 + 1;
        }
        int index = 0;
        StringBuilder encryptText = new StringBuilder();
        String regex = "#";
        for (int i = 0; i < repeat; ++i) {
            BigInteger binary = new BigInteger(plainBinary.substring(index, (index = index + 32)));
            BigInteger M = binary.modPow(key.getX(), key.getN());
            encryptText.append(M.toString() + regex);
        }
        
        return String.valueOf(encryptText);
    }

    
    public static String getDecrypt(String encyptedText, Key key) {
        String[] split = encyptedText.split("#");
        StringBuilder plainText = new StringBuilder();
        for (String str : split) {
            BigInteger encryptBinary = new BigInteger(str);
            BigInteger plainBinary = encryptBinary.modPow(key.getX(), key.getN());
            int plainInteger = Integer.parseInt(plainBinary.toString(), 2);
            char plainCharacter = Character.toChars(plainInteger)[0];
            plainText.append(plainCharacter);
        }
        
        return String.valueOf(plainText);
    }
}