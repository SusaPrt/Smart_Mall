/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restourant;

import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
        
    /*File file = new File("C:\\Users\\39371\\Desktop\\SmartMall\\pr1.txt");
    Scanner sc = new Scanner(file);
 
    while (sc.hasNextLine())
      System.out.println(sc.nextLine());*/
    }
    
    public LinkedList<Dish> getFirsts(){
        LinkedList avaibleFirsts = new LinkedList<Dish>();
        for(Dish d: this.firsts){
            if (d.getQuantity() > 0)
                avaibleFirsts.add(d);
        }        
        return avaibleFirsts;
    }
    
    public LinkedList<Dish> getSeconds(){
        LinkedList avaibleSeconds = new LinkedList<Dish>();
        for(Dish d: this.seconds){
            if (d.getQuantity() > 0)
                avaibleSeconds.add(d);
        }        
        return avaibleSeconds;
    }
    
    public LinkedList<Dish> getDesserts(){
        LinkedList avaibleDesserts = new LinkedList<Dish>();
        for(Dish d: this.desserts){
            if (d.getQuantity() > 0)
                avaibleDesserts.add(d);
        }        
        return avaibleDesserts;
    }
    
    public Dish getDish(LinkedList<Dish> l, Object o){
        Dish w = null;
        if(o instanceof Integer)
            w = l.get(((Integer) o).intValue());
        else{
            for(Dish d: l){
                if(o.toString().equals(d.getName())){
                    w = d;
                    break;
                }
            }            
        }
        return w;    
    }
    
    public void addDish(Dish d){                    //codice identificativo staff che effettua operazioni
        if(d.getKind() == Course.FIRSTS)            //lista operazioni staff come oggetto da implementare
            this.firsts.add(d);
        else if(d.getKind() == Course.SECONDS)
            this.seconds.add(d);
        else if(d.getKind() == Course.DESSERTS)
            this.desserts.add(d);
        else
            this.winesAndSoft.add(d);
    }
    
    public void removeDish(Dish d){
    if(d.getKind() == Course.FIRSTS)
            this.firsts.remove(d);
        else if(d.getKind() == Course.SECONDS)
            this.seconds.remove(d);
        else if(d.getKind() == Course.DESSERTS)
            this.desserts.remove(d);
        else
            this.winesAndSoft.remove(d);   
    }
    
    @Override
    public String toString(){
        String  first = null, 
                second = null, 
                dessert = null, 
                wineAndSoft = null;
        
        for(Dish d: getFirsts()){
            first.concat(d.getName()+" ");
        }
        for(Dish d: getSeconds()){
            second.concat(d.getName()+" ");
        }
        for(Dish d: getDesserts()){
            dessert.concat(d.getName()+" ");
        }
        for(Dish d: winesAndSoft){
            wineAndSoft.concat(d.getName()+" ");
        }
        return "Primi:\n"
                +first+"\nSecondi:\n"
                +second+"\nDessert:\n"
                +dessert+"\nVini e bibite:\n"
                +wineAndSoft;            
    }
    
}
