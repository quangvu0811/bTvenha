import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VND = 23000;

        System.out.printf("nhâp số tiền :" );
        int usd = scanner.nextInt();
        System.out.printf("tính tiền : " + usd * VND);

    }
}
