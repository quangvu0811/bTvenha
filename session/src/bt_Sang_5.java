import java.util.Scanner;
public class bt_Sang_5 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Nhập điểm toán: ");
            double toan = input.nextDouble();
            System.out.print("Nhập điểm văn: ");
            double van = input.nextDouble();
            System.out.print("Nhập điểm anh: ");
            double anh = input.nextDouble();

            double tongDiem = toan + van + anh;
            double diemTrungBinh = tongDiem / 3;

            System.out.printf("Tổng điểm: %.2f\n", tongDiem);
            System.out.printf("Điểm trung bình: %.2f\n", diemTrungBinh);
    }
}
