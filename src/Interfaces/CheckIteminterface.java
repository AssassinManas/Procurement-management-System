
package Interfaces;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class CheckIteminterface extends javax.swing.JInternalFrame {

    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    public CheckIteminterface() {
        initComponents();
        con = DBconnect.connect();
        checktableLoad();
        fillItemCombo();
        orderListedTableLoad();
    }

    public void orderListedTableLoad(){
        String sql = "SELECT o.OrderID,s.Supplier_Name,o.item1,o.item1Quantity,o.item2,o.item2Quantity,o.item3,o.item3Quantity,  \n" +
                "o.item4,o.item4Quantity, o.item5,item5Quantity    \n"  +
                "FROM aproveorder o,tbl_supplierinfo s WHERE s.Supplier_Reference = o.SupplierID";
        try {
            pst = con.prepareStatement(sql);
            rs =pst.executeQuery();
            
           orderItemListedTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    
    public void checktableLoad(){
    String sql = "SELECT * FROM receivedgood_table";
        try {
            pst = con.prepareStatement(sql);
            rs =pst.executeQuery();
            
           checkTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     private void fillItemCombo()
    {
        try 
        {
            String sql = "select * from tbl_iteminfo";
            
            pst = con.prepareStatement(sql);
            rs =pst.executeQuery();
                
            while(rs.next())
            {
                String name = rs.getString("Item_Name") ;
                itemComboBox1.addItem(name);
                returnItemCombo.addItem(name);
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
     
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderItemListedTable = new javax.swing.JTable();
        searchbox1 = new javax.swing.JTextField();
        searchbutton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        checkTable = new javax.swing.JTable();
        searchbox2 = new javax.swing.JTextField();
        searchbutton2 = new javax.swing.JButton();
        stockButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        returnQtyLbl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        supplierCombo = new javax.swing.JComboBox<>();
        returnItemCombo = new javax.swing.JComboBox<>();
        itemComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantityBox = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Check Item");

        orderItemListedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Supplier Name", "Item1", "Item1Qty", "Item2", "Item2Qty", "Item3", "Item3Qty", "Item4", "Item4Qty", "Item5", "Item5Qty"
            }
        ));
        jScrollPane1.setViewportView(orderItemListedTable);

        searchbutton1.setText("Search by Order ID");
        searchbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbutton1ActionPerformed(evt);
            }
        });

        checkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Supplier Name", "Item", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(checkTable);

        searchbutton2.setText("Search by Order ID");
        searchbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbutton2ActionPerformed(evt);
            }
        });

        stockButton.setText("Add to Stock");
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Add to returned");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Returning Item");

        jLabel3.setText("Returning Quantity");

        returnQtyLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                returnQtyLblKeyReleased(evt);
            }
        });

        jButton1.setText("Send an email ");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        supplierCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select the Supplier" }));

        returnItemCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select  Item" }));

        itemComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item" }));

        jLabel5.setText("Item");

        jLabel6.setText("Quantity");

        quantityBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityBoxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(searchbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(searchbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(itemComboBox1, 0, 109, Short.MAX_VALUE)
                                                .addComponent(quantityBox))
                                            .addGap(18, 18, 18)
                                            .addComponent(stockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(supplierCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(119, 119, 119)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                    .addGap(33, 33, 33)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(returnQtyLbl)
                                                        .addComponent(returnItemCombo, 0, 102, Short.MAX_VALUE)))))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(searchbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(searchbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchbutton1))
                    .addComponent(resetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(returnItemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(returnQtyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(stockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(supplierCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchbutton2))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1012, 1012, 1012))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbutton2ActionPerformed
      
           if(searchbox2.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Without Entering a value in saerch bar searching is Impossible");
             }
       else{
       String OrderID =searchbox2.getText();
       
           try {
               String sql = "SELECT * FROM receivedgood_table where Order_ID = '"+OrderID+"' ";
               
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
               
               checkTable.setModel(DbUtils.resultSetToTableModel(rs));
               
               
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
           }
       
           
       
       }
        
    }//GEN-LAST:event_searchbutton2ActionPerformed

    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockButtonActionPerformed
       
         if(itemComboBox1.getSelectedItem().toString()=="Select Item"||quantityBox.getText()=="")
        {
          JOptionPane.showMessageDialog(null,"Inputs are Incomplete");
        }
        
          else{
           try {
               String sql2 = "UPDATE stock_t SET available_qty =available_qty + ? where item_name=? ";
               pst = con.prepareStatement(sql2);
               pst.setString(1,quantityBox.getText());
               pst.setString(2,itemComboBox1.getSelectedItem().toString());
               
               pst.execute();
               
               JOptionPane.showMessageDialog(null, "Added Succesfully");
               itemComboBox1.setSelectedItem("");
               quantityBox.setText("");
               
               
           } catch (SQLException | HeadlessException e) {
               JOptionPane.showMessageDialog(null, e);
           }
       }        
         
    }//GEN-LAST:event_stockButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
       
       checktableLoad();
       orderListedTableLoad();
       searchbox1.setText("");
       searchbox2.setText("");
       itemComboBox1.setSelectedItem("Select Item");
       quantityBox.setText("");
       returnItemCombo.setSelectedItem("Select  Item");
       returnQtyLbl.setText("");
       supplierCombo.setSelectedItem("Select the Supplier");
       
    }//GEN-LAST:event_resetButtonActionPerformed

    private void quantityBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityBoxKeyReleased
        
         if ( !(quantityBox.getText().matches("[0-9]+"))) {
                  JOptionPane.showMessageDialog(null,"Please insert integer value");
                  quantityBox.setText("");
        }
         else{
        double x =Double.parseDouble(quantityBox.getText()); 
            if (x<=0){
                    JOptionPane.showMessageDialog(null, "This field can't be a nagative value");
                    quantityBox.setText("");
            }
         } 
          // if(!Pattern.matches("[0-9]",  quantityBox.getText()) ){
          //     JOptionPane.showMessageDialog(null,"Quantity should be in terms og=f numeric");
          //   }                                       
    }//GEN-LAST:event_quantityBoxKeyReleased

    private void returnQtyLblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_returnQtyLblKeyReleased
         if ( !(returnQtyLbl.getText().matches("[0-9]+"))) {
                  JOptionPane.showMessageDialog(null,"Please insert integer value");
                  returnQtyLbl.setText("");
            }
        
         else{
        double x =Double.parseDouble(returnQtyLbl.getText()); 
            if (x<=0){
                    JOptionPane.showMessageDialog(null, "This field can't be a nagative value");
                    returnQtyLbl.setText("");
            }
         }
                                           
    }//GEN-LAST:event_returnQtyLblKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
          if(returnItemCombo.getSelectedItem().toString()=="Select Item"||returnQtyLbl.getText()=="")
        {
          JOptionPane.showMessageDialog(null,"Inputs are Incomplete");
        }
        
          else{
           try {
               
               
               String sql1 ="SELECT Order_ID,Supplier_Name from receivedgood_table where Item = '"+ returnItemCombo.getSelectedItem().toString()+"' ";
               pst = con.prepareStatement(sql1);
               rs = pst.executeQuery();
               if(rs.next()){
               
               order = rs.getString("Order_ID");
               Supplier = rs.getString("Supplier_Name");
             
            }
               
               
               
               String sql2 = "INSERT INTO `return` Values ( '"+order+"','"+Supplier+"',?,? )";
               
               pst = con.prepareStatement(sql2);
               pst.setString(1,returnItemCombo.getSelectedItem().toString());
               pst.setString(2,returnQtyLbl.getText());
              
               
               pst.execute();
               
               JOptionPane.showMessageDialog(null, "Added Succesfully");
               itemComboBox1.setSelectedItem("");
               quantityBox.setText("");
               
               
           } catch (SQLException | HeadlessException e) {
               JOptionPane.showMessageDialog(null, e);
           }
       }        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbutton1ActionPerformed
        
            if(searchbox1.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Without Entering a value in saerch bar searching is Impossible");
             }
       else{
       String OrderID =searchbox1.getText();
       
           try {
               String sql = "SELECT * FROM approveorder where Order_ID = '"+OrderID+"' ";
               
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
               
               checkTable.setModel(DbUtils.resultSetToTableModel(rs));
               
               
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
           }
       
           
       
       }
        
    }//GEN-LAST:event_searchbutton1ActionPerformed
        
                String order;
                String Supplier;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable checkTable;
    private javax.swing.JComboBox<String> itemComboBox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderItemListedTable;
    private javax.swing.JTextField quantityBox;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox<String> returnItemCombo;
    private javax.swing.JTextField returnQtyLbl;
    private javax.swing.JTextField searchbox1;
    private javax.swing.JTextField searchbox2;
    private javax.swing.JButton searchbutton1;
    private javax.swing.JButton searchbutton2;
    private javax.swing.JButton stockButton;
    private javax.swing.JComboBox<String> supplierCombo;
    // End of variables declaration//GEN-END:variables
}
