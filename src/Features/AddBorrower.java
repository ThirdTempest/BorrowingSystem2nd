
package Features;
import Classes.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class AddBorrower extends javax.swing.JFrame {

    public AddBorrower() {
        initComponents();
        jStatus.setText("Active");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jContact = new javax.swing.JTextField();
        addBorrower = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jAddress = new javax.swing.JTextField();
        jPurpose = new javax.swing.JTextField();
        jDateBorrowed = new javax.swing.JTextField();
        jDateReturn = new javax.swing.JTextField();
        jStatus = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboEquipmentType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 13)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 62, -1, -1));

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 0, 13)); // NOI18N
        jLabel2.setText("Contact Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 90, -1, -1));

        jName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameActionPerformed(evt);
            }
        });
        jPanel1.add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 58, 190, -1));
        jPanel1.add(jContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 86, 190, -1));

        addBorrower.setBackground(new java.awt.Color(153, 153, 153));
        addBorrower.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        addBorrower.setText("Save");
        addBorrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBorrowerActionPerformed(evt);
            }
        });
        jPanel1.add(addBorrower, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 375, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 375, -1, -1));

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 0, 13)); // NOI18N
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 118, -1, -1));

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 0, 13)); // NOI18N
        jLabel4.setText("Purpose");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 146, -1, -1));

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 0, 13)); // NOI18N
        jLabel5.setText("Equipment Type");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 0, 13)); // NOI18N
        jLabel6.setText("Date Borrowed");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 198, -1, -1));

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 0, 13)); // NOI18N
        jLabel7.setText("Date Return");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 226, -1, -1));

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 0, 13)); // NOI18N
        jLabel8.setText("Status");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 254, -1, -1));
        jPanel1.add(jAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 114, 190, -1));
        jPanel1.add(jPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 142, 190, -1));

        jDateBorrowed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateBorrowedMouseClicked(evt);
            }
        });
        jDateBorrowed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDateBorrowedActionPerformed(evt);
            }
        });
        jPanel1.add(jDateBorrowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 198, 190, -1));

        jDateReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateReturnMouseClicked(evt);
            }
        });
        jPanel1.add(jDateReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 226, 190, -1));

        jStatus.setEditable(false);
        jPanel1.add(jStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 254, 190, -1));

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 15)); // NOI18N
        jLabel9.setText("ADD BORROWER");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 23, -1, -1));

        comboEquipmentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Chairs", "Tables", "Tents"}));
        jPanel1.add(comboEquipmentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBorrowerActionPerformed
        String name = jName.getText().trim();
        String contact = jContact.getText().trim();
        String address = jAddress.getText().trim();
        String purpose = jPurpose.getText().trim();
        String equipment = (String) comboEquipmentType.getSelectedItem();
        String dateb = jDateBorrowed.getText().trim();
        String dater = jDateReturn.getText().trim();
        String status = jStatus.getText().trim();
        
        if (name.isEmpty() || contact.isEmpty() || address.isEmpty() || purpose.isEmpty() || equipment.isEmpty() || dateb.isEmpty() || dater.isEmpty() || status.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill out all fields!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if(!name.matches("^[A-Za-z ]+$") || !contact.matches("^09\\d{9}$") || !purpose.matches("^[A-Za-z ]+$")){
            JOptionPane.showMessageDialog(this, "Invalid Format", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
        Borrower borrower = new Borrower(name, contact, address, purpose);
        BorrowerMain borrowerDAO = new BorrowerMain(); // save the borrower to database
        int newBorrowerId = borrowerDAO.addBorrower(borrower);
        
        BorrowingRecordMain record = new BorrowingRecordMain();
        record.addBorrowingRecord(newBorrowerId, equipment, dateb, dater, status);
        
        jName.setText("");
        jContact.setText("");
        jAddress.setText("");
        jPurpose.setText("");
        comboEquipmentType.setSelectedIndex(0);
        jDateBorrowed.setText("");
        jDateReturn.setText("");
        jStatus.setText("");
        
        JOptionPane.showMessageDialog(this, "Borrower Added", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            e.printStackTrace();
        } 
    }//GEN-LAST:event_addBorrowerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BorrowingRecords back = new BorrowingRecords();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameActionPerformed

    private void jDateBorrowedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDateBorrowedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateBorrowedActionPerformed

    private void jDateBorrowedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateBorrowedMouseClicked
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Set the date automatically
        jDateBorrowed.setText(currentDate.format(formatter));
    }//GEN-LAST:event_jDateBorrowedMouseClicked

    private void jDateReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateReturnMouseClicked
        LocalDate currentDate = LocalDate.now();
        LocalDate returnDate = currentDate.plusDays(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        jDateReturn.setText(returnDate.format(formatter));
    }//GEN-LAST:event_jDateReturnMouseClicked

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
            java.util.logging.Logger.getLogger(AddBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBorrower().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBorrower;
    private javax.swing.JComboBox<String> comboEquipmentType;
    private javax.swing.JTextField jAddress;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jContact;
    private javax.swing.JTextField jDateBorrowed;
    private javax.swing.JTextField jDateReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPurpose;
    private javax.swing.JTextField jStatus;
    // End of variables declaration//GEN-END:variables
}
