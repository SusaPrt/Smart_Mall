/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import administration.Account;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mars_DB
 */
public class BookArchive {
    private Map<Integer, Book> books;
            
            
    public BookArchive(){
        this.books = new HashMap<Integer, Book>();
    }
    
    public Book getBook(String s){
        return this.books.values().stream().filter(o -> o.getTitle()
                    .equals(s))
                    .findAny()
                    .get();
    }
    
    public List getBooksByKind(enum g){
        return this.books.values().stream().filter(o -> o.getTitle()
                    .equals(s))
                    .findAny()
                    .collect(Collectors.toList());
    }
    
}
