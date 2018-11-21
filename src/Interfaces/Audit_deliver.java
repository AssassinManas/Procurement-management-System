package Interfaces;

public class Audit_deliver extends javax.swing.JFrame {

   
    public Audit_deliver() {
        initComponents();
        
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        OrderInterfaceButton = new javax.swing.JButton();
        RecievedGoodInteraceButton = new javax.swing.JButton();
        StockInterfaceButton = new javax.swing.JButton();
        SendBackGoodsButton = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        ClearScreenButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        SendBackGoodsButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delivery Audit Management");

        OrderInterfaceButton.setBackground(new java.awt.Color(102, 102, 102));
        OrderInterfaceButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OrderInterfaceButton.setText("Payment");
        OrderInterfaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderInterfaceButtonActionPerformed(evt);
            }
        });

        RecievedGoodInteraceButton.setBackground(new java.awt.Color(102, 102, 102));
        RecievedGoodInteraceButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RecievedGoodInteraceButton.setText("Received Goods");
        RecievedGoodInteraceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecievedGoodInteraceButtonActionPerformed(evt);
            }
        });

        StockInterfaceButton.setBackground(new java.awt.Color(102, 102, 102));
        StockInterfaceButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        StockInterfaceButton.setText("Stock ");
        StockInterfaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockInterfaceButtonActionPerformed(evt);
            }
        });

        SendBackGoodsButton.setBackground(new java.awt.Color(102, 102, 102));
        SendBackGoodsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SendBackGoodsButton.setText("Send Back Goods");
        SendBackGoodsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBackGoodsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ClearScreenButton.setText("Clear Screen");
        ClearScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearScreenButtonActionPerformed(evt);
            }
        });

        LogoutButton.setText("Log Out");

        SendBackGoodsButton1.setBackground(new java.awt.Color(102, 102, 102));
        SendBackGoodsButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SendBackGoodsButton1.setText("Check Items");
        SendBackGoodsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBackGoodsButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(StockInterfaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OrderInterfaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SendBackGoodsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                        .addComponent(SendBackGoodsButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                    .addComponent(RecievedGoodInteraceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(ClearScreenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDesktopPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearScreenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RecievedGoodInteraceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrderInterfaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SendBackGoodsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StockInterfaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SendBackGoodsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 132, Short.MAX_VALUE))
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RecievedGoodInteraceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecievedGoodInteraceButtonActionPerformed
        jDesktopPane1.removeAll();
        Recieved re = new Recieved();
        jDesktopPane1.add(re).setVisible(true);
    }//GEN-LAST:event_RecievedGoodInteraceButtonActionPerformed

    private void OrderInterfaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderInterfaceButtonActionPerformed
       jDesktopPane1.removeAll();
       PaymentInterface oi = new PaymentInterface();
       jDesktopPane1.add(oi).setVisible(true);
    }//GEN-LAST:event_OrderInterfaceButtonActionPerformed

    private void StockInterfaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockInterfaceButtonActionPerformed
       jDesktopPane1.removeAll();
       stockInterface si = new stockInterface();
       jDesktopPane1.add(si).setVisible(true);
    }//GEN-LAST:event_StockInterfaceButtonActionPerformed

    private void SendBackGoodsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBackGoodsButtonActionPerformed
        jDesktopPane1.removeAll();
       sendBackInterface sbi = new sendBackInterface();
       jDesktopPane1.add(sbi).setVisible(true);
    }//GEN-LAST:event_SendBackGoodsButtonActionPerformed

    private void ClearScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearScreenButtonActionPerformed
       jDesktopPane1.removeAll();
       jDesktopPane1.repaint();
    }//GEN-LAST:event_ClearScreenButtonActionPerformed

    private void SendBackGoodsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBackGoodsButton1ActionPerformed
       jDesktopPane1.removeAll();
       CheckIteminterface cii = new CheckIteminterface ();
       jDesktopPane1.add(cii).setVisible(true);
    }//GEN-LAST:event_SendBackGoodsButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Audit_deliver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Audit_deliver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Audit_deliver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Audit_deliver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Audit_deliver().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearScreenButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OrderInterfaceButton;
    private javax.swing.JButton RecievedGoodInteraceButton;
    private javax.swing.JButton SendBackGoodsButton;
    private javax.swing.JButton SendBackGoodsButton1;
    private javax.swing.JButton StockInterfaceButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
