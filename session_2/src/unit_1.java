import java.util.Scanner;

public class unit_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap vao so nguyen ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.printf("la so chan ", number);
        } else {
            System.out.printf("la so le", number);
        }
    }
}
