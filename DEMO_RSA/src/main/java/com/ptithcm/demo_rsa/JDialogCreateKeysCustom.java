/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.ptithcm.demo_rsa;

import java.math.BigInteger;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author MINHDAT
 */
public class JDialogCreateKeysCustom extends javax.swing.JDialog {
    private PnlCreateKeys pnlCreateKeys;

    /**
     * Creates new form JDialogCreateKeysCustom
     */
    public JDialogCreateKeysCustom(java.awt.Frame parent, boolean modal, PnlCreateKeys pnlCreateKeys) {
        super(parent, modal);
        this.pnlCreateKeys = pnlCreateKeys;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPrimeNumberP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrimeNumberQ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumberE = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sinh khóa thủ công");

        jLabel1.setText("Số nguyên tố p:");

        jLabel2.setText("Số nguyên tố q:");

        jLabel3.setText("Số e:");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPrimeNumberQ, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPrimeNumberP, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumberE, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrimeNumberP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrimeNumberQ, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumberE, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        setEnabled(false);
//        Xác thực tính đúng đắn của dữ liệu và tạo key
        if (Validate.createKeysCustom(this)) {
            BigInteger p = new BigInteger(txtPrimeNumberP.getText());
            BigInteger q = new BigInteger(txtPrimeNumberQ.getText());
            BigInteger e = new BigInteger(txtNumberE.getText());
            RSA rsa = new RSA();
            Keys keys = rsa.generateKeys(p, q, e);
            Key publicKey = keys.getPublicKey();
            Key privateKey = keys.getPrivateKey();
            pnlCreateKeys.getTxtPKNumberE().setText(publicKey.getX().toString());
            pnlCreateKeys.getTxtPkNumberN().setText(publicKey.getN().toString());
            pnlCreateKeys.getTxtPVKNumberD().setText(privateKey.getX().toString());
            pnlCreateKeys.getTxtPVKNumberN().setText(privateKey.getN().toString());

//        Đóng JDialog
            dispose();
        } else {
            setEnabled(true);
        }
    }//GEN-LAST:event_btnOKActionPerformed

//    Getters and setters
    public JButton getBtnOK() {
        return btnOK;
    }

    public void setBtnOK(JButton btnOK) {
        this.btnOK = btnOK;
    }

    public JTextField getTxtNumberE() {
        return txtNumberE;
    }

    public void setTxtNumberE(JTextField txtNumberE) {
        this.txtNumberE = txtNumberE;
    }

    public JTextField getTxtPrimeNumberP() {
        return txtPrimeNumberP;
    }

    public void setTxtPrimeNumberP(JTextField txtPrimeNumberP) {
        this.txtPrimeNumberP = txtPrimeNumberP;
    }

    public JTextField getTxtPrimeNumberQ() {
        return txtPrimeNumberQ;
    }

    public void setTxtPrimeNumberQ(JTextField txtPrimeNumberQ) {
        this.txtPrimeNumberQ = txtPrimeNumberQ;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNumberE;
    private javax.swing.JTextField txtPrimeNumberP;
    private javax.swing.JTextField txtPrimeNumberQ;
    // End of variables declaration//GEN-END:variables
}