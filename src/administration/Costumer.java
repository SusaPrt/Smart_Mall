/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;


import java.util.LinkedList;
import java.util.Random;
import administration.payment.Payment;

// @author Susanna

public class Costumer extends Person{

    private LinkedList<Payment>     payments;
    private final int               idLocker;
    private double                  credit;
    private final AccountArchive    archive;

    public Costumer(String name, String password, int credit, AccountArchive archive){
        super(name, password);  
        Random r =      new Random();
        this.idLocker = r.nextInt(1000)+101;
        this.credit =   credit;
        this.payments = new LinkedList();
        this.archive =  archive;
    }
    
    public boolean addPayment(Payment payment){                                 //inserimento pagamento
        if(payment.getCost()<= this.credit){
            this.payments.add(payment);
            this.credit-=payment.getCost();
            payment.setPayd();
            System.out.println("Payment successful!");
        }
        return payment.getStatus();
    }
        
    public int getPersonalLocker(){
        return this.idLocker;
    }
    
    
    public double getCredit(){
        return this.credit;
    }
    
    public boolean addCredit(double d){
        boolean c = false;
        this.credit += d;
        return c;
    }
    
    @Override
    public String getName(){
        return super.name;
    }

    @Override
    public String getPassword(){
        return super.password;
    }
    
    @Override
    public String toString(){
        return "\nName: " + super.name + "\nCredit: "
                + this.credit + "€" + "\nId Loacker: " + this.idLocker;                                
    }

}
