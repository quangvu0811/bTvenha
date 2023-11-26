import java.util.Scanner;

public class bt_Sang_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap chieu dai cua hinh chu nhat :");
        int length = scanner.nextInt();

        System.out.printf("nhao vao chieu rong cua hinh chu nhat :");
        int width = scanner.nextInt();

        int chuVi = (length + width) * 2;

        int dienTich = length * width;

        System.out.printf("chu vi cua hinh chu nhat la " + chuVi);
        System.out.printf("dein tich cua hinh chu nhat la " + dienTich);

    }
}
