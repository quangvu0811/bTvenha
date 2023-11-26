import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap gia tri dau :");
        int start = scanner.nextInt();

        System.out.printf("nhap gia tri cuoi :");
        int end = scanner.nextInt();

        int total = 0 ;
        for (int i = start ; i <= end ; i++ ){
            if (i % 2 ==0){
                total += i ;
            }
        }
        System.out.printf("tong khoang trang tu :" + start +  " den " + end + " la " + total);
    }

}
