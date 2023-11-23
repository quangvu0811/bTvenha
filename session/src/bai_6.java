import java.util.Scanner;

public class bai_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap 1 so tu nhien :");
        int number = scanner.nextInt();

        if(number %3 == 0 && number%5==0){
            System.out.printf( number + "chia hết cho cả 3 và 5 :");
        } else if ( number %3 == 0 && number % 5 !=0 ){
            System.out.printf(number +" chi het cho 3") ;
        } else if ( number %3 !=0 && number % 5 ==0){
            System.out.printf(number + " chi chua het cho 5");
        }

    }

}
