import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());

        double total = n * m * 5000;
        double finalTotal = (n > 7 && m >= 3) ? total * 1.2 : total;
        boolean lockCard = finalTotal > 50000;

        System.out.println("Tiền phạt gốc: " + total + " VND");
        System.out.println("Tiền phạt sau điều chỉnh: " + finalTotal + " VND");
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);
    }
}
