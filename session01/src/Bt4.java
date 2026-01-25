import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usd = Double.parseDouble(sc.nextLine());
        float rate = Float.parseFloat(sc.nextLine());

        double vnd = usd * rate;
        long rounded = (long) vnd;

        System.out.println("Giá chính xác (số thực): " + vnd);
        System.out.println("Giá làm tròn để thanh toán (long): " + rounded);
    }
}
