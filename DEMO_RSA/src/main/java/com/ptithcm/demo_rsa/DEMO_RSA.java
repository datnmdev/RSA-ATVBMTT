/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ptithcm.demo_rsa;

import javax.swing.JOptionPane;

/**
 *
 * @author MINHDAT
 */
public class DEMO_RSA {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thread() {
                    @Override
                    public void run() {
//                Khởi động Form introduce
                        FrmIntro frmIntro = new FrmIntro();
                        frmIntro.setLocationRelativeTo(null);
                        frmIntro.setVisible(true);
                        try {
                            Thread.sleep(6000);
                        } catch (InterruptedException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        frmIntro.dispose();

 //                Khởi động form main
                        FrmMain frmMain = new FrmMain();
                        frmMain.setLocationRelativeTo(null);
                        frmMain.setVisible(true);
                    }
                }.start();
            }
        });
    }
}
