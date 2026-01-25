import java.sql.SQLOutput;
import java.util.Scanner;

public class LibraryManager {
    static void main(String[] args) {
//        bookID: Mã số sách (Số nguyên)
//        title: Tên sách (Chuỗi ký tự)
//        price: Giá nhập (Số thực)
//        quantity: Số lượng (Số nguyên)
//        isAvailable: Trạng thái còn sách hay không (Boolean)

        int bookID = 0;
        String title ="";
        double price = 0;
        int quantity =0;
        boolean isAvailable = false;
        Scanner sc = new Scanner(System.in);

        bookID = Integer.parseInt(sc.nextLine());
        title=sc.nextLine();
        price = Double.parseDouble(sc.nextLine());
        quantity = Integer.parseInt(sc.nextLine());
        isAvailable = Boolean.parseBoolean(sc.nextLine());
        double totalValue =  price * quantity;
        String isLargeStock = quantity > 100?"có":"không";
        boolean canBorrow = isAvailable && (quantity > 0);
        System.out.println("ID:"+ bookID);
        System.out.println("TITLE: "+title);
        System.out.println("PRICE: "+price);
        System.out.println("QUANTITY: "+quantity);
        System.out.println("IS AVAILABLE: "+isAvailable);
        System.out.println("LARGE STOCK: "+isLargeStock);
        System.out.println("TOTAL: "+totalValue);
        System.out.println("CAN BORROW: "+canBorrow);




    }
}
