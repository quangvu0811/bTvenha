import java.util.Scanner;

public class bt_Sang_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào bán kính của hình tròn: ");
        double radius = input.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Chu vi của hình tròn là " + perimeter);
        System.out.println("Diện tích của hình tròn là " + area);
    }
}
