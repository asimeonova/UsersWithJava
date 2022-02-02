public class AbstractUser implements IUser {
    private String username;
    private String registrationDate;
    private boolean isLoggedIn;
    private boolean isAdmin;

    public AbstractUser(String username, boolean isAdmin) {
        this.username = username;
        this.isAdmin = isAdmin;
    }

    @Override
    public void logIn() {
        this.isLoggedIn=true;
        System.out.println("User "+this.username + " has logged in");
    }

    @Override
    public void logOut() {
        this.isLoggedIn=false;
        System.out.println("User " + this.username + " has logged out");
    }


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getRegistrationDate() {
        return registrationDate;
    }



    @Override
    public String toString() {
        return "AbstractUser{" +
                "userName='" + username + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", isLoggedIn='" + isLoggedIn + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
