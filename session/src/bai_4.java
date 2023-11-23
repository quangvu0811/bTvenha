import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("chiều dài :");
        int length = scanner.nextInt();

        System.out.printf("chieu rong :");
        int width = scanner.nextInt();

        System.out.printf("chu vi: ," + (length + width) *2) ;
        System.out.printf("dien tich: " + length * width);
    }
}
