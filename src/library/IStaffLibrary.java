/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package library;

//@author Susanna
 
public interface IStaffLibrary {
    
    public void addBook(String a, String t, int y, Book.Genre g, int q);
    
    public void deleteBook(String t);

    public void createLoan(Book b, Account c);       
    
    public void deleteLoan(int id);                                             //meglio mappe? chiave: id || valore: loan -> accesso diretto tramite chiave(id) no iterator 
    
}
