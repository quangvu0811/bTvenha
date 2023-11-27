import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, g = 1;
        System.out.printf("nhap vao so thu 1 ");
        number1 = scanner.nextInt();
        System.out.printf("nhap vao so thu 2 ");
        number2 = scanner.nextInt();
        do {
            System.out.println("************ CACULATOR ************");
            System.out.println("1. Tổng hai số");
            System.out.println("2. Hiệu hai số");
            System.out.println("3. Tích hai số");
            System.out.println("4. Thương hai số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.println("************************************");
            System.out.println("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("tong cua %d va %d la` = %d \n", number1, number2, (number1 + number2));
                    break;
                case 2:
                    System.out.printf("hieu cua %d va %d la` = %d \n", number1, number2, (number1 - number2));
                    break;
                case 3:
                    System.out.printf("tich cua %d va %d la` = %d \n", number1, number2, (number1 * number2));
                    break;
                case 4:
                    System.out.printf("thuong cua %d va %d la` = %d \n", number1, number2, (number1 / number2));
                    break;
                case 5:
                    System.out.printf("so du  cua %d va %d la` = %d \n", number1, number2, (number1 % number2));
                    break;
                case 6:
                    for (int i = 1; i <= number1 && i <= number2; i++) {
                        if (number1 % i == 0 && number2 % i == 0)
                            g = i;
                    }
                    System.out.printf("Ước chung lớn nhất của %d và %d là: %d\n", number1, number2, g);
                    break;

            }
        } while (true);
    }
}
