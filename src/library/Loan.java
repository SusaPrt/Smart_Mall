/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

// @author Susanna

import administration.Account;
import java.util.Calendar;
import java.util.Date;


public class Loan {
    
    private Date     issueDate;
    private Date     dueDate;
    private Account  borrower;
    private Book     borrowedBook;
    
    public Loan(Account customer, Book book) {
        
        Calendar calendar = Calendar.getInstance();
        this.issueDate = calendar.getTime();
        
        calendar.add(Calendar.DATE, 30);
        this.dueDate = calendar.getTime();
        
        this.borrower = customer;
        this.borrowedBook = book;
    }
        
    public Date getIssueDate(){
        return this.issueDate;
    }
    
    public void setDueDate(Date d){
        this.dueDate = d;
    }
    public Date getDueDate(){
        return this.dueDate;
    }
    
    public void setBorrower(Account c){
        this.borrower = c;
    }
    public Account getBorrower(){
        return this.borrower;
    }
    
    public void setBorrowedBook(Book b){
        this.borrowedBook = b;
    }
    public Book getBorrowerdBook(){
        return this.borrowedBook;
    }
    
    @Override
    public String toString(){
        return("\nBorrower: " + "\n" + this.borrower + "\nBook: " + this.borrowedBook);
    }
}
