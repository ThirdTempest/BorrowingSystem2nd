
package Classes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Connection.DBEquipment;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class BorrowerMain {

    public int addBorrower(Borrower borrower) {
    int generatedId = 0;
    String query = "INSERT INTO Borrowers (name, contact, address, purpose) VALUES (?, ?, ?, ?)";
    try (Connection con = DBEquipment.getConnection();
         PreparedStatement pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
         
        pst.setString(1, borrower.getName());
        pst.setString(2, borrower.getContact());
        pst.setString(3, borrower.getAddress());
        pst.setString(4, borrower.getPurpose());
        
        pst.executeUpdate();
        
        // This retrieves the auto generated keys or the borrower_id
        try (ResultSet rs = pst.getGeneratedKeys()) {
            if (rs.next()) {
                generatedId = rs.getInt(1);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return generatedId;
}
    
    public boolean updateBorrower(int borrowerId, String name, String contact, String address, String purpose) {
    String query = "UPDATE Borrowers SET name = ?, contact = ?, address = ?, purpose = ? WHERE borrower_id = ?";
    try (Connection con = DBEquipment.getConnection();
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setString(1, name);
        pst.setString(2, contact);
        pst.setString(3, address);
        pst.setString(4, purpose);
        pst.setInt(5, borrowerId);

        int affectedRows = pst.executeUpdate();
        return affectedRows > 0;
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
}
    
    // this method is for retrieving my other information in my database using borrower_id as the primary key
    public Borrower getBorrowerById(int borrowerId) {
    Borrower borrower = null;
    String query = "SELECT borrower_id, name, contact, address, purpose FROM Borrowers WHERE borrower_id = ?"; 
    try (Connection con = DBEquipment.getConnection();
         PreparedStatement pst = con.prepareStatement(query)) {
         
        pst.setInt(1, borrowerId);
        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                borrower = new Borrower();
                borrower.setId(rs.getInt("borrower_id"));  
                borrower.setName(rs.getString("name"));      
                borrower.setContact(rs.getString("contact"));
                borrower.setAddress(rs.getString("address"));
                borrower.setPurpose(rs.getString("purpose"));
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return borrower;
}
}
    
