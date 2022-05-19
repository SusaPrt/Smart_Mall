/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration.payment;


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
    
    
}
