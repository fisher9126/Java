import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = Integer.parseInt(sc.nextLine());

        int thousands = code / 1000;
        int hundreds = (code / 100) % 10;
        int dozens = (code / 10) % 10;
        int units = code % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        boolean isValid = sumOfFirstThreeNumber % 10 == units;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + (sumOfFirstThreeNumber % 10));
        System.out.println("Kết quả kiểm tra mã sách: " + (isValid ? "HỢP LỆ" : "SAI MÃ"));
    }
}
