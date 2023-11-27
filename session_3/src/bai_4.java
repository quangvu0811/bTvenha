import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int number =1;

        while (number != 0){
            System.out.printf(" nhap vao 1 so nguyen :");
            number = scanner.nextInt();
            if (number % 3 == 0 ) {
                System.out.printf("%d la so chia het cho 3 : " , number);
            }
        }
    }
}
