/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;



import administration.payment.Order;
import java.util.LinkedList;


/**
 *
 * @author Mars_DB
 */
public class Handler {
    
    private AccountArchive      peopleArchive;
    private LinkedList<Order>   executedOrders;                                 // ordini evasi/pagati
    private LinkedList<Order>   ordersToExecute;                                // ordini da pagare
    
    public Handler(){
        this.peopleArchive      = new AccountArchive();
        this.executedOrders     = new LinkedList();
        this.ordersToExecute    = new LinkedList();
    }
    
    public boolean addCustomer(Costumer a){
        boolean b = this.peopleArchive.addCostumerAccount(a);
        toNotify(b);
        return b;
    }
    
    public boolean deleteCustomer(Costumer a, String pwd){
        boolean b = this.peopleArchive.removeCostumerAccount(a, pwd);
        toNotify(b);
        return b;
    }
    
    public boolean addOrders(Order o){
        boolean b = this.ordersToExecute.add(o);
        toNotify(b);
        return exeOrder(o);
    }
    
    @Override
    public String toString(){

        return "\nExecuted orders: \n"+this.executedOrders.toString()
                +"\nOrders to execute: \n"+this.ordersToExecute.toString();
    }
      
    private boolean exeOrder(Order o){
        boolean b = false;//o.exeOrder();
        if(b){
            this.ordersToExecute.remove(o);
            this.executedOrders.add(o);
        }            
        return b;
    }
    
    private void toNotify(boolean b){
        if(b)
            System.out.println("L'operazione è andata a buon fine!");
        else 
            System.out.println("Ops! C'è stato un errore!");
    }  
    
    public boolean checkIfValid(String stafReq){
        boolean b = false;
        
        
        
        return b;
        
    }
    
    public String getAccountInfo(String password, Costumer a){
        return a.toString();
    }
}
