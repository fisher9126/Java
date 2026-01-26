
    import java.util.Scanner;

    public class Btth {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = Integer.parseInt(sc.nextLine());
            int totalFine = 0;

            for (int i = 0; i < n; i++) {
                int daysLate = Integer.parseInt(sc.nextLine());
                if (daysLate <= 5) {
                    totalFine += daysLate * 2000;
                } else {
                    totalFine += 5 * 2000 + (daysLate - 5) * 5000;
                }
            }

            System.out.println(totalFine);

            int age = Integer.parseInt(sc.nextLine());
            int booksBorrowed = Integer.parseInt(sc.nextLine());
            int isStudentPriority = Integer.parseInt(sc.nextLine());

            String vipStatus = (age >= 18 && booksBorrowed >= 10) || isStudentPriority == 1
                    ? "Đủ tiêu chuẩn nâng cấp VIP"
                    : "Chưa đủ tiêu chuẩn";

            System.out.println(vipStatus);

            int count = 0;

            do {
                int code = Integer.parseInt(sc.nextLine());
                if (code < 0) {
                    continue;
                }
                if (code == 0) {
                    break;
                }
                count++;
            } while (true);

            System.out.println(count);
        }
    }


