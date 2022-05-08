/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restourant;

/**
 *
 * @author Mars_DB
 */
public class Restourant {

    private final int totSeats;
    private final int totTables;
    private int freeTables;
    private MenuOfTheDay mD;
    private Menu m;
    
    public Restourant(int tables){
        this.totTables      = tables;
        this.freeTables     = tables;
        this.totSeats       = tables*4;
        this.m              = new Menu();
        this.mD             = new MenuOfTheDay(m);

    }
    
    public boolean reserveSeat(int n){
        boolean b;
        if(this.freeTables - n/4 < 0){
            b = false;
        }
        else {
            b = true;
            this.freeTables -= n/4;                
        }                        
        return b;
    }
}
