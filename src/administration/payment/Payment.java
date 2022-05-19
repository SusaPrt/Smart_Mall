/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration.payment;

import administration.Costumer;

/**
 *
 * @author Mars_DB
 */
public class Payment {
    
    private final int orderPin;
    private final double cost;                                              // costo
    private boolean payd;
    
    public Payment(double cost, int orderPin, Costumer account){                                   // builder                                    
        this.cost = cost;
        this.orderPin = orderPin;
        this.payd = account.addPayment(this);
    }

    public double getCost() {
       return this.cost;
    }
    
    
    @Override
    public String toString(){
        return "\nPayment related to Order n°"+this.orderPin+"\nof "+
                +this.cost+"€"+"\nPayd: "+this.payd;
    }
    
    public boolean getStatus(){
        return this.payd;
    }
    
    public void setPayd(){
        this.payd = true;
    }
    
    
}
