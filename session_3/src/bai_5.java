import java.util.Scanner;
public class bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 9; i++) {
            System.out.printf("Bảng cửu chương %d: \n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf(" %d * %d = %d \n", i, j, i * j);
            }
        }
    }
}
