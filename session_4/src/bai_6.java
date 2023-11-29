import java.util.Scanner;
public class bai_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int number = scanner.nextInt();
        int[] arrNumber = new int[number];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Nhập giá trị thứ [" +i+ "]: ");
            arrNumber[i] = scanner.nextInt();
        }
        System.out.println("Nhập vào một giá trị: ");
        int findNumber = scanner.nextInt();
        int sum =0;
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Chỉ số các phần tử " +arrNumber[i] + " là: " +i);
            if (arrNumber[i] == findNumber){
                sum += arrNumber[i];
            }
        }
        System.out.println("Tổng các phần tử có giá trị bằng " +findNumber+" là:" +sum);
    }
}
