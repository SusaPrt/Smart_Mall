/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;

// @author Susanna
 
public class Person {
    protected String name;
    protected String surname;
    protected String taxCode;
    protected String password;
    
    public Person(String n, String s, String t, String p) {
        this.name = n;
        this.surname = s;
        this.taxCode = t;
        this.password = p;
    }
    
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    
    public void setSurname(String s){
        this.name = s;
    }
    public String getSurname(){
        return this.surname;
    }
    
    public void setTaxCode(String t){
        this.taxCode = t;
    }
    public String getTaxCode(){
        return this.taxCode;
    }
    
    public void setPassword(String p){
        this.password = p;
    }
    public String getPassword(){
        return this.password;
    }
    
    @Override
    public String toString(){
        return("\nName: " + this.name + "\nSurname: " + this.surname + "\nTax code: " + this.taxCode);
    }
}
