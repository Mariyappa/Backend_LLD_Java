class Librarian extends User{
    private String employeeNumber;

    public void displayDashBoard(){
        System.out.println("Librarian : Display DashBoard");
    }

    public boolean canBorrowBooks(){
        return true;
    }

    private void addNewBook(Book book){

    }

    private void removeBook(Book book){

    }
}