import java.util.Scanner;

public class unit_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("so dien dau thang: ");
        int firstMonth = scanner.nextInt();

        System.out.printf("so dien cuoi thang");
        int endMonth = scanner.nextInt();

        double total = firstMonth - endMonth ;
        System.out.printf("tong so dien " + total);

        if (0 <= total && total <50){
            System.out.printf(total + "gia dien la 10000 ");
        } else if (50 <= total && total < 100){
            System.out.printf(total + "gia dien la 15000 ");
        }else if (100 <= total && total <150 ){
            System.out.printf(total + "gai dien la 20000 ");
        } else if (150 <= total && total <200) {
            System.out.printf(total + "gia dien la 25000");
        } else if (200<= total) {
            System.out.printf(total +" gia dien la 30000");
        }

    }
}
