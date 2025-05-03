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

    // Constructor with all fields
    public Equipment(String equipmentType, int id, int available, int borrowed) {
        this.id = id;
        this.equipmentType = equipmentType;
        this.available = available;
        this.borrowed = borrowed;
    }
    
    // Default constructor
    public Equipment() {
    }
    
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
    
    // Method to calculate Total Equipments
    public int getTotal() {
        return available + borrowed ;
    }
    
    @Override
    public String toString() {
        return "Equipment{" +
               "id=" + id +
               ", equipmentType='" + equipmentType + '\'' +
               ", available=" + available +
               ", borrowed=" + borrowed +
               ", total=" + getTotal() +
               '}';
    }
}
