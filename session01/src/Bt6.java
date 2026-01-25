import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stt = Integer.parseInt(sc.nextLine());

        int shelf = (stt - 1) / 25 + 1;
        int position = (stt - 1) % 25 + 1;
        String area = shelf <= 10 ? "Khu Cận (Gần cửa)" : "Khu Viễn";

        System.out.println("--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + shelf + " - Vị trí " + position);
        System.out.println("Phân khu: " + area);
    }
}
