public class Main {
    public static void main(String[] args) {
        User u1 = new User(1, "huy", "123");
        User u2 = new User(2, "kien", "456");
        User u3 = new User(3, "hieu", "789");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println("Đăng nhập đúng: " + UserManager.checkLogin("huy", "123"));
        System.out.println("Đăng nhập sai: " + UserManager.checkLogin("huy", "000"));

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);


    }
}
