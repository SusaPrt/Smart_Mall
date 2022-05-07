/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

// @author Susanna

import administration.Client;
import java.util.ArrayList;
import java.util.LinkedList;

public class Library {
    
    public static int        loanId;                    // mappa loan
    private String              name;      
    private LinkedList<Book>    booksList;
    protected LinkedList<Book>  borrowedBooks;
    private LinkedList<Client>  clients;

    
    public Library(String n){
        this.loanId = 0;
        this.name = n;
        this.booksList = new LinkedList();
        this.borrowedBooks = new LinkedList();
        this.clients = new LinkedList();
    }
    
    public ArrayList<Book> searchBookByTitle(String t){
        ArrayList<Book> books = new ArrayList();
        for(Book b : booksList){
            if(b.getTitle().contains(t))
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
    
    public ArrayList<Book> searchBookByGenre(Book.Genre g){
        ArrayList<Book> books = new ArrayList();
        for(Book b : booksList){
            if(b.getGenre() == g)
                books.add(b);
        }
        return books;
    }
}
