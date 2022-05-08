/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restourant;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Mars_DB
 */
public class MenuOfTheDay {
    private final LinkedList lunch;
    private final LinkedList dinner;
    private final Date date;
    private final Menu menu;
    
    public MenuOfTheDay(Menu m){
        this.lunch      = new LinkedList<Dish>();
        this.dinner     = new LinkedList<Dish>();
        Calendar c      = Calendar.getInstance();
        this.date       = c.getTime();
        this.menu = null;       
    }
    
    private void makeDayOffer(){
 
        Random r = new Random();

        this.lunch.add(menu.getDish(menu.getFirsts(), r.nextInt(menu.getFirsts().size())));
        this.lunch.add(menu.getDish(menu.getSeconds(), r.nextInt(menu.getSeconds().size())));
        this.lunch.add(menu.getDish(menu.getDesserts(), r.nextInt(menu.getDesserts().size())));
        
        this.dinner.add(menu.getDish(menu.getFirsts(), r.nextInt(menu.getFirsts().size())));
        this.dinner.add(menu.getDish(menu.getSeconds(), r.nextInt(menu.getSeconds().size())));
        this.dinner.add(menu.getDish(menu.getDesserts(), r.nextInt(menu.getDesserts().size())));                
    }    
    
    @Override
    public String toString(){
        return "Menu del giorno:\n"
                +"Pranzo:\n"
                +"primo:   "+lunch.get(0).toString()
                +"secondo: "+lunch.get(1).toString()
                +"dessert: "+lunch.get(2).toString()+"\n"
                +"Cena:\n"
                +"primo:   "+dinner.get(0).toString()
                +"secondo: "+dinner.get(1).toString()
                +"dessert: "+dinner.get(2).toString()+"\n";
    }
}
