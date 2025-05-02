/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Connection.DBEquipment;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportsLogsDAO {
    
    public List<BorrowingRecord> getAllSoftDeletedRecords() {
    List<BorrowingRecord> records = new ArrayList<>();
    String query = "SELECT id, borrower_id, equipment_type, date_borrowed, date_return, status " +
                   "FROM BorrowingRecords WHERE is_deleted = 1";
    try (Connection con = DBEquipment.getConnection();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        while (rs.next()) {
            BorrowingRecord record = new BorrowingRecord();
            record.setTransactionId(rs.getInt("id"));
            record.setBorrowerId(rs.getInt("borrower_id"));
            record.setEquipmentType(rs.getString("equipment_type"));
            record.setDateBorrowed(rs.getDate("date_borrowed"));
            record.setDateReturn(rs.getDate("date_return"));
            record.setStatus(rs.getString("status"));
            records.add(record);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return records;
}
}
