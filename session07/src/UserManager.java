public class UserManager {
    public static User[] users = new User[100];
    public static int count = 0;

    public static void addUser(User u) {
        users[count++] = u;
    }

    public static boolean checkLogin(String username, String password) {
        for (int i = 0; i < count; i++) {
            if (users[i].getUsername().equals(username) &&
                    users[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
