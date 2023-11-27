import java.util.Scanner;

public class bai_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.printf("nhap vao so thu 1:");
        num1 = scanner.nextInt();
        System.out.printf("nhao vao so thu 2 :");
        num2 = scanner.nextInt();
        System.out.printf("nhap vao so thu 3 :");
        num3 = scanner.nextInt();
        do {
            System.out.println("************ CACULATOR ************");
            System.out.println("1. Tổng ba số nguyên");
            System.out.println("2. Trung bình cộng của ba số nguyên");
            System.out.println("3. Số lớn nhất, nhỏ nhất trong ba số");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("tong cua 3 so nguyen %d \n" , num1 ,num2 ,num3, (num1+num2+num3));
                    break;
                case 2:
                    System.out.printf("trung binh cua 3 so nguyen %d \n" , ((num1+num2+num3) / 3) );
                    break;
                case 3:
                    int max = Math.max(num1, Math.max(num2, num3));
                    int min = Math.min(num1, Math.min(num2, num3));
                    System.out.printf("%d là số lớn nhất\n", max);
                    System.out.printf("%d là số nhỏ nhất\n", min);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không phù hợp. Vui lòng nhập lại!");
            }
        } while (true);
    }
}
