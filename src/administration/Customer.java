/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;


import administration.Archives.AccountArchive;
import administration.payment.Cart;
import java.util.LinkedList;
import java.util.Random;
import administration.payment.Payment;

// @author Mars_DB

public class Customer extends Person{

    private final int               idLocker;
    private double                  credit;
    private final Cart                    cart;

    public Customer(String name, String password, int credit){
        super(name, password);  
        Random r =      new Random();
        this.idLocker = r.nextInt(1000)+101;
        this.credit =   credit;
        this.cart = new Cart(this);
    }
    
    public String payTheCart(){                                 //inserimento pagamento
        String goodBye ="";
        if(this.cart.getTotCost() <= this.credit){
            this.credit-= this.cart.getTotCost();
            goodBye = "Your credit is enough to afford the payment of "
                    +this.cart.getTotCost()+"€.\nThanks to shop here, goodbye!";
        }
        else
            goodBye = "Your credit is not enough to afford the payment of "
                    +this.cart.getTotCost()+"€.\nThanks to shop here, goodbye!";
        return goodBye;
    }
        
    public int getPersonalIdLocker(){
        return this.idLocker;
    }
    
    
    public double getCredit(){
        return this.credit;
    }
    
    public void addCredit(double d){
        this.credit += d;
    }
    
    @Override
    public String getName(){
        return super.name;
    }

    @Override
    public String getPassword(){
        return super.password;
    }
    
    public Cart getCart(){
        return this.cart;
    }
    
    @Override
    public String toString(){
        return "\nName: " + super.name + "\nCredit: "
                + this.credit + "€" + "\nId Loacker: " + this.idLocker;                                
    }

}
