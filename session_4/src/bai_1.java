import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chieu dai cua mang la");

        int[] myArray = new int[5];
        for(int i=0;i<5;i++){
            System.out.printf("Giá trị của phần tử thứ %d là ",i+1);
            myArray[i]=scanner.nextInt();
        }
        for (int number:myArray
        ) {
            System.out.println(number);
        }
    }
}
