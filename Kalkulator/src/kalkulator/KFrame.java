/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kalkulator;

/**
 *
 * @author User
 */
public class KFrame extends javax.swing.JFrame {
    private boolean lanjutAngka;
    private Kalkulator kal;
    
    /**
     * Creates new form KFrame
     */
    public KFrame() {
        lanjutAngka = true;
        kal = new Kalkulator();
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

        txtTampilan = new javax.swing.JTextField();
        tmbol1 = new javax.swing.JButton();
        tmbol2 = new javax.swing.JButton();
        tmbol3 = new javax.swing.JButton();
        tmbol4 = new javax.swing.JButton();
        tmbol5 = new javax.swing.JButton();
        tmbol6 = new javax.swing.JButton();
        tmbol7 = new javax.swing.JButton();
        tmbol8 = new javax.swing.JButton();
        tmbol9 = new javax.swing.JButton();
        tmbol0 = new javax.swing.JButton();
        tmbol00 = new javax.swing.JButton();
        tmbolKurang = new javax.swing.JButton();
        tmbolSamadengan = new javax.swing.JButton();
        tmbolTambah = new javax.swing.JButton();
        tmbolBagi = new javax.swing.JButton();
        tmbolKali = new javax.swing.JButton();
        tmbolreset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setPreferredSize(new java.awt.Dimension(370, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTampilan.setBackground(new java.awt.Color(204, 204, 255));
        txtTampilan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTampilan.setForeground(new java.awt.Color(0, 0, 51));
        txtTampilan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtTampilan.setText("0");
        txtTampilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTampilanActionPerformed(evt);
            }
        });
        getContentPane().add(txtTampilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 340, -1));

        tmbol1.setBackground(new java.awt.Color(51, 0, 204));
        tmbol1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol1.setForeground(new java.awt.Color(255, 153, 255));
        tmbol1.setText("1");
        tmbol1.setBorderPainted(false);
        tmbol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol1ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 60));

        tmbol2.setBackground(new java.awt.Color(102, 0, 255));
        tmbol2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol2.setForeground(new java.awt.Color(255, 153, 255));
        tmbol2.setText("2");
        tmbol2.setBorderPainted(false);
        tmbol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol2ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, 60));

        tmbol3.setBackground(new java.awt.Color(51, 0, 204));
        tmbol3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol3.setForeground(new java.awt.Color(255, 153, 255));
        tmbol3.setText("3");
        tmbol3.setBorderPainted(false);
        tmbol3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol3ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 60, 60));

        tmbol4.setBackground(new java.awt.Color(51, 0, 204));
        tmbol4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol4.setForeground(new java.awt.Color(255, 153, 255));
        tmbol4.setText("4");
        tmbol4.setBorderPainted(false);
        tmbol4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol4ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 60));

        tmbol5.setBackground(new java.awt.Color(102, 0, 255));
        tmbol5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol5.setForeground(new java.awt.Color(255, 153, 255));
        tmbol5.setText("5");
        tmbol5.setBorderPainted(false);
        tmbol5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol5ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 60, 60));

        tmbol6.setBackground(new java.awt.Color(51, 0, 204));
        tmbol6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol6.setForeground(new java.awt.Color(255, 153, 255));
        tmbol6.setText("6");
        tmbol6.setBorderPainted(false);
        tmbol6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol6ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 60, 60));

        tmbol7.setBackground(new java.awt.Color(51, 0, 204));
        tmbol7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol7.setForeground(new java.awt.Color(255, 153, 255));
        tmbol7.setText("7");
        tmbol7.setBorderPainted(false);
        tmbol7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol7ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, 60));

        tmbol8.setBackground(new java.awt.Color(102, 0, 255));
        tmbol8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol8.setForeground(new java.awt.Color(255, 153, 255));
        tmbol8.setText("8");
        tmbol8.setBorderPainted(false);
        tmbol8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol8ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 60, 60));

        tmbol9.setBackground(new java.awt.Color(51, 0, 204));
        tmbol9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol9.setForeground(new java.awt.Color(255, 153, 255));
        tmbol9.setText("9");
        tmbol9.setBorderPainted(false);
        tmbol9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol9ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 60, 60));

        tmbol0.setBackground(new java.awt.Color(102, 0, 255));
        tmbol0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol0.setForeground(new java.awt.Color(255, 153, 255));
        tmbol0.setText("0");
        tmbol0.setBorderPainted(false);
        tmbol0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol0ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 60, 60));

        tmbol00.setBackground(new java.awt.Color(255, 102, 255));
        tmbol00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbol00.setText("00");
        tmbol00.setBorderPainted(false);
        tmbol00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbol00ActionPerformed(evt);
            }
        });
        getContentPane().add(tmbol00, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, 60));

        tmbolKurang.setBackground(new java.awt.Color(255, 204, 255));
        tmbolKurang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbolKurang.setForeground(new java.awt.Color(0, 153, 204));
        tmbolKurang.setText("-");
        tmbolKurang.setBorderPainted(false);
        tmbolKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbolKurangActionPerformed(evt);
            }
        });
        getContentPane().add(tmbolKurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 60, 60));

        tmbolSamadengan.setBackground(new java.awt.Color(255, 204, 255));
        tmbolSamadengan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbolSamadengan.setForeground(new java.awt.Color(0, 153, 204));
        tmbolSamadengan.setText("=");
        tmbolSamadengan.setBorderPainted(false);
        tmbolSamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbolSamadenganActionPerformed(evt);
            }
        });
        getContentPane().add(tmbolSamadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 60, 60));

        tmbolTambah.setBackground(new java.awt.Color(255, 204, 255));
        tmbolTambah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbolTambah.setForeground(new java.awt.Color(0, 153, 204));
        tmbolTambah.setText("+");
        tmbolTambah.setBorderPainted(false);
        tmbolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbolTambahActionPerformed(evt);
            }
        });
        getContentPane().add(tmbolTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 60, 60));

        tmbolBagi.setBackground(new java.awt.Color(255, 204, 255));
        tmbolBagi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbolBagi.setForeground(new java.awt.Color(0, 153, 204));
        tmbolBagi.setText(":");
        tmbolBagi.setBorderPainted(false);
        tmbolBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbolBagiActionPerformed(evt);
            }
        });
        getContentPane().add(tmbolBagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 60, 60));

        tmbolKali.setBackground(new java.awt.Color(255, 204, 255));
        tmbolKali.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbolKali.setForeground(new java.awt.Color(0, 153, 204));
        tmbolKali.setText("x");
        tmbolKali.setBorderPainted(false);
        tmbolKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbolKaliActionPerformed(evt);
            }
        });
        getContentPane().add(tmbolKali, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 60, 60));

        tmbolreset.setBackground(new java.awt.Color(255, 204, 255));
        tmbolreset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tmbolreset.setForeground(new java.awt.Color(0, 153, 204));
        tmbolreset.setText("C");
        tmbolreset.setBorderPainted(false);
        tmbolreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbolresetActionPerformed(evt);
            }
        });
        getContentPane().add(tmbolreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 60, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Designed By: Batara Obed H. S");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 340, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Kalkulator Sederhana");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Symbol", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Kalkulator Sederhanapppppppppppppppppppppppppp");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 340, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTampilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTampilanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTampilanActionPerformed

    private void tmbol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol2ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 10 + 2;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("2");
            lanjutAngka = true;
        }
    }//GEN-LAST:event_tmbol2ActionPerformed

    private void tmbol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol1ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 10 + 1;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("1");
            lanjutAngka = true;
        }
        
    }//GEN-LAST:event_tmbol1ActionPerformed

    private void tmbolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbolTambahActionPerformed
        // TODO add your handling code here:
        lanjutAngka = false;
        long angka = Long.parseLong(txtTampilan.getText());
        
        kal.penambahan(angka);
    }//GEN-LAST:event_tmbolTambahActionPerformed

    private void tmbol3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol3ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 10 + 3;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("3");
            lanjutAngka = true;
        }
    }//GEN-LAST:event_tmbol3ActionPerformed

    private void tmbol4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol4ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 10 + 4;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("4");
            lanjutAngka = true;
        }
    }//GEN-LAST:event_tmbol4ActionPerformed

    private void tmbol5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol5ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 10 + 5;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("5");
            lanjutAngka = true;
        }
    }//GEN-LAST:event_tmbol5ActionPerformed

    private void tmbol6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol6ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 10 + 6;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("6");
            lanjutAngka = true;
        }
    }//GEN-LAST:event_tmbol6ActionPerformed

    private void tmbol7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol7ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 10 + 7;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("7");
            lanjutAngka = true;
        }
    }//GEN-LAST:event_tmbol7ActionPerformed

    private void tmbol8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol8ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 10 + 8;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("8");
            lanjutAngka = true;
        }
    }//GEN-LAST:event_tmbol8ActionPerformed

    private void tmbol9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol9ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 10 + 9;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("9");
            lanjutAngka = true;
        }
    }//GEN-LAST:event_tmbol9ActionPerformed

    private void tmbol0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol0ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 10;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("0");
            lanjutAngka = true;
        }
    }//GEN-LAST:event_tmbol0ActionPerformed

    private void tmbol00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbol00ActionPerformed
        // TODO add your handling code here:
        long angka = Long.parseLong(txtTampilan.getText());
        if (lanjutAngka == true) {
            long angkaBaru = angka * 100;
            txtTampilan.setText(""+angkaBaru);
        }else {
            txtTampilan.setText("00");
            lanjutAngka = true;
        }
    }//GEN-LAST:event_tmbol00ActionPerformed

    private void tmbolSamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbolSamadenganActionPerformed
        // TODO add your handling code here:
        lanjutAngka = false;
        long angka = Long.parseLong(txtTampilan.getText());
        
        long hasil = kal.eksekusiOperasi(angka);
        txtTampilan.setText(""+hasil);
    }//GEN-LAST:event_tmbolSamadenganActionPerformed

    private void tmbolKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbolKurangActionPerformed
        // TODO add your handling code here:
        lanjutAngka = false;
        long angka = Long.parseLong(txtTampilan.getText());
        
        kal.pengurangan(angka);
    }//GEN-LAST:event_tmbolKurangActionPerformed

    private void tmbolKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbolKaliActionPerformed
        // TODO add your handling code here:
        lanjutAngka = false;
        long angka = Long.parseLong(txtTampilan.getText());
        
        kal.perkalian(angka);
    }//GEN-LAST:event_tmbolKaliActionPerformed

    private void tmbolBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbolBagiActionPerformed
        // TODO add your handling code here:
        lanjutAngka = false;
        long angka = Long.parseLong(txtTampilan.getText());
        
        kal.pembagian(angka);
    }//GEN-LAST:event_tmbolBagiActionPerformed

    private void tmbolresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbolresetActionPerformed
        // TODO add your handling code here:
        lanjutAngka = false;
        long angka = Long.parseLong(txtTampilan.getText());
        kal.eksekusiOperasi(angka);
        txtTampilan.setText(""+0);
    }//GEN-LAST:event_tmbolresetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tmbol0;
    private javax.swing.JButton tmbol00;
    private javax.swing.JButton tmbol1;
    private javax.swing.JButton tmbol2;
    private javax.swing.JButton tmbol3;
    private javax.swing.JButton tmbol4;
    private javax.swing.JButton tmbol5;
    private javax.swing.JButton tmbol6;
    private javax.swing.JButton tmbol7;
    private javax.swing.JButton tmbol8;
    private javax.swing.JButton tmbol9;
    private javax.swing.JButton tmbolBagi;
    private javax.swing.JButton tmbolKali;
    private javax.swing.JButton tmbolKurang;
    private javax.swing.JButton tmbolSamadengan;
    private javax.swing.JButton tmbolTambah;
    private javax.swing.JButton tmbolreset;
    private javax.swing.JTextField txtTampilan;
    // End of variables declaration//GEN-END:variables
}
