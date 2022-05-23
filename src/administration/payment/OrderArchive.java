/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration.payment;


import administration.Costumer;
import java.util.LinkedList;

/**
 *
 * @author Mars_DB
 */
public class OrderArchive {
    private LinkedList<Order> executedOrders;
    private LinkedList<Order> ordersToExecute;
    private LinkedList<Order> totalOrders;
    
    public OrderArchive(){
        this.executedOrders = new LinkedList();
        this.ordersToExecute = new LinkedList();
        this.totalOrders = new LinkedList();
    }
    
    public void addExecutedOrder(Order o){
        this.ordersToExecute.remove(o);
        this.executedOrders.add(o);
    }
    
    public void addOrdersToExecute(Order o){
        this.ordersToExecute.add(o);
        this.totalOrders.add(o);
    }
    
    public LinkedList<Order> getAccountOrders(Costumer c){
        LinkedList<Order> l = new LinkedList();
        this.totalOrders.stream().filter(o -> (o.getAccount()
                                 .equals(c)))
                                 .forEachOrdered(o -> {
            l.add(o);
        });
        return l;
    }
    
    public LinkedList<Order> getExecutedOrders(){
        return (LinkedList) this.executedOrders.clone();
    }
    
    public LinkedList<Order> getOrdersToExecute(){
        return (LinkedList) this.ordersToExecute.clone();
    }
    
    public LinkedList<Order> getTotalOrders(){
        return (LinkedList) this.totalOrders.clone();
    }
}
