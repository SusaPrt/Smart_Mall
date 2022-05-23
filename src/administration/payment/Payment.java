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
    
    private final Cart cart;
    private final double cost;                                              
    private boolean overBudget;
    
    public Payment(Cart cart){                                                                   
        this.cart = cart;
        this.overBudget = checkStatus();
        this.cost = finallBill();
    }

    public double getCost() {
       return this.cost;
    }
    
    
    @Override
    public String toString(){
        return "\nPayment related to the kind Costumer: "+this.cart.getCostumer().getName()+"\nof "+
                +this.cost+"€"+"\nDiscount: "+!this.overBudget;
    }
    
    public boolean getStatus(){
        return this.overBudget;
    }
    
    private boolean checkStatus(){
        boolean b = false;
        if(this.cart.getTotCost() > this.cart.getCostumer().getCredit())
            b = true;
        return b;
    }
    
    private double finallBill(){
        double d = 0.0;
        if(this.overBudget)
            d = this.cart.getTotCost();
        else
            d = this.cart.getTotCost()-(this.cart.getTotCost()*0.1);
        return d;
    }
}
