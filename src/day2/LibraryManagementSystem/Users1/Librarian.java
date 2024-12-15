package day2.LibraryManagementSystem.Users1;

import day2.LibraryManagementSystem.Books.Book;

class Librarian extends User{
    private String employeeNumber;

    public void displayDashBoard(){
        System.out.println("Librarian : Display DashBoard");
        System.out.println("Employee Number : "+employeeNumber+", Name : "+getName());
    }
    
    public Librarian(String employeeNumber, String name, String contactInfo) {
    	super(name,contactInfo);
    	this.employeeNumber = employeeNumber;

	}

    public boolean canBorrowBooks(){
        return true;
    }

    private void addNewBook(Book book){
    	
    	System.out.println("Added new Book");

    }

    private void removeBook(Book book){
    	System.out.println("Removed a Book");
    }
} 