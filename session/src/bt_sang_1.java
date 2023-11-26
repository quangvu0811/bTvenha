import java.util.Scanner;

public class bt_sang_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap vao 1 so nguyen : ");
        int number = scanner.nextInt();

        int total = number * number;
        System.out.printf("binh phuong cua so nguyen la " + number+ "la" + total);

    }
}
