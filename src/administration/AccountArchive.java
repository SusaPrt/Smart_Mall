/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;


import System.Person;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;


/**
 * @author Mars_DB
 */
public class AccountArchive {
    //  Archivi  
    private LinkedHashSet<Costumer> costumersAccounts;
    private LinkedHashSet<Staff> staffAccounts;
    private LinkedHashSet<Person> totalAccounts;
    
    // builder
    public AccountArchive(){
        this.costumersAccounts  = new LinkedHashSet();
        this.staffAccounts      = new LinkedHashSet();
        this.totalAccounts        = new LinkedHashSet();
    }
 
    
    // lettura dati 
    public Costumer getCostumerAccountInfoById(int id, String passwordToCheck){
        Costumer accountFound = null;
        
            for(Costumer a: this.costumersAccounts){
                if(a.getPersonalLocker() == id){
                    if (a.getPassword().equals(passwordToCheck) || checkStaffValidation(passwordToCheck))
                        accountFound = a;
                }
            }
        
        return accountFound;
    }   // Costumer
 
    public List<Staff> getStaffAccounts(String passwordToCheck){    
        LinkedList<Staff> l = null;
        if(checkStaffValidation(passwordToCheck))
        l = (LinkedList<Staff>) staffAccounts.stream().toList();
        return l; 
    }               // Handler
    
    public List<Costumer> getCostumerAccounts(String passwordToCheck){
        LinkedList<Costumer> l = null;
        if(checkStaffValidation(passwordToCheck))
            l = (LinkedList<Costumer>) costumersAccounts.stream().toList();
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
    public boolean addCostumerAccount(Costumer a){
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

    public boolean removeCostumerAccount(Costumer a, String passwordToCheck){
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
