/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration.Archives;


import administration.Customer;
import administration.Person;
import administration.Staff;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;


/**
 * @author Mars_DB
 */
public class AccountArchive {
    //  Archivi  
    private LinkedHashSet<Customer> costumersAccounts;
    private LinkedHashSet<Staff> staffAccounts;
    private LinkedHashSet<Person> totalAccounts;
    
    // builder
    public AccountArchive(){
        this.costumersAccounts  = new LinkedHashSet();
        this.staffAccounts      = new LinkedHashSet();
        this.totalAccounts        = new LinkedHashSet();
    }
 
    
    // lettura dati 
    public Customer getCostumerInfoById(int id){
        Customer accountFound = null;
        
            for(Customer a: this.costumersAccounts){                
                    if (a.getPersonalIdLocker() == id)
                        accountFound = a;               
            }
        
        return accountFound;
    }   // Customer
 
    public List<Staff> getStaffAccounts(){    
        return (LinkedList<Staff>) staffAccounts.stream().toList(); 
    }               // Handler
    
    public List<Customer> getCostumerAccounts(){
        return (LinkedList<Customer>) costumersAccounts.stream().toList();     
    }       //  Staff 
    
    public Staff getStaffInfoById(int id){
        Staff staffAccountFound = null;
            for(Staff s: this.staffAccounts){
                if(s.getIdLocker() == id){
                    staffAccountFound = s;
                }
            }
        return staffAccountFound;       
    }           //  Handler     
    
      
    //  modifica dati
    public void addCostumerAccount(Customer a){
        this.totalAccounts.add(a);
    }                               //  costumer
    
    public void addStaffAccount(Staff s){       
        this.totalAccounts.add(s);
    }               //  Staff amministratore

    public void removeCostumerAccount(Customer a){
        this.costumersAccounts.remove(a);
    }       // costumer
    
    public void removeStaffAccount(Staff s){
        this.staffAccounts.remove(s);
    }           //  Handler
}
