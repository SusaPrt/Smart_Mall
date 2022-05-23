/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface;

/**
 *
 * @author Mars_DB
 */
public class Person {
    protected  final String name;
    protected  final String password;
    protected  final int    idLocker;
    
    public Person(String n, String p){
        this.name = n;
        this.password = p;
        this.idLocker = (int) (Math.random() * 100000);
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    @Override
    public String toString(){
        return "\nName: "+this.name+"\nPassword: "+this.password;
    }
}
