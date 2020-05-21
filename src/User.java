public class User {
    public static void main(String[] args) {
        XMLStorage xmlStorage = new XMLStorage();
        MySQLStorage sqlStorage = new MySQLStorage();

        UserController userController = new UserController(xmlStorage);
        userController.store();

        UserController userController2 = new UserController(sqlStorage);
        userController2.store();
    }
}
