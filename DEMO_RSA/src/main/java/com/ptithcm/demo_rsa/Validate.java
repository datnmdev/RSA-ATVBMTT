/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.demo_rsa;

import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author MINHDAT
 */
public class Validate {
    public static Boolean createKeysCustom(JDialogCreateKeysCustom jDialogCreateKeysCustom) {
        BigInteger p = new BigInteger(jDialogCreateKeysCustom.getTxtPrimeNumberP().getText());
        BigInteger q = new BigInteger(jDialogCreateKeysCustom.getTxtPrimeNumberQ().getText());
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        BigInteger e = new BigInteger(jDialogCreateKeysCustom.getTxtNumberE().getText());
        String error = null;
        if (!p.isProbablePrime(200)) {
            error = "p không phải là một số nguyên tố! Vui lòng nhập lại";
        } else if (!q.isProbablePrime(200)) {
            error = "q không phải là một số nguyên tố! Vui lòng nhập lại";
        } else if (p.equals(q)) {
            error = "p và q phải khác nhau vì lý do an toàn của khóa";
        } else if (e.compareTo(BigInteger.ONE) < 0 || e.compareTo(BigInteger.ONE) == 0) {
            error = "e phải lớn hơn 1!";
        } else if (e.compareTo(phi) > 0 || e.compareTo(phi) == 0) {
            error = "e phải nhỏ hơn phi(n) = (p-1)(q-1)!";
        } else if (e.gcd(phi).compareTo(BigInteger.ONE) > 0 || e.gcd(phi).compareTo(BigInteger.ONE) < 0) {
            error = "e không chính xác. Số e và phi(n) phải có ước chung lớn nhất bằng 1. Tức e và phi(n) là 2 số nguyên tố cùng nhau";
        }
        
        if (error != null) {
            JOptionPane.showMessageDialog(jDialogCreateKeysCustom, error, "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    } 
}
