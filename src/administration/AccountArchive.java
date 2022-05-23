/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;


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
    public Customer getCostumerAccountInfoById(int id, String passwordToCheck){
        Customer accountFound = null;
        
            for(Customer a: this.costumersAccounts){
                if(a.getPersonalLocker() == id){
                    if (a.getPassword().equals(passwordToCheck) || checkStaffValidation(passwordToCheck))
                        accountFound = a;
                }
            }
        
        return accountFound;
    }   // Customer
 
    public List<Staff> getStaffAccounts(String passwordToCheck){    
        LinkedList<Staff> l = null;
        if(checkStaffValidation(passwordToCheck))
        l = (LinkedList<Staff>) staffAccounts.stream().toList();
        return l; 
    }               // Handler
    
    public List<Customer> getCostumerAccounts(String passwordToCheck){
        LinkedList<Customer> l = null;
        if(checkStaffValidation(passwordToCheck))
            l = (LinkedList<Customer>) costumersAccounts.stream().toList();
        return l;       
    }       //  Staff 
    
    public Staff getStaffInfoById(int id, String passwordToCheck){
        Staff staffAccountFound = null;
        if (checkStaffValidation(passwordToCheck)){
            for(Staff s: this.staffAccounts){
                if(s.getIdLocker() == id){
                    staffAccountFound = s;
                }
            }
        }
        return staffAccountFound;       
    }           //  Handler     
    
      
    //  modifica dati
    public boolean addCostumerAccount(Customer a){
        this.totalAccounts.add(a);
        return this.costumersAccounts.add(a);
    }                               //  costumer
    
    public boolean addStaffAccount(Staff s, String passwordToCheck){
        boolean b = false;
            if(checkStaffValidation(passwordToCheck)){
                this.totalAccounts.add(s);
                b = this.staffAccounts.add(s);
            }
        return b; 
    }               //  Handler

    public boolean removeCostumerAccount(Customer a, String passwordToCheck){
        boolean b = false;
        if(a.getPassword().equals(passwordToCheck) || checkStaffValidation(passwordToCheck))
            b = this.costumersAccounts.remove(a);
        return b;
    }       // costumer
    
    public boolean removeStaffAccount(Staff s, String passwordToCheck){
        boolean b = false;
        if(checkStaffValidation(passwordToCheck))
            b = this.staffAccounts.remove(s);
        return b;
    }           //  Handler
    
    //  validazione operazione
    private boolean checkStaffValidation(String passwordToCheck){
            boolean b = false;
            for(Staff s: this.staffAccounts){
                if(s.getPassword().equals(passwordToCheck)){
                    b = true;
                    break;
                }
            }
            return b;
        }               //  Handler
}
