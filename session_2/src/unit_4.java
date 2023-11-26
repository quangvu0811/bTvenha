import java.util.Scanner;

public class unit_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap 1 so nguyen bat ki :");
        int number = scanner.nextInt();
        if( number % 3 ==0 && number ==5){
            System.out.printf("chia het cho 3 va 5" + number);
        }else {
            System.out.printf("ko chia het cho 3 va 5");
        }
    }
}
