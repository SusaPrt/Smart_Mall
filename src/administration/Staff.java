/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;

/**
 *
 * @author Susanna
 */
public class Staff{
    
    private final String name;
    private final int    id;
    private String password;
    
    public Staff(String n, String p){
        this.name = n;
        this.password = p;
        this.id = (int) (Math.random() * 100000);
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setPassword(String p){
        this.password = p;
    }
    public String getPassword(){
        return this.password;
    }
}
