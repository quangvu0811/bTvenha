import java.util.Scanner;

public class unit_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("nhap diem html");
        int html = scanner.nextInt();

        System.out.printf("nhap diem css");
        int css = scanner.nextInt();

        System.out.printf("nhap diem js");
        int js = scanner.nextInt();

        double total = (html + css + js) /3;
        System.out.printf("tong diem " + total);
        if ( total >=0 && total <5){
            System.out.printf("hoc luc yeu");
        } else if (total >= 5 && total < 6.5) {
            System.out.printf("hoc luc trung binh");
        }else if (total >= 6.5 && total < 8) {
            System.out.printf("hoc luc kha");
        }else if (total >= 8 && total < 9) {
            System.out.printf("hoc luc gioi");
        }else if (total >= 9 && total <= 10) {
            System.out.printf("hoc luc xuat sac");
        };
    }
}
