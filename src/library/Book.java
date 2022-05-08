/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

//@author Susanna

import administration.Item;

 
public class Book extends Item {
    
    private String  author;
    private int     publishingYear;
    private Genre   genre;

    //Classe statica?
    public enum Genre {ADVENTURE, CLASSICS, COMIC, NOVEL, MYSTERY,
                        FANTASY, HISTORY, HORROR, LITERARY, ROMANCE,
                        SCIENCE, THRILLER, BIOGRAPHIES, POETRY;
    };
    
    public Book(String name, double price, int q, String a, int y, Genre g){
        super(name, price, q);
        this.author = a;
        this.publishingYear = y;
        this.genre = g;
    }
 
    
    public void setAuthor(String a){
        this.author = a;
    }
    public String getAuthor(){
        return this.author;
    }
    
    public void setPublishingYear(int y){
        this.publishingYear = y;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    
    
    public void setGenre(Genre g){
        this.genre = g;
    }
    public Genre getGenre(){
        return this.genre;
    }
    
    @Override
    public String toString(){
        return ("\nTitle: " + super.getName() + "\nAuthor: " + this.author +
                "\nPublishing Year: " + this.publishingYear + "Genre: " + this.genre);
    }
}
