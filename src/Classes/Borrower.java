
package Classes;


public class Borrower {
    private int id;
    private String name, contact, address, purpose;
    
    
    public Borrower(String name, String contact, String address, String purpose){
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.purpose = purpose;
    }
    
    public Borrower(){
        
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName (){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getContact(){
        return contact;
    }
    
    public void setContact(String contact){
        this.contact = contact;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getPurpose(){
        return purpose;
    }
    
    public void setPurpose(String purpose){
        this.purpose = purpose;
    }
    
    @Override
public String toString() {
    return "Borrower{" +
           "id=" + id +
           ", name='" + name + '\'' +
           ", contact='" + contact + '\'' +
           ", address='" + address + '\'' +
           ", purpose='" + purpose + '\'' +
           '}';
}
}
