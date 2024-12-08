package day2.LibraryManagementSystem.Users1;


public abstract class User{
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    public User(){
        this.userId = generateUniqueId;
    }

    public User(User other){
        this.userId = generateUniqueId();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    public User(String name, String contactInfo){
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    private final String generateUniqueId(){
        return "User-"+getTotalUsers();
    }
    private static int getTotalUsers(){
        return totalUsers + 1;
    }

    public String getUserId() {
        return userId;
    }

    //Do not want to any third party to come in set the userId. So we can remove this setUserId
    /*public void setUserId(String userId) {
        this.userId = userId;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void displayDashBoard();
    public abstract boolean canBorrowBooks();
}