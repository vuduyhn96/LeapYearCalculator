import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập một năm: ");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.printf("%d là năm nhuận", year);
                } else {
                    System.out.printf("%d ko phải năm nhuận",year);
                }
            }else {
                System.out.printf("%d là năm nhuận", year);
        }
    }else {
            System.out.printf("%d ko phải năm nhuận", year);
        }
    }
}
