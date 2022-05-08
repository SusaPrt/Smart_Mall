/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;


import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Mars_DB
 */
public class Account {
    private String name;                                                        
    private double credit;                                                      
    private LinkedList payments;
    private int personalLocker;
    
    public Account(String name, double credit){                      //builder
        Random r = new Random();
        this.name = name;
        this.credit = credit;
        this.payments = new LinkedList<Payment>();
        this.personalLocker = r.nextInt(1000)+1;
    }
    public Account(){};
    
    public boolean addPayment(Payment payment){                                 //inserimento pagamento
        if(payment.getCost()<= this.credit){
            this.payments.add(payment);
            this.credit-=payment.getCost();
            payment.setPayd();
            System.out.println("Il pagamento è andato a buon fine!");
        }
        return payment.getStatus();
    }
    
    public String getName(){
        return this.name;
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
        return "Nome account: "+this.name+"\nCredito: "
                +this.credit+"€"+"\nArmadetto numero: "+this.personalLocker;                                
    }
}
