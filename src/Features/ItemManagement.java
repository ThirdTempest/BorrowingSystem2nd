
package Features;

import Connection.DBEquipment;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;


public class ItemManagement extends javax.swing.JFrame {
    
    public ItemManagement() {
        initComponents();
        setLocationRelativeTo(null);
        loadTableData(itemManagementTable, "equipment" ) ;
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        itemManagementTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jOptions = new javax.swing.JButton();

        MenuOptions.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Home.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Home_icon.png"))); // NOI18N
        Home.setText("Home");
        Home.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        MenuOptions.add(Home);

        ItemManagement.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        ItemManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/ItemManagement_icon.png"))); // NOI18N
        ItemManagement.setText("Item Management");
        ItemManagement.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ItemManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemManagementActionPerformed(evt);
            }
        });
        MenuOptions.add(ItemManagement);

        BorrowingRecords.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        BorrowingRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/BorrowingRecords_icon.png"))); // NOI18N
        BorrowingRecords.setText("Borrowing Records");
        BorrowingRecords.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrowingRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowingRecordsActionPerformed(evt);
            }
        });
        MenuOptions.add(BorrowingRecords);

        ReportsLogs.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        ReportsLogs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/ReportsLogs_icon.png"))); // NOI18N
        ReportsLogs.setText("Reports and Logs");
        ReportsLogs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReportsLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsLogsActionPerformed(evt);
            }
        });
        MenuOptions.add(ReportsLogs);

        Profile.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Profile_icon.png"))); // NOI18N
        Profile.setText("Profile");
        Profile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });
        MenuOptions.add(Profile);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 428));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemManagementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Equipment ID", "Equipment Type", "Available", "Borrowed", "Total Equipments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemManagementTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 560, 240));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ITEM MANAGEMENT");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jOptions)
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jOptions)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 60));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemManagementActionPerformed

    private void BorrowingRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowingRecordsActionPerformed
        BorrowingRecords record = new BorrowingRecords();
        record.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(ItemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemManagement().setVisible(true);
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
    private javax.swing.JTable itemManagementTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jOptions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
public static void loadTableData(JTable table, String tableName) {
        DefaultTableModel model = new DefaultTableModel();
        table.setModel(model);

        try (Connection con = DBEquipment.getConnection();
        Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName)) {

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Add column names
            Vector<String> columnNames = new Vector<>();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i));
            }
            model.setColumnIdentifiers(columnNames);

            // Add row data
            while (rs.next()) {
                Vector<Object> rowData = new Vector<>();
                for (int i = 1; i <= columnCount; i++) {
                    rowData.add(rs.getObject(i));
                }
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    

