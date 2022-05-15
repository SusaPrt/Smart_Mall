/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restourant;

import payment.Item;

/**
 *
 * @author Mars_DB
 */
public class Dish extends Item{

    private final String course;
    
    public Dish(String name, double price, int q, String course) {
        super(name, price, q);
        this.course = course;
    }
    
    public String getCourse(){
        return this.course;
    }
    
    @Override
    public String toString(){
        return "\nPietanza: "+this.name+"\nPortata: "
                +this.course+"\nPrezzo: "+this.price
                +"\nQuantità: "+this.quantity;
    }
}
