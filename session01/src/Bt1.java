import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookID = sc.nextLine();
        String bookName = sc.nextLine();
        int publishYear = Integer.parseInt(sc.nextLine());
        double price = Double.parseDouble(sc.nextLine());
        boolean isAvailable = Boolean.parseBoolean(sc.nextLine());

        int bookAge = 2026 - publishYear;
        String status = isAvailable ? "Còn sách" : "Đã mượn";

        System.out.println("BOOK ID: " + bookID);
        System.out.println("BOOK NAME: " + bookName.toUpperCase());
        System.out.printf("PRICE: %.2f%n", price);
        System.out.println("BOOK AGE: " + bookAge);
        System.out.println("STATUS: " + status);
    }
}
