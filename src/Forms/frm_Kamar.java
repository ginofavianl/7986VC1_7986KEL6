/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class frm_Kamar extends javax.swing.JFrame {

    /**
     * Creates new form frm_Kamar
     */
    public frm_Kamar() {
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

        layoutStyle1 = new org.jdesktop.layout.LayoutStyle();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        jPanel1 = new javax.swing.JPanel();
        btnSimpanKamar = new javax.swing.JButton();
        btnTambahKamar = new javax.swing.JButton();
        btnEditKamar = new javax.swing.JButton();
        btnHapusKamar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKamar = new javax.swing.JTable();
        btnKeluarKamar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfNomorKamar = new javax.swing.JTextField();
        tfNamaKamar = new javax.swing.JTextField();
        tfHargaKamar = new javax.swing.JTextField();
        tfStatusKamar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cbFilterKamar = new javax.swing.JComboBox();
        btnCariKamar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tfCariKamar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGlass1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/bgFormKamar.png"))); // NOI18N
        panelGlass1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 4, 0));

        btnSimpanKamar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSimpanKamar.setText("SIMPAN");
        jPanel1.add(btnSimpanKamar);

        btnTambahKamar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTambahKamar.setText("TAMBAH");
        jPanel1.add(btnTambahKamar);

        btnEditKamar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditKamar.setText("EDIT");
        jPanel1.add(btnEditKamar);

        btnHapusKamar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHapusKamar.setText("HAPUS");
        jPanel1.add(btnHapusKamar);

        panelGlass1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 360, 40));

        tblKamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblKamar);

        panelGlass1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 690, 330));

        btnKeluarKamar.setBackground(new java.awt.Color(255, 204, 0));
        btnKeluarKamar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnKeluarKamar.setText("Tutup");
        btnKeluarKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarKamarMouseClicked(evt);
            }
        });
        btnKeluarKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarKamarActionPerformed(evt);
            }
        });
        panelGlass1.add(btnKeluarKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 3, 100, 40));

        jPanel2.setLayout(new java.awt.GridLayout(4, 0, 0, 5));

        tfNomorKamar.setText("jTextField1");
        jPanel2.add(tfNomorKamar);

        tfNamaKamar.setText("jTextField2");
        jPanel2.add(tfNamaKamar);

        tfHargaKamar.setText("jTextField3");
        jPanel2.add(tfHargaKamar);

        tfStatusKamar.setText("jTextField4");
        jPanel2.add(tfStatusKamar);

        panelGlass1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 190, 130));

        cbFilterKamar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Berdasarkan", "Harga", "Nama", "Status" }));

        btnCariKamar.setText("CARI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cbFilterKamar, 0, 170, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCariKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cbFilterKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnCariKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelGlass1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 280, 30));

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        tfCariKamar.setText("jTextField5");
        jPanel4.add(tfCariKamar);

        panelGlass1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 230, 30));

        getContentPane().add(panelGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarKamarActionPerformed

    private void btnKeluarKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarKamarMouseClicked
        // TODO add your handling code here:
//         int pilihan = JOptionPane.showConfirmDialog(this,"Apa anda yakin ingin Keluar","Exit",JOptionPane.YES_NO_OPTION);
//        if (pilihan==0) {
//            System.exit(0);
//        }
        dispose();
    }//GEN-LAST:event_btnKeluarKamarMouseClicked

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
            java.util.logging.Logger.getLogger(frm_Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Kamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariKamar;
    private javax.swing.JButton btnEditKamar;
    private javax.swing.JButton btnHapusKamar;
    private javax.swing.JButton btnKeluarKamar;
    private javax.swing.JButton btnSimpanKamar;
    private javax.swing.JButton btnTambahKamar;
    private javax.swing.JComboBox cbFilterKamar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.layout.LayoutStyle layoutStyle1;
    private usu.widget.glass.PanelGlass panelGlass1;
    private javax.swing.JTable tblKamar;
    private javax.swing.JTextField tfCariKamar;
    private javax.swing.JTextField tfHargaKamar;
    private javax.swing.JTextField tfNamaKamar;
    private javax.swing.JTextField tfNomorKamar;
    private javax.swing.JTextField tfStatusKamar;
    // End of variables declaration//GEN-END:variables
}
