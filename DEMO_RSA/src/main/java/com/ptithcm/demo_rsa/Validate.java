/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.demo_rsa;

import java.math.BigInteger;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author MINHDAT
 */
public class Validate {
    public static boolean createKeysCustom(JDialogCreateKeysCustom jDialogCreateKeysCustom, FrmMain frmMain) {
        
        String error = null;
        if (StringUtils.isNumeric(jDialogCreateKeysCustom.getTxtPrimeNumberP().getText())) {
            error = "p không hợp lệ!";
        } else if (StringUtils.isNumeric(jDialogCreateKeysCustom.getTxtPrimeNumberQ().getText())) {
            error = "q không hợp lệ!";
        } else if (StringUtils.isNumeric(jDialogCreateKeysCustom.getTxtNumberE().getText())) {
            error = "e không hợp lệ!";
        } else if (jDialogCreateKeysCustom.getTxtPrimeNumberP().getText().equals("")) {
            error = "Vui lòng nhập p!";
        } else if (jDialogCreateKeysCustom.getTxtPrimeNumberQ().getText().equals("")) {
            error = "Vui lòng nhập q!";
        } else if (jDialogCreateKeysCustom.getTxtNumberE().getText().equals("")) {
            error = "Vui lòng nhập e!";
        } else {
            BigInteger p = new BigInteger(jDialogCreateKeysCustom.getTxtPrimeNumberP().getText());
            BigInteger q = new BigInteger(jDialogCreateKeysCustom.getTxtPrimeNumberQ().getText());
            BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
            BigInteger e = new BigInteger(jDialogCreateKeysCustom.getTxtNumberE().getText());
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
        }
        
        if (error != null) {
            JOptionPane.showMessageDialog(jDialogCreateKeysCustom, error, "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    } 
    
    public static boolean encrypt(PnlEncryption pnlEncryption, FrmMain frmMain) {
        String error = null;
        if (pnlEncryption.getTxtPKNumberE().getText().equals("")) {
            error = "Vui lòng nhập số e trước khi mã hóa!";
        } else if (pnlEncryption.getTxtPKNumberN().getText().equals("")) {
            error = "Vui lòng nhập số n trước khi mã hóa";
        }
        
        if (error != null) {
            JOptionPane.showMessageDialog(frmMain, error, "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    public static boolean decrypt(PnlDecryption pnlDecryption, FrmMain frmMain) {
        String error = null;
        if (pnlDecryption.getTxtPVKNumberD().getText().equals("")) {
            error = "Vui lòng nhập số d trước khi giải mã!";
        } else if (pnlDecryption.getTxtPVKNumberN().getText().equals("")) {
            error = "Vui lòng nhập số n trước khi giải mã";
        }
        
        if (error != null) {
            JOptionPane.showMessageDialog(frmMain, error, "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    public static boolean signature(PnlSignature pnlSignature, FrmMain frmMain) {
        String error = null;
        if (pnlSignature.getTxtPVKNumberD().getText().equals("")) {
            error = "Vui lòng nhập số d trước khi ký!";
        } else if (pnlSignature.getTxtPVKNumberN().getText().equals("")) {
            error = "Vui lòng nhập số n trước khi ký";
        } else if (pnlSignature.getTxtPlainText().getText().equals("")) {
            error = "Vui lòng nhập văn bản cần ký";
        }
        
        if (error != null) {
            JOptionPane.showMessageDialog(frmMain, error, "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    public static boolean checkSignedText(PnlCheckSignedText pnlCheckSignedText, FrmMain frmMain) {
        String error = null;
        if (pnlCheckSignedText.getTxtPKNumberE().getText().equals("")) {
            error = "Vui lòng nhập số e trước khi kiểm tra chữ ký!";
        } else if (pnlCheckSignedText.getTxtPKNumberN().getText().equals("")) {
            error = "Vui lòng nhập số n trước khi kiểm tra chữ ký!";
        } else if (pnlCheckSignedText.getTxtHashText().getText().equals("")) {
            error = "Vui lòng nhập mã hash của văn bản trước khi kiểm tra chữ ký";
        } else if (pnlCheckSignedText.getTxtSignedText().getText().equals("")) {
            error = "Vui lòng nhập chữ ký số cần kiểm tra";
        }
        
        if (error != null) {
            JOptionPane.showMessageDialog(frmMain, error, "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
}
