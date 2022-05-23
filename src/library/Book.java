/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

//@author Susanna

import System.Item;




 
public class Book extends Item {
    
    private String  author;
    private int     publishingYear;
    private String   genre;
    
    public Book(String name,  String author, double price, int quantity, int year, String genre){
        super(name, price, quantity);
        this.author = author;
        this.publishingYear = year;
        this.genre = genre;
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
    
    
    public void setGenre(String s){
        this.genre = s;
    }
    public String getGenre(){
        return this.genre;
    }
    
    @Override
    public String toString(){
        return ("\nTitle: " + super.getName() + "\nAuthor: " + this.author +
                "\nPublishing Year: " + this.publishingYear + "\nGenre: " + this.genre+"\n");
    }
}
