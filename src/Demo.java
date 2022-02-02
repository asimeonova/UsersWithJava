public class Demo {
    public static void main(String[] args) {
        IAdminUser toni= new AdminUserImpl("toni",true);

        System.out.println("**************Create users**************");
        toni.createUSer("john", true);

        IUser george =toni.createUSer("george", false);
        george.logIn();
        george.logOut();

        IUser philip = toni.createUSer("philip", false);
        philip.logIn();

        toni.createUSer("maria", true);
        toni.createUSer("yana", false);
        toni.createUSer("petar", false);

        toni.viewAllUsers();

        System.out.println("**************Delete a user**************");
        toni.deleteUser("john");
        toni.viewAllUsers();

        System.out.println("**************Delete all users**************");
        toni.deleteUser("philip");
        toni.deleteUser("george");
        toni.deleteUser("maria");
        toni.deleteUser("yana");
        toni.viewAllUsers();

    }
}
