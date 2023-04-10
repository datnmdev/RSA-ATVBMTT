/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.ptithcm.demo_rsa;

/**
 *
 * @author MINHDAT
 */
public class JDialogCreateKeysAutomatic extends javax.swing.JDialog {
    private PnlCreateKeys pnlCreateKeys;

    /**
     * Creates new form JDialogCreateKeysAutomatic
     */
    public JDialogCreateKeysAutomatic(java.awt.Frame parent, boolean modal, PnlCreateKeys pnlCreateKeys) {
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
        cboKeyLength = new javax.swing.JComboBox<>();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sinh khóa tự động");

        jLabel1.setText("Độ dài khóa:");

        cboKeyLength.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "512 bit", "1024 bit", "2048 bit", "3072 bit", "4098 bit" }));

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
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboKeyLength, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboKeyLength, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        setEnabled(false);
//        Tạo key và hiển thị ra màn hình
        int keyLength = Integer.parseInt(String.valueOf(cboKeyLength.getSelectedItem()).split(" ")[0]);
        RSA rsa = new RSA(keyLength);
        Keys keys = rsa.autoGenerateKeys();
        Key publicKey = keys.getPublicKey();
        Key privateKey = keys.getPrivateKey();
        pnlCreateKeys.getTxtPKNumberE().setText(publicKey.getX().toString());
        pnlCreateKeys.getTxtPkNumberN().setText(publicKey.getN().toString());
        pnlCreateKeys.getTxtPVKNumberD().setText(privateKey.getX().toString());
        pnlCreateKeys.getTxtPVKNumberN().setText(privateKey.getN().toString());
        
//        Đóng JDialog
        dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> cboKeyLength;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
