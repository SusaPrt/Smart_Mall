/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;

import administration.Item;
import administration.Customer;
import administration.Staff;

/**
 *
 * @author Mars_DB
 */
public class ShopStaff extends Staff{
    
    public ShopStaff(String name, String password) {
        super(name, password);
    }
    
    public void sellProduct(Product p, Customer c, int i) {
        p.decreaseQuantity(i);
    }
    
}
