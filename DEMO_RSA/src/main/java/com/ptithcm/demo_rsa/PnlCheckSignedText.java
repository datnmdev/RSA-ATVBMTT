/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.demo_rsa;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author MINHDAT
 */
public class PnlCheckSignedText extends javax.swing.JPanel {
    private FrmMain frmMain;

    /**
     * Creates new form PnlCreateKeys
     */
    public PnlCheckSignedText(FrmMain frmMain) {
        this.frmMain = frmMain;
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
        jScrollPane7 = new javax.swing.JScrollPane();
        txtPKNumberE = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtPKNumberN = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        btnSelectFile = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        btnOpenHashCode = new javax.swing.JButton();
        btnSaveHashCode = new javax.swing.JButton();
        btnCopyHashCode = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHashText = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        btnOpenSignedText = new javax.swing.JButton();
        btnSaveSignedText = new javax.swing.JButton();
        btnCopySignedText = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSignedText = new javax.swing.JTextArea();
        btnSign = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout(0, 10));

        jPanel1.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jPanel9.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel1.setText("Số e:");
        jPanel9.add(jLabel1, java.awt.BorderLayout.WEST);

        txtPKNumberE.setColumns(20);
        txtPKNumberE.setLineWrap(true);
        txtPKNumberE.setRows(5);
        txtPKNumberE.setWrapStyleWord(true);
        jScrollPane7.setViewportView(txtPKNumberE);

        jPanel9.add(jScrollPane7, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel9);

        jPanel13.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel2.setText("Số n:");
        jPanel13.add(jLabel2, java.awt.BorderLayout.WEST);

        txtPKNumberN.setColumns(20);
        txtPKNumberN.setLineWrap(true);
        txtPKNumberN.setRows(5);
        txtPKNumberN.setWrapStyleWord(true);
        jScrollPane8.setViewportView(txtPKNumberN);

