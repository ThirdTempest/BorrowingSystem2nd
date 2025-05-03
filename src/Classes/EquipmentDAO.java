
package Classes;
import java.sql.Connection;
import Connection.DBEquipment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EquipmentDAO {
    
    public static Equipment getEquipmentByType(String type) {
        Equipment equipment = null;
        String query = "SELECT available, borrowed, (available + borrowed ) AS total " +
                "FROM Equipment WHERE equipment_type = ?";
        try (Connection con = DBEquipment.getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {
             
            pstmt.setString(1, type);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                equipment = new Equipment(
                        type,
                        rs.getInt("available"),
                        rs.getInt("borrowed"),
                        rs.getInt("total")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return equipment;
    }

    
}
