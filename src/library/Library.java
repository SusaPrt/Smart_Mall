/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

// @author Susanna

import administration.Account;
import library.Loan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Library {
    
    private String  name;
    private int     loanId;  
    
    private LinkedList<Book>    booksList;
    final Map<Integer, Loan>  loans;
    
    
    public Library(String n){
        this.name = n;
        this.loanId = 0;
        this.booksList = new LinkedList();
        this.loans = new HashMap<>();
    }
    
    public Loan borrowBook(Account customer, Book book){
        Loan l = new Loan(customer, book);
        this.loanId += 1;
        loans.put(loanId, l);
        return l;
        
    }
    
    public ArrayList<Book> searchBookByTitle(String t){
        ArrayList<Book> books = new ArrayList();
        for(Book b : booksList){
            if(b.getName().contains(t))
                books.add(b);
        }
        return books;
    }
    
    public ArrayList<Book> searchBookByAuthor(String a){
        ArrayList<Book> books = new ArrayList();
        for(Book b : booksList){
            if(b.getAuthor().contains(a))
                books.add(b);
        }
        return books;
    }
    
    public ArrayList<Book> searchBookByGenre(Genre g){
        ArrayList<Book> books = new ArrayList();
        for(Book b : booksList){
            if(b.getGenre() == g)
                books.add(b);
        }
        return books;
    }
}
