/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.demo_rsa;

/**
 *
 * @author MINHDAT
 */
public class PnlValidateSign extends javax.swing.JPanel {

    /**
     * Creates new form PnlCreateKeys
     */
    public PnlValidateSign() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jPanel21 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel16 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout(0, 10));

        jPanel1.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jPanel9.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel1.setText("Số e:");
        jPanel9.add(jLabel1, java.awt.BorderLayout.WEST);

        jScrollPane4.setViewportView(jTextPane4);

        jPanel9.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel9);

        jPanel13.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel2.setText("Số n:");
        jPanel13.add(jLabel2, java.awt.BorderLayout.WEST);

        jTextPane3.setPreferredSize(new java.awt.Dimension(62, 60));
        jScrollPane3.setViewportView(jTextPane3);

        jPanel13.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel13);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel8.setLayout(new java.awt.CardLayout());

        jButton7.setText("Chọn file");
        jPanel8.add(jButton7, "card2");

        jPanel1.add(jPanel8, java.awt.BorderLayout.EAST);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plaintext.png"))); // NOI18N
        jLabel4.setText("BẢNG RÕ");
        jLabel4.setPreferredSize(new java.awt.Dimension(128, 60));
        jPanel10.add(jLabel4, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel6.setLayout(new java.awt.BorderLayout(10, 0));
        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(jTextPane1);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new java.awt.GridLayout(10, 1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open.png"))); // NOI18N
        jButton3.setText("Mở");
        jPanel7.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jButton4.setText("Lưu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copy.png"))); // NOI18N
        jButton11.setText("Sao chép");
        jPanel7.add(jButton11);

        jPanel4.add(jPanel7, java.awt.BorderLayout.EAST);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign.png"))); // NOI18N
        jLabel6.setText("CHỮ KÝ SỐ");
        jLabel6.setPreferredSize(new java.awt.Dimension(128, 60));
        jPanel17.add(jLabel6, java.awt.BorderLayout.NORTH);

        jPanel18.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel19.setLayout(new java.awt.BorderLayout(10, 0));
        jPanel18.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel20.setLayout(new java.awt.BorderLayout());

        jScrollPane6.setViewportView(jTextPane5);

        jPanel20.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jPanel21.setLayout(new java.awt.GridLayout(10, 1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open.png"))); // NOI18N
        jButton8.setText("Mở");
        jPanel21.add(jButton8);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jButton9.setText("Lưu");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton9);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copy.png"))); // NOI18N
        jButton13.setText("Sao chép");
        jPanel21.add(jButton13);

        jPanel20.add(jPanel21, java.awt.BorderLayout.EAST);

        jPanel18.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hash.png"))); // NOI18N
        jLabel5.setText("MÃ HASH");
        jLabel5.setPreferredSize(new java.awt.Dimension(128, 60));
        jPanel11.add(jLabel5, java.awt.BorderLayout.NORTH);

        jPanel12.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel14.setLayout(new java.awt.BorderLayout(10, 0));
        jPanel12.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setViewportView(jTextPane2);

        jPanel15.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel16.setLayout(new java.awt.GridLayout(10, 1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open.png"))); // NOI18N
        jButton5.setText("Mở");
        jPanel16.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jButton6.setText("Lưu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton6);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copy.png"))); // NOI18N
        jButton12.setText("Sao chép");
        jPanel16.add(jButton12);

        jPanel15.add(jPanel16, java.awt.BorderLayout.EAST);

        jPanel12.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11, java.awt.BorderLayout.SOUTH);

        jScrollPane5.setViewportView(jPanel2);

        add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checktext.png"))); // NOI18N
        jButton1.setText("XÁC NHẬN CHỮ KÝ");
        jButton1.setPreferredSize(new java.awt.Dimension(78, 40));
        add(jButton1, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    // End of variables declaration//GEN-END:variables
}
