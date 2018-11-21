
package Interfaces;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class stockInterface extends javax.swing.JInternalFrame {

   Connection con = null;
   PreparedStatement pst;
   ResultSet rs;
    public stockInterface() {
        initComponents();
         con = DBconnect.connect();
         fillItemCombo();
         stocktableLoad();
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
                itemComboBox2.addItem(name);
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
    
    
     public void stocktableLoad(){
    String sql = "SELECT * FROM stock_t";
        try {
            pst = con.prepareStatement(sql);
            rs =pst.executeQuery();
            
           stockTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemComboBox2 = new javax.swing.JComboBox<>();
        quantityBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        SearchBox = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stock Details");

        jLabel2.setText("Item");

        jLabel3.setText("Quantity");

        itemComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item" }));

        quantityBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityBoxKeyReleased(evt);
            }
        });

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Available Quantity"
            }
        ));
        jScrollPane1.setViewportView(stockTable);

        jButton2.setText("Get From Stock");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        SearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBoxActionPerformed(evt);
            }
        });

        SearchButton.setText("Search by Item Name");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(quantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(itemComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(quantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(265, 265, 265))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(itemComboBox2.getSelectedItem().toString()=="Select Item"||quantityBox.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null,"Fill all the fields");
      }
        
          
        else{
        
            String item =itemComboBox2.getSelectedItem().toString();
            String qty= quantityBox.getText();
                
            try {
                
                String sql = "UPDATE stock_t SET available_qty= available_qty -'"+qty +"' WHERE item_name = '"+item+"' ";
               
               pst = con.prepareStatement(sql);
               pst.execute();
               
               JOptionPane.showMessageDialog(null,"Taken succesfully from stock");
               stocktableLoad();
               quantityBox.setText("");
               
                
                
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void quantityBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityBoxKeyReleased
        
        if ( !(quantityBox.getText().matches("[0-9]+"))) {
                  JOptionPane.showMessageDialog(null,"Please insert integer value");
                  quantityBox.setText("");
        }
        
        else{
        
            int q = Integer.parseInt(quantityBox.getText());
                
        try {
            String qry = "SELECT available_qty From stock_t where item_name ='"+itemComboBox2.getSelectedItem().toString()+"'";
            
            pst = con.prepareStatement(qry);
            rs = pst.executeQuery();
            if(rs.next()){
                String availableQty;
                availableQty = rs.getString("available_qty");
                Integer bal = Integer.parseInt(availableQty);
            if (bal<q)
            {  
                JOptionPane.showMessageDialog(null,"No suffiecient quantity in stock" );
                quantityBox.setText("");
            }
            }
        } catch (SQLException | NumberFormatException | HeadlessException e) {
            System.out.println(e);
        }
        
        
      
           double x =Double.parseDouble(quantityBox.getText()); 
            if (x<=0){
                    JOptionPane.showMessageDialog(null, "This field can't be a nagative value");
                    quantityBox.setText("");
            }
            
            
            
        }   
            
    }//GEN-LAST:event_quantityBoxKeyReleased

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBoxActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
       
         if(SearchBox.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Without Entering a value in saerch bar, searching is Impossible");
             }
       else{
       String itemName =SearchBox.getText();
       
           try {
               String sql = "SELECT * FROM stock_t where item_name LIKE '%"+itemName+"%' ";
               
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
               
               stockTable.setModel(DbUtils.resultSetToTableModel(rs));
               
               
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
           }
       
       
       }
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
     stocktableLoad();
     SearchBox.setText("");
     quantityBox.setText("");
     itemComboBox2.setSelectedItem("Select Item");
        
    }//GEN-LAST:event_ResetButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetButton;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox<String> itemComboBox2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantityBox;
    private javax.swing.JTable stockTable;
    // End of variables declaration//GEN-END:variables
}
