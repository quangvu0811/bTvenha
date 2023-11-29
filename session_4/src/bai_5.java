import java.util.Scanner;
public class bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();
        float[][] arrNumber = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập giá trị trong mảng: ");
                arrNumber[i][j] = sc.nextInt();
            }
        }
        System.out.println("Các giá trị chẵn trong phần tử mảng là: ");
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arrNumber[i][j] %2==0){
                    sum += arrNumber[i][j];
                    System.out.printf("%d\t", arrNumber[i][j]);
                }
            }
        }
        System.out.println("\nTổng các phần chẵn là: " +sum);
    }
}
