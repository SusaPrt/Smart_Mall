/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payment;

import administration.Account;
import java.util.LinkedList;

/**
 *
 * @author Mars_DB
 */
public class Order {
    
    private int num;                                                            //codice ordine
    private LinkedList<Item> items;                                        //mappa nome-oggetto
    private double totCost;                                                     //costo complessivo
    private Account account;                                                    //account di riferimento
    private boolean exed;                                                       //completato?

    
    public Order(int n, Account account){                                       //builder
        this.num = n;
        this.items = new LinkedList();
        this.account = account;
        this.exed = false;
    }
    
    public void addItem(Item item){                                             //aggiunta elemento          
        this.items.add(item);
    }
    
    public void removeItem(Item item){                                          //rimozione elemento  
        items.remove(item);         
    }   
    
    public double getCost(){                                                   //costo complessivo ordine
        this.totCost = 0;
        items.forEach(i -> {
            this.totCost += i.getPrice();
        });
        
        return this.totCost;
    }
    
    public boolean exeOrder(){                                                  //esecuzione pagamento       
        Payment p = new Payment(this.totCost, this, this.account);        
        this.exed = this.account.addPayment(p);        
        return this.exed;
        
    }
    
    public Account getAccount(){
        return this.account;
    }
    
    @Override
    public String toString(){
        return "Ordine n°"+this.num+"\n"+items.toString();
    }
}
