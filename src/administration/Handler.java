/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;



import System.Person;
import java.util.LinkedList;
import payment.Item;
import payment.Order;


/**
 *
 * @author Mars_DB
 */
public class Handler {
    
    private AccountArchive      peopleArchive;
    private LinkedList<Order>   executedOrders;
    private LinkedList<Order>   ordersToExecute;
    private double              outgoings;
    private double              profits;

    
    public Handler(){

        this.peopleArchive      = new AccountArchive();
        this.executedOrders     = new LinkedList();
        this.ordersToExecute    = new LinkedList();
        this.profits            = 0;
        this.outgoings          = 0;
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

        return "Profitti: "+this.profits
                +"\nSpese: "+this.outgoings
                +"\nLista ordini evasi: \n"+this.executedOrders.toString()
                +"\nLista ordini da evadere: \n"+this.ordersToExecute.toString();
    }
      
    private boolean exeOrder(Order o){
        boolean b = o.exeOrder();
        if(b){
            this.ordersToExecute.remove(o);
            this.executedOrders.add(o);
            this.profits += (o.getCost() - (o.getCost()*40)/100);
            this.outgoings += ((o.getCost()*40)/100);
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
