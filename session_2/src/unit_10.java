import java.util.Scanner;

public class unit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double luongCoBan , ngayCongThucTe;

        int soNgayCong =  26;

        System.out.printf("nhap luong co ban :");
        double luongCoBan = scanner.nextDouble();

        System.out.printf("ngay cong thuc te");
        double ngayCongThucTe = scanner.nextDouble();

        double total;
        if (ngayCongThucTe <= soNgayCong){
            total = luongCoBan * (ngayCongThucTe/soNgayCong);
        } else {
            total = luongCoBan * (soNgayCong + 1.5 * (ngayCongThucTe - soNgayCong)) / soNgayCong;
        }

        System.out.printf("luong nhan vien la " + total);
    }
}
