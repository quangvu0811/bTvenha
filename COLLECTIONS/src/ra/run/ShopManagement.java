package ra.run;
import java.util.Scanner;

import com.sun.tools.javac.Main;
import ra.entity.Categories;
import ra.entity.Product;

public class ShopManagement {
    Categories[] arrCategories = new Categories[100];
    Product[] arrProduct = new Product[100];
    int currentcateLog = 0;
    int currentProduct = 0;


    public static void main(String[] args) {
        ShopManagement objMain = new ShopManagement();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("******************SHOP MENU*******************\n" +
                    "1. Quản lý danh mục sản phẩm\n" +
                    "2. Quản lý sản phẩm\n" +
                    "3. Thoát");
            System.out.println("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn 1-3!");
            }
        } while (true);
    }
}
