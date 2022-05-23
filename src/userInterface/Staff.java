/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface;

import administration.Handler;

/**
 *
 * @author Susanna
 */
public class Staff extends Person{
    
    private  String name;
    private  String password;
    private  int    idLocker;
    private Handler handler;

    
    public Staff(String name, String password, Handler h){
        super(name, password);
        this.handler = h;
        this.idLocker = (int) (Math.random() * 100000);
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    public int getIdLocker(){
        return this.idLocker;
    }
    
    @Override
    public String getPassword(){
        return this.password;
    }
    
    public String getAccountInfo(Person p){
        //this.handler;
        return p.toString();
    }
}
