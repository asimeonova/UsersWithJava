public interface IAdminUser extends IUser {
    void deleteUser(String username);
    IUser createUSer(String username, boolean isAdmin);
    void viewAllUsers();
}
