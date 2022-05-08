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

    private final kind kind;
    private enum kind{FIRST, SECOND, DESSERT, WINEANDSOFT};
    
    public Dish(String name, double price, int q, kind k) {
        super(name, price, q);
        this.kind = k;
    }
    
}
