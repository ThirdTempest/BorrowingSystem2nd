package Features;
import Classes.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BorrowingRecords extends javax.swing.JFrame {
    private boolean editingEnabled = false;
    public BorrowingRecords() {
        initComponents();
        setLocationRelativeTo(null);
        loadBorrowingRecords();
        displayInfoPanel.setVisible(false);
        borrowingRecordsTable.removeColumn(borrowingRecordsTable.getColumnModel().getColumn(1));
        borrowingRecordsTable.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener(){
        
        @Override
        public void valueChanged(javax.swing.event.ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = borrowingRecordsTable.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) borrowingRecordsTable.getModel();
                    Object transactionId = model.getValueAt(selectedRow, 0);
                    Object borrowerIdObj = model.getValueAt(selectedRow, 1);
                    Object tableName = model.getValueAt(selectedRow, 2);
                    Object equipmentType = model.getValueAt(selectedRow, 3);
                    Object dateBorrowed = model.getValueAt(selectedRow, 4);
                    Object dateReturn = model.getValueAt(selectedRow, 5);
                    Object status = model.getValueAt(selectedRow, 6);
                    
                    int borrowerId;
                    if (borrowerIdObj == null || borrowerIdObj.toString().trim().isEmpty()) {
                        return;
                    }
                    try {
                        borrowerId = Integer.parseInt(borrowerIdObj.toString());
                    } catch (NumberFormatException ex) {
                        return;
                    }

                    // Look up borrower details from the Borrowers database using the borrower_id
                    BorrowerMain borrowerDAO = new BorrowerMain();
                    Borrower borrower = borrowerDAO.getBorrowerById(borrowerId);
                    
                    if (borrower != null) {
                        nameValue.setText(borrower.getName());
                        contactValue.setText(borrower.getContact());
                        addressValue.setText(borrower.getAddress());
                        purposeValue.setText(borrower.getPurpose());
                    } else {
                        nameValue.setText(String.valueOf(tableName));
                        contactValue.setText("");
                        addressValue.setText("");
                        purposeValue.setText("");
                    }
                    
                    transactionIdValue.setText(String.valueOf(transactionId));
                    borrowerIdValue.setText(String.valueOf(borrowerId));
                    equipmentTypeValue.setText(String.valueOf(equipmentType));
                    dateBorrowedValue.setText(String.valueOf(dateBorrowed));
                    dateReturnValue.setText(String.valueOf(dateReturn));
                    statusValue.setText(String.valueOf(status));

                    // Make the detail information panel visible.
                    displayInfoPanel.setVisible(true);
                }
            }
        }
    });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuOptions = new javax.swing.JPopupMenu();
        Home = new javax.swing.JMenuItem();
        ItemManagement = new javax.swing.JMenuItem();
        BorrowingRecords = new javax.swing.JMenuItem();
        ReportsLogs = new javax.swing.JMenuItem();
        Profile = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jOptions = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        borrowingRecordsTable = new javax.swing.JTable();
        displayInfoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        transactionIdValue = new javax.swing.JTextField();
        borrowerIdValue = new javax.swing.JTextField();
        equipmentTypeValue = new javax.swing.JTextField();
        dateBorrowedValue = new javax.swing.JTextField();
        dateReturnValue = new javax.swing.JTextField();
        statusValue = new javax.swing.JTextField();
        jReturned = new javax.swing.JButton();
        jEdit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nameValue = new javax.swing.JTextField();
        contactValue = new javax.swing.JTextField();
        addressValue = new javax.swing.JTextField();
        purposeValue = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();

        Home.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Home_icon.png"))); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        MenuOptions.add(Home);

        ItemManagement.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        ItemManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/ItemManagement_icon.png"))); // NOI18N
        ItemManagement.setText("Item Management");
        ItemManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemManagementActionPerformed(evt);
            }
        });
        MenuOptions.add(ItemManagement);

        BorrowingRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/BorrowingRecords_icon.png"))); // NOI18N
        BorrowingRecords.setText("Borrowing Records");
        BorrowingRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowingRecordsActionPerformed(evt);
            }
        });
        MenuOptions.add(BorrowingRecords);

        ReportsLogs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/ReportsLogs_icon.png"))); // NOI18N
        ReportsLogs.setText("Reports and Logs");
        ReportsLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsLogsActionPerformed(evt);
            }
        });
        MenuOptions.add(ReportsLogs);

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Profile_icon.png"))); // NOI18N
        Profile.setText("Profile");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });
        MenuOptions.add(Profile);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BORROWING RECORDS");

        jOptions.setBackground(new java.awt.Color(51, 51, 51));
        jOptions.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        jOptions.setForeground(new java.awt.Color(255, 255, 255));
        jOptions.setText("MENU");
        jOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jOptions)
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jOptions)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        borrowingRecordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Borrower ID", "Name", "Equipment Type", "Date Borrowed", "Date Return", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(borrowingRecordsTable);
        if (borrowingRecordsTable.getColumnModel().getColumnCount() > 0) {
            borrowingRecordsTable.getColumnModel().getColumn(0).setResizable(false);
            borrowingRecordsTable.getColumnModel().getColumn(1).setResizable(false);
            borrowingRecordsTable.getColumnModel().getColumn(4).setResizable(false);
            borrowingRecordsTable.getColumnModel().getColumn(5).setResizable(false);
            borrowingRecordsTable.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 720, 320));

        displayInfoPanel.setBackground(new java.awt.Color(204, 204, 204));
        displayInfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel2.setText("Borrower's Information");
        displayInfoPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 51, -1, -1));

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jLabel3.setText("Transaction ID");
        displayInfoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jLabel4.setText("Borrower ID");
        displayInfoPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 298, -1, -1));

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jLabel5.setText("Equipment Type");
        displayInfoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 326, -1, -1));

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jLabel6.setText("Date Borrowed");
        displayInfoPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 354, -1, -1));

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jLabel7.setText("Date Return");
        displayInfoPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 382, -1, -1));

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jLabel8.setText("Status");
        displayInfoPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 410, -1, -1));

        transactionIdValue.setEditable(false);
        transactionIdValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionIdValueActionPerformed(evt);
            }
        });
        displayInfoPanel.add(transactionIdValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 266, 195, -1));

        borrowerIdValue.setEditable(false);
        displayInfoPanel.add(borrowerIdValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 294, 195, -1));

        equipmentTypeValue.setEditable(false);
        displayInfoPanel.add(equipmentTypeValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 322, 195, -1));

        dateBorrowedValue.setEditable(false);
        displayInfoPanel.add(dateBorrowedValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 350, 195, -1));

        dateReturnValue.setEditable(false);
        displayInfoPanel.add(dateReturnValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 378, 195, -1));

        statusValue.setEditable(false);
        displayInfoPanel.add(statusValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 406, 195, -1));

        jReturned.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jReturned.setText("Returned");
        jReturned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturnedActionPerformed(evt);
            }
        });
        displayInfoPanel.add(jReturned, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 501, -1, -1));

        jEdit.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jEdit.setText("Edit");
        jEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditActionPerformed(evt);
            }
        });
        displayInfoPanel.add(jEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 501, -1, -1));

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jLabel10.setText("Name");
        displayInfoPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 158, -1, -1));

        jLabel14.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jLabel14.setText("Contact");
        displayInfoPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 186, -1, -1));

        jLabel15.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jLabel15.setText("Address");
        displayInfoPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 214, -1, -1));

        jLabel16.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jLabel16.setText("Purpose");
        displayInfoPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 242, -1, -1));

        nameValue.setEditable(false);
        displayInfoPanel.add(nameValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 154, 195, -1));

        contactValue.setEditable(false);
        displayInfoPanel.add(contactValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 182, 195, -1));

        addressValue.setEditable(false);
        displayInfoPanel.add(addressValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 210, 195, -1));

        purposeValue.setEditable(false);
        displayInfoPanel.add(purposeValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 238, 195, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/sheet_13824781.png"))); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        displayInfoPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 100, 100));

        getContentPane().add(displayInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 370, 570));

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 260, -1));

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        searchButton.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionsActionPerformed
        MenuOptions.show(jOptions, 0, jOptions.getHeight());
    }//GEN-LAST:event_jOptionsActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void ItemManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemManagementActionPerformed
        ItemManagement item = new ItemManagement();
        item.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItemManagementActionPerformed

    private void BorrowingRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowingRecordsActionPerformed
        
    }//GEN-LAST:event_BorrowingRecordsActionPerformed

    private void ReportsLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsLogsActionPerformed
        ReportsLogs report = new ReportsLogs();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReportsLogsActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        Profile profile = new Profile();
        profile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProfileActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddBorrower add = new AddBorrower();
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jReturnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturnedActionPerformed
        int recordId = Integer.parseInt(transactionIdValue.getText());
        BorrowingRecordMain dao = new BorrowingRecordMain();
        boolean success = dao.softDeleteRecord(recordId);

        if (success) {
            JOptionPane.showMessageDialog(null, "Record marked as returned successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Optionally, refresh your table display here
            loadBorrowingRecords();  // or whatever your method is to reload the table.
        } else {
            JOptionPane.showMessageDialog(null, "Failed to mark record as returned.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_jReturnedActionPerformed

    private void transactionIdValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionIdValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionIdValueActionPerformed

    private void jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditActionPerformed
        if (!editingEnabled) {
        editingEnabled = true;
        jEdit.setText("Save");
        nameValue.setEditable(true);
        contactValue.setEditable(true);
        addressValue.setEditable(true);
        purposeValue.setEditable(true);
        dateReturnValue.setEditable(true);
        nameValue.requestFocus();
    } else {
        // Collects the value and update the database
        String newName = nameValue.getText().trim();
        String newContact = contactValue.getText().trim();
        String newAddress = addressValue.getText().trim();
        String newPurpose = purposeValue.getText().trim();
        String newDateReturn = dateReturnValue.getText().trim();

        if(newName.isEmpty() || newContact.isEmpty() || newAddress.isEmpty() 
               || newPurpose.isEmpty() || newDateReturn.isEmpty()){
            JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int borrowerId;
        int recordId;
        try {
            borrowerId = Integer.parseInt(borrowerIdValue.getText());
            recordId = Integer.parseInt(transactionIdValue.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid ID values.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        BorrowerMain borrowerDAO = new BorrowerMain();
        boolean borrowerUpdated = borrowerDAO.updateBorrower(borrowerId, newName, newContact, newAddress, newPurpose);
        
        BorrowingRecordMain recordDAO = new BorrowingRecordMain();
        boolean recordUpdated = recordDAO.updateDateReturn(recordId, newDateReturn);

        if(borrowerUpdated && recordUpdated) {
            JOptionPane.showMessageDialog(this, "Record updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            displayInfoPanel.setVisible(false);
            loadBorrowingRecords();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update record(s).", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Turn off editing mode for fields
        editingEnabled = false;
        jEdit.setText("Edit");
        nameValue.setEditable(false);
        contactValue.setEditable(false);
        addressValue.setEditable(false);
        purposeValue.setEditable(false);
        dateReturnValue.setEditable(false);
    }
    }//GEN-LAST:event_jEditActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String searchKeyword = searchField.getText().trim();
        if(searchKeyword.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a name to search.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        BorrowingRecordMain recordDAO = new BorrowingRecordMain();
        List<BorrowingRecord> searchResults = recordDAO.searchRecordsByBorrowerName(searchKeyword);

        DefaultTableModel model = (DefaultTableModel) borrowingRecordsTable.getModel();
        model.setRowCount(0); 

        for (BorrowingRecord record : searchResults) {
            model.addRow(new Object[]{
                record.getTransactionId(),
                record.getBorrowerId(),
                record.getBorrowerName(),
                record.getEquipmentType(),
                record.getDateBorrowed(),
                record.getDateReturn(),
                record.getStatus()
            });
        }
        searchField.setText("");
    }//GEN-LAST:event_searchButtonActionPerformed
    
    
    private void loadBorrowingRecords() {
    DefaultTableModel model = (DefaultTableModel) borrowingRecordsTable.getModel();
    model.setRowCount(0);

    BorrowingRecordMain recordDAO = new BorrowingRecordMain();
    List<BorrowingRecord> records = recordDAO.getAllActiveRecords();

    for (BorrowingRecord record : records) {
    model.addRow(new Object[]{
        record.getTransactionId(), 
        record.getBorrowerId(),
        record.getBorrowerName(),   
        record.getEquipmentType(),
        record.getDateBorrowed(),
        record.getDateReturn(),
        record.getStatus()
    });
}
}
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(BorrowingRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowingRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowingRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowingRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowingRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JMenuItem BorrowingRecords;
    protected javax.swing.JMenuItem Home;
    protected javax.swing.JMenuItem ItemManagement;
    private javax.swing.JPopupMenu MenuOptions;
    protected javax.swing.JMenuItem Profile;
    protected javax.swing.JMenuItem ReportsLogs;
    private javax.swing.JTextField addressValue;
    private javax.swing.JTextField borrowerIdValue;
    private javax.swing.JTable borrowingRecordsTable;
    private javax.swing.JTextField contactValue;
    private javax.swing.JTextField dateBorrowedValue;
    private javax.swing.JTextField dateReturnValue;
    private javax.swing.JPanel displayInfoPanel;
    private javax.swing.JTextField equipmentTypeValue;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jOptions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jReturned;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameValue;
    private javax.swing.JTextField purposeValue;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField statusValue;
    private javax.swing.JTextField transactionIdValue;
    // End of variables declaration//GEN-END:variables
}
