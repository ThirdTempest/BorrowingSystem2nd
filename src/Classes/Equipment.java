/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Rane
 */
public class Equipment {
    private int id;
    private String equipmentType;
    private int available;
    private int borrowed;
    private int damaged;

    // Constructor with all fields
    public Equipment(String equipmentType, int id, int available, int borrowed, int damaged) {
        this.id = id;
        this.equipmentType = equipmentType;
        this.available = available;
        this.borrowed = borrowed;
        this.damaged = damaged;
    }
    
    // Default constructor
    public Equipment() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getEquipmentType() {
        return equipmentType;
    }
    
    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }
    
    public int getAvailable() {
        return available;
    }
    
    public void setAvailable(int available) {
        this.available = available;
    }
    
    public int getBorrowed() {
        return borrowed;
    }
    
    public void setBorrowed(int borrowed) {
        this.borrowed = borrowed;
    }
    
    public int getDamaged() {
        return damaged;
    }
    
    public void setDamaged(int damaged) {
        this.damaged = damaged;
    }
    
    // A derived property that calculates the total number of equipments
    public int getTotal() {
        return available + borrowed + damaged;
    }
    
    @Override
    public String toString() {
        return "Equipment{" +
               "id=" + id +
               ", equipmentType='" + equipmentType + '\'' +
               ", available=" + available +
               ", borrowed=" + borrowed +
               ", damaged=" + damaged +
               ", total=" + getTotal() +
               '}';
    }
}
