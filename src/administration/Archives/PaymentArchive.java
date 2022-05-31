/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration.Archives;

import administration.Customer;
import administration.payment.Payment;
import java.util.LinkedList;

/**
 *
 * @author Mars_DB
 */
public class PaymentArchive {
    private LinkedList<Payment> fullPaydPayments;
    private LinkedList<Payment> paymentsToPay;
    private LinkedList<Payment> totalPayments;
    
    public PaymentArchive(){
        this.fullPaydPayments = new LinkedList();
        this.paymentsToPay = new LinkedList();
        this.totalPayments = new LinkedList();
    }
    
    public void addFullPaydPayments(Payment p){
        this.paymentsToPay.remove(p);
        this.fullPaydPayments.add(p);
    }
    
    public void addPaymentsToPay(Payment p){
        this.paymentsToPay.add(p);
        this.totalPayments.add(p);
    }
    
    public LinkedList<Payment> getAccountPayments(Customer c){
        LinkedList<Payment> l = new LinkedList();
        this.totalPayments.stream().filter(p -> (p.getCart()
                .getCostumer()
                .equals(c)))
                .forEachOrdered(p -> {
            l.add(p);
        });
        return l;
    }
    
    public LinkedList<Payment> getFullPaydPayments(){
        return (LinkedList) this.fullPaydPayments.clone();
    }
    
    public LinkedList<Payment> getPaymentsToPay(){
        return (LinkedList) this.paymentsToPay.clone();
    }
    
    public LinkedList<Payment> getTotalPayments(){
        return (LinkedList) this.totalPayments.clone();
    }
}
