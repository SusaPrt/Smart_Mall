/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities.restaurant;

import administration.Customer;
import administration.Staff;

/**
 *
 * @author Mars_DB
 */
public class RestaurantStaff extends Staff{
    
    public RestaurantStaff(String name, String password) {
        super(name, password);
    }
    
    public void sellProduct(Dish d, Customer c, int i) {
        d.decreaseQuantity(i);
    }
    
}
