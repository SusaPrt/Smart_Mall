/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;



import userInterface.Staff;
import userInterface.Costumer;
import administration.payment.Order;
import administration.payment.OrderArchive;
import java.util.LinkedList;


/**
 *
 * @author Mars_DB
 */
public class Handler {
    
    private AccountArchive      peopleArchive;
    private OrderArchive        ordersArchive;
    
    public Handler(){
        this.peopleArchive      = new AccountArchive();
        this.ordersArchive    = new OrderArchive();
    }
    
    public void addCustomer(Costumer a){
        this.peopleArchive.addCostumerAccount(a);

    }
    
    public void deleteCustomer(Costumer a, String pwd){
        this.peopleArchive.removeCostumerAccount(a, pwd);
    }
    
    public void addStaff(Staff s, String password){
        this.peopleArchive.addStaffAccount(s, password);
    }
    
    public void removeStaff(Staff s, String password){
        this.peopleArchive.removeStaffAccount(s, password);
    }
    
    public void addOrders(Order o){
        this.ordersArchive.addOrdersToExecute(o);
    }
    
    public void exeOrder(Order o){
        this.ordersArchive.addExecutedOrder(o);        
    }
    
    @Override
    public String toString(){

        return "\nAccounts: \n"+this.peopleArchive.toString()
                +"\nOrders: \n"+this.ordersArchive.toString();
    }
}
