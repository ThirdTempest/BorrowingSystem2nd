/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Connection.DBEquipment;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;



public class BorrowingRecordMain {

    // Method to for displaying only active status on Borrowing Record Table
    public List<BorrowingRecord> getAllActiveRecords() {
    List<BorrowingRecord> records = new ArrayList<>();
    String query = "SELECT br.transaction_id, br.borrower_id, b.name AS borrower_name, br.equipment_type, br.date_borrowed, br.date_return, br.status " +
                   "FROM BorrowingRecords br JOIN Borrowers b ON br.borrower_id = b.borrower_id WHERE br.is_deleted = 0";
    try (Connection con = DBEquipment.getConnection();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) { 

        while (rs.next()) {
            BorrowingRecord record = new BorrowingRecord();
            record.setTransactionId(rs.getInt("transaction_id"));
            record.setBorrowerId(rs.getInt("borrower_id"));
            record.setBorrowerName(rs.getString("borrower_name"));
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
    
     // Method to add a new borrowing record
    public void addBorrowingRecord(int borrowerId, String equipmentType, String dateBorrowed, String dateReturn, String status) {
    String query = "INSERT INTO BorrowingRecords (borrower_id, equipment_type, date_borrowed, date_return, status) VALUES (?, ?, ?, ?, ?)";
    try (Connection conn = DBEquipment.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query)) {
        
        pstmt.setInt(1, borrowerId);
        pstmt.setString(2, equipmentType);
        // Convert dates as needed (assuming "yyyy-MM-dd" format)
        pstmt.setDate(3, java.sql.Date.valueOf(dateBorrowed));
        pstmt.setDate(4, java.sql.Date.valueOf(dateReturn));
        pstmt.setString(5, status);
        
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    public void markAsReturned(int recordId) {
    String query = "UPDATE BorrowingRecords SET status = 'return' WHERE transaction_id = ?";
    try (Connection con = DBEquipment.getConnection();
         PreparedStatement pstmt = con.prepareStatement(query)) {
         
         // Use the provided recordId to update the record's status
         pstmt.setInt(1, recordId);
         pstmt.executeUpdate();
    } catch (SQLException e) {
         e.printStackTrace();
    }
}
    
    //Update changes in the displayInfoPanel for dateReturn
    public boolean updateDateReturn(int recordId, String newDateReturn) {
    String query = "UPDATE BorrowingRecords SET date_return = ? WHERE transaction_id = ?";
    try (Connection conn = DBEquipment.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query)) {
         
        // If newDateReturn is in "yyyy-MM-dd" format:
        pstmt.setDate(1, java.sql.Date.valueOf(newDateReturn));
        pstmt.setInt(2, recordId);
        
        int affectedRows = pstmt.executeUpdate();
        return affectedRows > 0;
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
}
    
    // Method for searching the borrowers name on Borrowing Records
    public List<BorrowingRecord> searchRecordsByBorrowerName(String nameSearch) {
    List<BorrowingRecord> records = new ArrayList<>();
    // The join lets us filter by name but we only select the columns needed for display.
    String query = "SELECT br.transaction_id, br.borrower_id, b.name AS borrower_name, br.equipment_type, br.date_borrowed, br.date_return, br.status " +
                   "FROM BorrowingRecords br " +
                   "JOIN Borrowers b ON br.borrower_id = b.borrower_id " +
                   "WHERE b.name LIKE ?";
    try (Connection conn = DBEquipment.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setString(1, "%" + nameSearch + "%");
        try (ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                BorrowingRecord record = new BorrowingRecord();
                // Populate BorrowingRecord from BorrowingRecords table
                record.setTransactionId(rs.getInt("transaction_id"));
                record.setBorrowerId(rs.getInt("borrower_id"));
                record.setBorrowerName(rs.getString("borrower_name"));
                record.setEquipmentType(rs.getString("equipment_type"));
                record.setDateBorrowed(rs.getDate("date_borrowed"));
                record.setDateReturn(rs.getDate("date_return"));
                record.setStatus(rs.getString("status"));
                records.add(record);
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return records;
}
    
    public boolean softDeleteRecord(int recordId){
        String query = "UPDATE borrowingrecords SET status = 'returned', is_deleted = 1 WHERE transaction_id = ?";
        try (Connection con = DBEquipment.getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)){
            
            pstmt.setInt(1, recordId);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows >0;
        } catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
}
    
    public List<BorrowingRecord> getAllSoftDeletedRecords() {
    List<BorrowingRecord> records = new ArrayList<>();
    String query = "SELECT transaction_id, borrower_id, equipment_type, date_borrowed, date_return, status " +
                   "FROM BorrowingRecords WHERE is_deleted = 1";
    try (Connection con = DBEquipment.getConnection();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        while (rs.next()) {
            BorrowingRecord record = new BorrowingRecord();
            record.setTransactionId(rs.getInt("transaction_id"));
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
