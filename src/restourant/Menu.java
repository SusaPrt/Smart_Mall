/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restourant;

import java.util.LinkedList;

/**
 *
 * @author Mars_DB
 */
public class Menu {
    private final LinkedList<Dish> firsts;
    private final LinkedList<Dish> seconds;
    private final LinkedList<Dish> desserts;
    private final LinkedList<Dish> winesAndSoft;
    
    public Menu(){
        this.firsts         = new LinkedList();
        this.seconds        = new LinkedList();
        this.desserts       = new LinkedList();
        this.winesAndSoft   = new LinkedList();
    }
    
    public LinkedList getFirsts(){
        LinkedList avaibleFirsts = new LinkedList<Dish>();
        for(Dish d: this.firsts){
            if (d.getQuantity() > 0)
                avaibleFirsts.add(d);
        }        
        return avaibleFirsts;
    }
    
    public LinkedList getSeconds(){
        LinkedList avaibleSeconds = new LinkedList<Dish>();
        for(Dish d: this.seconds){
            if (d.getQuantity() > 0)
                avaibleSeconds.add(d);
        }        
        return avaibleSeconds;
    }
    
    public LinkedList getDesserts(){
        LinkedList avaibleDesserts = new LinkedList<Dish>();
        for(Dish d: this.desserts){
            if (d.getQuantity() > 0)
                avaibleDesserts.add(d);
        }        
        return avaibleDesserts;
    }
    
    public Dish getDish(LinkedList<Dish> l, int n){
        return l.get(n);
    }
    
}
