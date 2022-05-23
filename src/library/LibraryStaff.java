/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import administration.Staff;

/**
 *
 * @author Mars_DB
 */
public class LibraryStaff extends Staff{
    private Library library;
    public LibraryStaff(String name, String password, Library l) {
        super(name, password);
        this.library = l;        
    }
    
    public void addBook(Book b){
        this.library.addBook(b);
    }
    
    public void removeBook(Book b){
        this.library.removeBook(b);
    }
    
}
