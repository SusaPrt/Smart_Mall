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
    private MenuOfTheDay mD;
    private final int totSeats;
    private final int totTables;
    private int freeTables;
    
    public Restourant(){
        this.totSeats       = 200;
        this.totTables      = 50;
        this.freeTables     = 50;
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
