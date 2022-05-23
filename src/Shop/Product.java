/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;

/**
 *
 * @author Susanna
 */
public class Product extends Item {
    private String description;
    private final String size;
    
    public Product (String d, String s) {
        this.description = d;
        this.size = s;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setdescription(String d){
         this.description = d;
    }  
    
    public String getSize(){
        return this.size;
    }
    
    @Override
    public String toString(){
        return "\nProduct: " + super.name + "\nPrice: " + super.price 
                + "\nDescription: " + this.description + "Size: " + this.size;
    }
}
