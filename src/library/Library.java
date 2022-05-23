/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

// @author Susanna

import administration.Costumer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Library {
    
    private String  name;
    private int     loanId;  
    
    private LinkedList<LinkedList>    booksList;
    private Map<Integer, Loan>  loans;
    
    
    public Library(String s, LinkedList<LinkedList> l){
        this.name = s;
        this.loanId = 0;
        this.booksList = new LinkedList(l);
        this.loans = new HashMap<>();
    }
    
    public Loan borrowBook(Costumer customer, Book book){
        Loan l = new Loan(customer, book);
        this.loanId += 1;
        loans.put(loanId, l);
        return l;
        
    }
    
    public LinkedList<Book> searchBookByTitle(String t){
        LinkedList<Book> books = new LinkedList();
        for(LinkedList<Book> l : booksList){
            l.stream().filter(b -> (b.getName()
                        .contains(t)))
                        .forEachOrdered(b -> {
                            books.add(b);
                        });           
        }
        return books;
    }
    
    public LinkedList<Book> searchBookByAuthor(String a){
        LinkedList<Book> books = new LinkedList();
        for(LinkedList<Book> l : booksList){
            l.stream().filter(b -> (b.getAuthor()
                        .contains(a)))
                        .forEachOrdered(b -> {
                            books.add(b);
                        });        
        }
        return books;
    }
    
    public LinkedList<Book> searchBookByGenre(String g){
        LinkedList<Book> books = new LinkedList();
        for(LinkedList<Book> l : booksList){
            if(l.getFirst().getGenre().equals(g)){
                books = l;
                break;
            }        
        }
        return books;
    }

    void addBook(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void removeBook(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
