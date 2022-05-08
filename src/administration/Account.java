/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;


import java.util.LinkedList;
import java.util.Random;
import payment.Payment;

// @author Mars_DB

public class Account {
    private final String name;  
    private String password;
    private int personalLocker;    
    private double credit;                                                      
    private LinkedList payments;

    
    public Account(String name, String password, double credit){                      //builder
        Random r = new Random();
        this.name = name;
        this.password = password;
        this.personalLocker = r.nextInt(1000)+1;
        this.credit = credit;
        this.payments = new LinkedList<Payment>();
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
    
    public String getName(){
        return this.name;
    }
    
    public void setPassword(String p){
        this.password = p;
    }
    public String getPassword(){
        return this.password;
    }
    
    public void setPersonalLocker(int n){
        this.personalLocker = n;
    }
    public int getPersonalLocker(){
        return this.personalLocker;
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
    public String toString(){
        return "\nName: " + this.name + "\nCredit: "
                + this.credit + "€" + "\nLoacker n.: " + this.personalLocker;                                
    }
}
