/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restourant;

import administration.Item;

/**
 *
 * @author Mars_DB
 */
public class Dish extends Item{

    private final Course kind;
    
    public Dish(String name, double price, int q, Course k) {
        super(name, price, q);
        this.kind = k;
    }
    
    public Course getKind(){
        return this.kind;
    }
    
}
