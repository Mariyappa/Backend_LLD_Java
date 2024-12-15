package day2.LibraryManagementSystem.Users1;

class Member extends User{

    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public void displayDashBoard(){
        System.out.println("Member : Display DashBoard");
        System.out.println("Name: "+getName());
    }

    public boolean canBorrowBooks(){
        if(borrowedBooksCount<MAX_BORROW_LIMIT){
            return true;
        }
        return false;
    }
    
    Member(){
    	super();
    	borrowedBooksCount = 0;
    }
    
    

}