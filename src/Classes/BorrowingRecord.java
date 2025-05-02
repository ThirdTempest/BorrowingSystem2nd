
package Classes;
import java.sql.Date;

public class BorrowingRecord {
    private int transaction_id, borrower_id;
    private String equipmentType, status, borrowerName;
    private Date dateBorrowed, dateReturn;
    
    
    public BorrowingRecord(int transaction_id, int borrower_id, String equipmentType, Date dateBorrowed, Date dateReturn, String status, String borrowerName){
        this.transaction_id = transaction_id;
        this.borrower_id = borrower_id;
        this.equipmentType = equipmentType;
        this.dateBorrowed = dateBorrowed;
        this.dateReturn = dateReturn;
        this.status = status;
        this.borrowerName = borrowerName;
    }
    
    public BorrowingRecord(){
        
    }
    
    public int getTransactionId(){
        return transaction_id;
    }
    
    public void setTransactionId(int transaction_id){
        this.transaction_id = transaction_id;
    }
    
    public int getBorrowerId(){
        return borrower_id;
    }
    
    public void setBorrowerId(int borrower_id){
        this.borrower_id = borrower_id;
    }
    
    public String getEquipmentType(){
        return equipmentType;
    }
    
    public void setEquipmentType(String equipmentType){
        this.equipmentType = equipmentType;
    }
    
    public Date getDateBorrowed(){
        return dateBorrowed;
    }
    
    public void setDateBorrowed(Date dateBorrowed){
        this.dateBorrowed = dateBorrowed;
    }
    
    public Date getDateReturn(){
        return dateReturn;
    }
    
    public void setDateReturn(Date dateReturn){
        this.dateReturn = dateReturn;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    public String getBorrowerName(){
        return borrowerName;
    }
    
    public void setBorrowerName(String borrowerName){
        this.borrowerName = borrowerName;
    }
    
    @Override
    public String toString() {
        return "BorrowingRecord{" +
               "transaction_id=" + transaction_id +
               ", borrower_id=" + borrower_id +
               ", equipmentType='" + equipmentType + '\'' +
               ", dateBorrowed=" + dateBorrowed +
               ", dateReturn=" + dateReturn +
               ", status='" + status + 
                ", borrowerName='" + borrowerName +'\'' +
               '}';
    }
}