        jPanel13.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel13);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel8.setLayout(new java.awt.CardLayout());

        btnSelectFile.setText("Chọn file");
        btnSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFileActionPerformed(evt);
            }
        });
        jPanel8.add(btnSelectFile, "card2");

        jPanel1.add(jPanel8, java.awt.BorderLayout.EAST);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hash.png"))); // NOI18N
        jLabel5.setText("MÃ HASH");
        jLabel5.setPreferredSize(new java.awt.Dimension(128, 60));
        jPanel11.add(jLabel5, java.awt.BorderLayout.NORTH);

        jPanel12.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setLayout(new java.awt.GridLayout(10, 1, 0, 2));

        btnOpenHashCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open.png"))); // NOI18N
        btnOpenHashCode.setText("Mở");
        btnOpenHashCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenHashCodeActionPerformed(evt);
            }
        });
        jPanel16.add(btnOpenHashCode);

        btnSaveHashCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSaveHashCode.setText("Lưu");
        btnSaveHashCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHashCodeActionPerformed(evt);
            }
        });
        jPanel16.add(btnSaveHashCode);

        btnCopyHashCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copy.png"))); // NOI18N
        btnCopyHashCode.setText("Sao chép");
        btnCopyHashCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyHashCodeActionPerformed(evt);
            }
        });
        jPanel16.add(btnCopyHashCode);

        jPanel15.add(jPanel16, java.awt.BorderLayout.EAST);

        txtHashText.setColumns(20);
        txtHashText.setLineWrap(true);
        txtHashText.setRows(5);
        txtHashText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtHashText);

        jPanel15.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign.png"))); // NOI18N
        jLabel6.setText("CHỮ KÝ SỐ");
        jLabel6.setPreferredSize(new java.awt.Dimension(128, 60));
        jPanel17.add(jLabel6, java.awt.BorderLayout.NORTH);

        jPanel18.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel21.setLayout(new java.awt.GridLayout(10, 1, 0, 2));

        btnOpenSignedText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open.png"))); // NOI18N
        btnOpenSignedText.setText("Mở");
        btnOpenSignedText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenSignedTextActionPerformed(evt);
            }
        });
        jPanel21.add(btnOpenSignedText);

        btnSaveSignedText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSaveSignedText.setText("Lưu");
        btnSaveSignedText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSignedTextActionPerformed(evt);
            }
        });
        jPanel21.add(btnSaveSignedText);

        btnCopySignedText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copy.png"))); // NOI18N
        btnCopySignedText.setText("Sao chép");
        btnCopySignedText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopySignedTextActionPerformed(evt);
            }
        });
        jPanel21.add(btnCopySignedText);

        jPanel20.add(jPanel21, java.awt.BorderLayout.EAST);

        txtSignedText.setColumns(20);
        txtSignedText.setLineWrap(true);
        txtSignedText.setRows(5);
        txtSignedText.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtSignedText);

        jPanel20.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17, java.awt.BorderLayout.SOUTH);

        jScrollPane5.setViewportView(jPanel2);

        add(jScrollPane5, java.awt.BorderLayout.CENTER);

        btnSign.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checktext.png"))); // NOI18N
        btnSign.setText("Xác nhận chữ ký");
        btnSign.setPreferredSize(new java.awt.Dimension(78, 40));
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });
        add(btnSign, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFileActionPerformed
//        Tạo trình chọn file
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Properties file", "properties");
        jFileChooser.setFileFilter(fileNameExtensionFilter);
        int result = jFileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
//            Đọc properties
            Properties prop = new Properties();
            try (InputStream inputStream = new FileInputStream(file);) {
                prop.load(inputStream);
                txtPKNumberE.setText(prop.getProperty("e"));
                txtPKNumberN.setText(prop.getProperty("n"));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSelectFileActionPerformed

    private void btnOpenHashCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenHashCodeActionPerformed
//        Tạo trình chọn file
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Txt file", "txt");
        jFileChooser.setFileFilter(fileNameExtensionFilter);
        int result = jFileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            switch (FilenameUtils.getExtension(file.getPath())) {
                case "txt":
                    try (FileInputStream in = new FileInputStream(file);) {
                        byte[] bytes = in.readAllBytes();
                        String txt = new String(bytes);
                        txtHashText.setText(txt);
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
        }
    }//GEN-LAST:event_btnOpenHashCodeActionPerformed

    private void btnSaveHashCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHashCodeActionPerformed
//        Tạo trình chọn file
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Txt file", "txt");
        jFileChooser.setFileFilter(fileNameExtensionFilter);
        int result = jFileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = jFileChooser.getSelectedFile().getPath();
            if (!path.endsWith(".txt")) {
                path += ".txt";
            }
            try (FileOutputStream out = new FileOutputStream(path);) {
                byte[] bytes = txtHashText.getText().getBytes();
                out.write(bytes);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveHashCodeActionPerformed

    private void btnCopyHashCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyHashCodeActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();;
        StringSelection selection = new StringSelection(txtHashText.getText());
        clipboard.setContents(selection, null);
    }//GEN-LAST:event_btnCopyHashCodeActionPerformed

    private void btnOpenSignedTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenSignedTextActionPerformed
//        Tạo trình chọn file
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Txt file", "txt");
        jFileChooser.setFileFilter(fileNameExtensionFilter);
        int result = jFileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            switch (FilenameUtils.getExtension(file.getPath())) {
                case "txt":
                    try (FileInputStream in = new FileInputStream(file);) {
                        byte[] bytes = in.readAllBytes();
                        String txt = new String(bytes);
                        txtSignedText.setText(txt);
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
        }
    }//GEN-LAST:event_btnOpenSignedTextActionPerformed

    private void btnSaveSignedTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSignedTextActionPerformed
//        Tạo trình chọn file
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Txt file", "txt");
        jFileChooser.setFileFilter(fileNameExtensionFilter);
        int result = jFileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = jFileChooser.getSelectedFile().getPath();
            if (!path.endsWith(".txt")) {
                path += ".txt";
            }
            try (FileOutputStream out = new FileOutputStream(path);) {
                byte[] bytes = txtSignedText.getText().getBytes();
                out.write(bytes);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveSignedTextActionPerformed

    private void btnCopySignedTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopySignedTextActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();;
        StringSelection selection = new StringSelection(txtSignedText.getText());
        clipboard.setContents(selection, null);
    }//GEN-LAST:event_btnCopySignedTextActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        if (Validate.checkSignedText(this, frmMain)) {
            try {
                Key key = new Key(new BigInteger(txtPKNumberE.getText()), new BigInteger(txtPKNumberN.getText()));
                if (RSA.getDecrypt(txtSignedText.getText(), key).equals(txtHashText.getText())) {
                    JOptionPane.showMessageDialog(frmMain, "Xác nhận thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frmMain, "Xác nhận thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frmMain, "Xác nhận thất bại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSignActionPerformed

//    Getters and setters
    public JTextArea getTxtHashText() {
        return txtHashText;
    }

    public void setTxtHashText(JTextArea txtHashText) {
        this.txtHashText = txtHashText;
    }

    public JTextArea getTxtPKNumberE() {
        return txtPKNumberE;
    }

    public void setTxtPKNumberE(JTextArea txtPKNumberE) {
        this.txtPKNumberE = txtPKNumberE;
    }

    public JTextArea getTxtPKNumberN() {
        return txtPKNumberN;
    }

    public void setTxtPKNumberN(JTextArea txtPKNumberN) {
        this.txtPKNumberN = txtPKNumberN;
    }

    public JTextArea getTxtSignedText() {
        return txtSignedText;
    }

    public void setTxtSignedText(JTextArea txtSignedText) {
        this.txtSignedText = txtSignedText;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopyHashCode;
    private javax.swing.JButton btnCopySignedText;
    private javax.swing.JButton btnOpenHashCode;
    private javax.swing.JButton btnOpenSignedText;
    private javax.swing.JButton btnSaveHashCode;
    private javax.swing.JButton btnSaveSignedText;
    private javax.swing.JButton btnSelectFile;
    private javax.swing.JButton btnSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea txtHashText;
    private javax.swing.JTextArea txtPKNumberE;
    private javax.swing.JTextArea txtPKNumberN;
    private javax.swing.JTextArea txtSignedText;
    // End of variables declaration//GEN-END:variables
}
