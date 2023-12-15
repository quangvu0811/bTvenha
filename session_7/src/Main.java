import java.util.Scanner;
import practic.Book;
import java.util.Objects;
public class Main {
    Book[] books = new Book[100];
    int number = 0 ;
    public static void main(String[] args) {
        Main objMain = new Main();


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("********************CATEGORIES MENU***********\n" +
                    "1.Nhập thông tin n sách (n nhập từ bàn phím)\n" +
                    "2. Tính lợi nhuận các sách\n" +
                    "3. Hiển thị thông tin sách\n" +
                    "4. Sắp xếp sách theo giá bán tăng dần\n" +
                    "5. Sắp xếp sách theo lợi nhuận giảm dần\n" +
                    "6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)\n" +
                    "7. Thống kê số lượng sách theo năm xuất bản\n" +
                    "8. Thống kê số lượng sách theo tác giả\n" +
                    "9. Thoát");
            System.out.printf("nhap vao lua chon cua ban :");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        } while (true);

    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập số sản phẩm cần điền thông tin:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Sản phẩm thứ %d:\n", i + 1);
            books[number] = new Book();

        }
    }
}