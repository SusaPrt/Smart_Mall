/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

//@author Susanna
 
public class Book {
    
    private String  author;
    private String  title;
    private int     publishingYear;
    private Genre   genre;
    private int     quantity;
    
    public enum Genre {ADVENTURE, CLASSICS, COMIC, NOVEL, MYSTERY,
                        FANTASY, HISTORY, HORROR, LITERARY, ROMANCE,
                        SCIENCE, THRILLER, BIOGRAPHIES, POETRY;
    };
    
    public Book(String a, String t, int y, Genre g, int q){
        this.author = a;
        this.title = t;
        this.publishingYear = y;
        this.genre = g;
        this.quantity = q;
    }
 
    
    public void setAuthor(String a){
        this.author = a;
    }
    public String getAuthor(){
        return this.author;
    }
    
    
    public void setTitle(String t){
        this.title = t;
    }
    public String getTitle(){
        return this.title;
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
    
    
    public void setQuantity(int q){
        this.quantity = q;
    }
    public int getQuantity(){
        return this.quantity;
    }
    
    public void decreaseQuantity(){
            this.quantity =- 1;
    }
    public void increaseQuantity(){
        this.quantity =+ 1;
    }
        
    public boolean CheckAvailability(int book_id){
        boolean check = this.quantity > 0;
        return check;
    }
    
    @Override
    public String toString(){
        return ("\nTitle: " + this.title + "\nAuthor: " + this.author +
                "\nPublishing Year: " + this.publishingYear + "Genre: " + this.genre);
    }
}
