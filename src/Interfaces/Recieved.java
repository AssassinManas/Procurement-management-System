package Interfaces;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Recieved extends javax.swing.JInternalFrame {

   Connection con = null;
   PreparedStatement pst;
   ResultSet rs;
   
    public Recieved() {
        initComponents();
        con = DBconnect.connect();
        fillItemCombo();
        fillOrderCombo();
        supplierCombo();
        Receipt_tableLoad();
        receivedGood_tableLoad();
        
    }
    
    
    public void Receipt_tableLoad()
    {
       String sql = "SELECT * FROM receipt_table";
            try {
            pst = con.prepareStatement(sql);
            rs =pst.executeQuery();
            
            Receipt_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void receivedGood_tableLoad(){
    String sql = "SELECT * FROM receivedgood_table";
        try {
            pst = con.prepareStatement(sql);
            rs =pst.executeQuery();
            
           receivedGood_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void reset01(){
    orderItemCombo.setSelectedItem("Select Order Reference");
    supplierCombo1.setSelectedItem("Select Supplier Name");
    ReceiptIdLabel.setText("");
    SearchBox.setText("");
    
    }
    
    
    public void reset02(){
    itemComboBox1.setSelectedItem("Select an Item");
    quantityBox.setText("");
    orderLabel.setText("");
    
    }
    
    
    public String currentDate(){
    Calendar cal = new GregorianCalendar();
    int year =cal.get(Calendar.YEAR);
    int month =cal.get(Calendar.MONTH);
    int day =cal.get(Calendar.DAY_OF_MONTH);
    String date = year+"/"+(month+1)+"/"+day;
    return date;
    
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
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
    
     private void fillOrderCombo()
    {
        try 
        {
            String sql = "select * from aproveorder";
            
            pst = con.prepareStatement(sql);
            rs =pst.executeQuery();
                
            while(rs.next())
            {
                String name = rs.getString("OrderId") ;
                orderItemCombo.addItem(name);
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
     
      private void supplierCombo()
    {
        try 
        {
            String sql = "select * from  tbl_supplierinfo";
            
            pst = con.prepareStatement(sql);
            rs =pst.executeQuery();
                
            while(rs.next())
            {
                String name = rs.getString("Supplier_Name") ;
                supplierCombo1.addItem(name);
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        placeOrderButton = new javax.swing.JButton();
        quantityBox = new javax.swing.JTextField();
        resetbutton1 = new javax.swing.JButton();
        addButton1 = new javax.swing.JButton();
        qtylbl = new javax.swing.JLabel();
        itemlbl = new javax.swing.JLabel();
        orderItemCombo = new javax.swing.JComboBox<>();
        itemComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        receivedGood_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Receipt_table = new javax.swing.JTable();
        supplierCombo1 = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        SearchBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ReceiptIdLabel = new javax.swing.JLabel();
        DeleteButton1 = new javax.swing.JButton();
        receipt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        orderLabel = new javax.swing.JLabel();
        updateButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recieved Orders");

        jLabel3.setText("Supplier Name");

        jLabel2.setText("Order ID");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        quantityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityBoxActionPerformed(evt);
            }
        });
        quantityBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityBoxKeyReleased(evt);
            }
        });

        resetbutton1.setText("Reset");
        resetbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbutton1ActionPerformed(evt);
            }
        });

        addButton1.setText("Add");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        qtylbl.setText("Quantity");

        itemlbl.setText("Item");

        orderItemCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Order Reference" }));

        itemComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Item" }));

        receivedGood_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Order ID", "Item", "Quantity"
            }
        ));
        receivedGood_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receivedGood_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(receivedGood_table);

        Receipt_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Receipt ID", "Order ID", "Supplier Name", "Date"
            }
        ));
        Receipt_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Receipt_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Receipt_table);

        supplierCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Supplier Name" }));

        searchButton.setText("Search by Order ID");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete selected Row");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        SearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Receipt ID");

        DeleteButton1.setText("Delete selected Row");
        DeleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButton1ActionPerformed(evt);
            }
        });

        receipt.setText("Order ID");

        updateButton1.setText("Update");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(itemlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(receipt)
                                .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(itemComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(orderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(167, 167, 167))
                                        .addComponent(quantityBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(resetbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(supplierCombo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(orderItemCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ReceiptIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReceiptIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchButton)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderItemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(supplierCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(receipt)
                                    .addComponent(jLabel9))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(itemComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(qtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resetbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteButton1)
                                .addGap(40, 40, 40))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
          reset01();
          Receipt_tableLoad();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
      if(orderItemCombo.getSelectedItem().toString()=="Select Order Reference"||supplierCombo1.getSelectedItem().toString()=="Select Supplier Name")
      {
          JOptionPane.showMessageDialog(null,"Select Items from the lists");
      }
      
       else{
           try {
               String sql2 = "INSERT INTO Receipt_table(Order_ID,Supplier_name,date_is) values (?,?,?) ";
               pst = con.prepareStatement(sql2);
               pst.setString(1,orderItemCombo.getSelectedItem().toString());
               pst.setString(2,supplierCombo1.getSelectedItem().toString());
               pst.setString(3,currentDate());
               
               
               pst.execute();
               
               Receipt_tableLoad();
               JOptionPane.showMessageDialog(null, "Placed Succesfully");
               
               
           } catch (SQLException | HeadlessException e) {
               JOptionPane.showMessageDialog(null, e);
           }
       }        
    }//GEN-LAST:event_placeOrderButtonActionPerformed

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
    }//GEN-LAST:event_quantityBoxKeyReleased
    }
    private void resetbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbutton1ActionPerformed
       reset02();
       receivedGood_tableLoad();
    }//GEN-LAST:event_resetbutton1ActionPerformed

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
       
        if(itemComboBox1.getSelectedItem().toString()=="Select an Item"||quantityBox.getText()=="")
        {
          JOptionPane.showMessageDialog(null,"Inputs are Incomplete");
        }
      
        if(orderItemCombo.getSelectedItem().toString()=="Select Order Reference"||supplierCombo1.getSelectedItem().toString()=="Select Supplier Name"){
            
            JOptionPane.showMessageDialog(null,"Select Order ID and Supplier Name");
        }
   
        
       else{
           try {
               String sql2 = "INSERT INTO receivedGood_table(Order_ID,Supplier_name,Item,Quantity) values (?,?,?,?) ";
               pst = con.prepareStatement(sql2);
               pst.setString(1,orderItemCombo.getSelectedItem().toString());
               pst.setString(2,supplierCombo1.getSelectedItem().toString());
               pst.setString(3,itemComboBox1.getSelectedItem().toString());
               pst.setString(4,quantityBox.getText());
               
               
               pst.execute();
               
               
              
               receivedGood_tableLoad();
               JOptionPane.showMessageDialog(null, "Added Succesfully");
               
               reset02();
               
               
           } catch (SQLException | HeadlessException e) {
               JOptionPane.showMessageDialog(null, e);
           }
       }        
        
        
        
    }//GEN-LAST:event_addButton1ActionPerformed

    private void Receipt_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Receipt_tableMouseClicked
        int r = Receipt_table.getSelectedRow();
        String receiptID = Receipt_table.getValueAt(r, 0).toString();
        String OrderID = Receipt_table.getValueAt(r, 1).toString();
        String SupplierName = Receipt_table.getValueAt(r, 2).toString();
        
        ReceiptIdLabel.setText(receiptID);
        orderItemCombo.setSelectedItem(OrderID);
        supplierCombo1.setSelectedItem(SupplierName);
        
    }//GEN-LAST:event_Receipt_tableMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
       if(SearchBox.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Without Entering a value in saerch bar searching is Impossible");
             }
       else{
       String OrderID =SearchBox.getText();
       
           try {
               String sql = "SELECT * FROM Receipt_table where Order_ID = '"+OrderID+"' ";
               
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
               
               Receipt_table.setModel(DbUtils.resultSetToTableModel(rs));
               
               
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
           }
       
       
       }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        if(ReceiptIdLabel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "You have to select a value to be Deleted");
        }
        
        else{
        int x =JOptionPane.showConfirmDialog(null,"Do you really want to delete?");
        if(x==0){
            String receiptID = ReceiptIdLabel.getText();
            
            String sql ="DELETE from Receipt_table where Receipt_ID = '"+receiptID+"'";
            
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
            
                Receipt_tableLoad();
                reset01();
                JOptionPane.showMessageDialog(null,"deleted successfully");
                
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
        }
          
            
        }
        
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(ReceiptIdLabel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "You have to select a value to be updated");
            
        }
        
         if(orderItemCombo.getSelectedItem().toString()=="Select Order Reference"||supplierCombo1.getSelectedItem().toString()=="Select Supplier Name")
      {
          JOptionPane.showMessageDialog(null,"Select Items from the lists");
      }
        
        else{
        int x =JOptionPane.showConfirmDialog(null,"Do you really want to Update?");
        if (x==0){
            String OrderID =orderItemCombo.getSelectedItem().toString();
            String SupplierName =supplierCombo1.getSelectedItem().toString();
            String receiptID = ReceiptIdLabel.getText();
            
            String sql ="UPDATE receipt_table SET Order_ID ='"+ OrderID+"',Supplier_name ='"+ SupplierName+"' WHERE Receipt_ID='"+receiptID+"' ";
            
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
            
                Receipt_tableLoad();
                JOptionPane.showMessageDialog(null,"Updated successfully");
                
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
        }
        }   
    }//GEN-LAST:event_updateButtonActionPerformed
    }
    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxActionPerformed
        
    }//GEN-LAST:event_SearchBoxActionPerformed

    private void DeleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButton1ActionPerformed
       
         if(orderLabel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "You have to select a value to be Deleted");
        }
        
        else{
        int x =JOptionPane.showConfirmDialog(null,"Do you really want to delete?");
        if(x==0){
            String orderID = orderLabel.getText();
            String item = itemComboBox1.getSelectedItem().toString();
            
            String sql ="DELETE from receivedgood_table where Order_ID = '"+orderID+"' AND Item = '"+item +"' ";
            
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
            
                receivedGood_tableLoad();
                reset01();
                JOptionPane.showMessageDialog(null,"deleted successfully");
                
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
        }
          
            
        }
        
        }
        
    }//GEN-LAST:event_DeleteButton1ActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
       
        if(orderLabel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "You have to select a value to be updated");
            
        }
        
         if(itemComboBox1.getSelectedItem().toString()=="Select an Item"||quantityBox.getText()=="")
        {
          JOptionPane.showMessageDialog(null,"Inputs are Incomplete");
        }
         
        else{
        int x =JOptionPane.showConfirmDialog(null,"Do you really want to Update?");
        if (x==0){
            String item =itemComboBox1.getSelectedItem().toString();
            String qty =quantityBox.getText();
            String orderID = orderLabel.getText();
            
            String sql ="UPDATE receivedgood_table SET Item ='"+ item+"',Quantity ='"+ qty+"' WHERE ROrder_ID='"+orderID+"' ";
            
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
            
                receivedGood_tableLoad();
                JOptionPane.showMessageDialog(null,"Updated successfully");
                
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
        }
        }   
    }                       
        
    }//GEN-LAST:event_updateButton1ActionPerformed

    private void receivedGood_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receivedGood_tableMouseClicked
       
        int r = receivedGood_table.getSelectedRow();
        String orderID = receivedGood_table.getValueAt(r, 0).toString();
        String item = receivedGood_table.getValueAt(r, 2).toString();
        String qty = receivedGood_table.getValueAt(r, 3).toString();
        
        orderLabel.setText(orderID);
        itemComboBox1.setSelectedItem(item);
        quantityBox.setText(qty);
        
    }//GEN-LAST:event_receivedGood_tableMouseClicked

    private void quantityBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton DeleteButton1;
    private javax.swing.JLabel ReceiptIdLabel;
    private javax.swing.JTable Receipt_table;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JButton addButton1;
    private javax.swing.JComboBox<String> itemComboBox1;
    private javax.swing.JLabel itemlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> orderItemCombo;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JLabel qtylbl;
    private javax.swing.JTextField quantityBox;
    private javax.swing.JLabel receipt;
    private javax.swing.JTable receivedGood_table;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton resetbutton1;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> supplierCombo1;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables
}
