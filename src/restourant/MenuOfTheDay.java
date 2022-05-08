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
    
    public MenuOfTheDay(){
        this.lunch      = new LinkedList<Dish>();
        this.dinner     = new LinkedList<Dish>();
        Calendar c      = Calendar.getInstance();
        this.date       = c.getTime();
        makeDayOffer();        
    }
    
    private void makeDayOffer(){
        Menu m = new Menu();
        Random r = new Random();

        this.lunch.add(m.getDish(m.getFirsts(), r.nextInt(m.getFirsts().size())));
        this.lunch.add(m.getDish(m.getSeconds(), r.nextInt(m.getSeconds().size())));
        this.lunch.add(m.getDish(m.getDesserts(), r.nextInt(m.getDesserts().size())));
        
        this.dinner.add(m.getDish(m.getFirsts(), r.nextInt(m.getFirsts().size())));
        this.dinner.add(m.getDish(m.getSeconds(), r.nextInt(m.getSeconds().size())));
        this.dinner.add(m.getDish(m.getDesserts(), r.nextInt(m.getDesserts().size())));                
    }    
}
