public class AdminUserImpl extends AbstractUser implements IAdminUser {

    private DataBase dataBase=new DataBase(5);
    IUser[] allUsers=dataBase.getDatabase();

    public AdminUserImpl(String username, boolean isAdmin) {
        super(username, isAdmin);
    }


    @Override
    public void deleteUser(String username) {
        if (allUsers.length == 0) {
            System.out.println("The data base is empty");
        }
        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i] != null){
                if (allUsers[i].getUsername().equals(username)) {
                    allUsers[i] = null;
                    return;
                }
            }
        }
    }

    @Override
    public IUser createUSer(String username, boolean isAdmin) {
        if (isAdmin) {
            // check if that user already exist in the database
            if (checkIfUserExist(username)) {
                System.out.println("This username is already registered" + username);
                return null;
            }

            // check for the first empty space in the database to create a new user in it
            for (int i = 0; i < allUsers.length; i++) {
                if (allUsers[i] == null) {
                    allUsers[i] = new AdminUserImpl(username, true);
                    return allUsers[i];
                }

            }

            // return null because the database is full
            System.out.println("DB is full, can't add new user");
            return null;
        } else {
            //  check if that user already exist in the database
            if (checkIfUserExist(username)) {
                System.out.println("This username is already registered" + username);
                return null;
            }

            // check for the first empty space in the database to create a new user in i
            for (int i = 0; i < allUsers.length; i++) {
                if (allUsers[i] == null) {
                    allUsers[i] = new UserImpl(username, false);
                    return allUsers[i];
                }
            }

            // return null because the database is full
            System.out.println("DB is full, can't add new user");
            return null;
        }
    }

    // this method checks if that username already exists
    private boolean checkIfUserExist(String username){
        for (int i=0; i<allUsers.length;i++){
            if (allUsers[i]!=null){
                if(allUsers[i].getUsername().equalsIgnoreCase(username)){
                    return true;
                }
            }
        }
        // that username doesn't exist, we can add it
        return false;
    }

    @Override
    public void viewAllUsers() {
        for (int i=0; i<allUsers.length;i++){
            if(allUsers[i]!=null){
                System.out.println(allUsers[i].toString());
            }
        }
    }






}



