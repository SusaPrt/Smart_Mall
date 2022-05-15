/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payment;

//@author Mars_DB & Susanna
 
public class Item{
    protected final String name;
    protected final double price;
    protected int quantity;
    
    public Item(String name, double price, int quantity){
        this.name       = name;
        this.price      = price;
        this.quantity   = quantity;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public void decreaseQuantity(){
            this.quantity =- 1;
    }
    public void increaseQuantity(){
        this.quantity =+ 1;
    }
    
    @Override
    public String toString(){
        return "\nItem: "+this.name+"\nPrice: "+this.price+"\n"+"Quantity: "+this.quantity+"\n";
    }
}