public class DataBase {
    private  IUser[] database;

    public DataBase(int usersLimit) {
        this.database = new IUser[usersLimit];
    }

    public IUser[] getDatabase() {
        return database;
    }

}
