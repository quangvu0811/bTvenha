package ra;
import java.io.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Library {

    static List<Category> listCategory = new ArrayList<>();
    static List<Book> listbooks = new ArrayList<>();

    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n*************************SHOP MANAGEMENT***************\n" +
                    "1. Quản lý danh mục sản phẩm\n" +
                    "2. Quản lý sản phẩm\n" +
                    "3. Thoát");
            System.out.print("Nhập lựa chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    catalogMenu(scanner);
                    break;
                case 2:
                    manageBooks(scanner);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập từ 1 đến 3!");
                    break;
            }
        } while (true);
    }

    public static void catalogMenu(Scanner scanner) {

        boolean isExit = true;
        do {
            System.out.println("\n***************** CATALOG MANAGEMENT**************\n" +
                    "1. Thêm mới thể loai \n" +
                    "2. Hiển thị thông tin các the loai\n" +
                    "3. Thống kê thể loại và số sách có trong mỗi thể loạ\n" +
                    "4. Cập nhật thể loại)\n" +
                    "5. Xóa thể loại\n)\n" +
                    "6. Quay lại");
            System.out.print("Nhập lựa chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addCategory(scanner);
                    break;
                case 2:
                    sortCategoryByName();
                    break;
                case 3:
                    addStatus();
                    break;
                case 4:
                    updateCategory(scanner);
                    break;
                case 5:
                    deleteCategory(scanner);
                    break;
                case 6:
                    isExit = false;
                    break;
                default:
                    System.out.println("Mời nhập từ 1 đến 5!");
                    break;
            }
        } while (isExit);
    }

    public static void manageBooks(Scanner scanner) {
//        listbooks = readBookFromFile();
        int choice;
        do {
            System.out.println("\nAhihi <<<<<<<<<< QUẢN LÝ SÁCH >>>>>>>>>> Ahihi");
            System.out.println("1. THÊM MỚI SÁCH");
            System.out.println("2. CẬP NHẬT THÔNG TIN SÁCH");
            System.out.println("3. XOÁ SÁCH");
            System.out.println("4. TÌM KIẾM SÁCH");
            System.out.println("5. HIỂN THỊ DANH SÁCH SÁCH THEO NHÓM THỂ LOẠI");
            System.out.println("6. QUAY LẠI");
            System.out.print("NHẬP LỰA CHỌN CỦA BẠN: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Thêm mới sách
                    addBook(scanner);

                    break;
                case 2:
                    // Cập nhật thông tin sách
                    updateBook(scanner);

                    break;
                case 3:
                    // Xóa sách
                    deleteBook(scanner);

                    break;
                case 4:
                    // Tìm kiếm sách
                    searchBook(scanner);
                    break;
                case 5:
                    // Hiển thị danh sách sách theo nhóm thể loại
                    booksOfCategory();
                    break;
                case 6:
                    System.out.println("QUAY LẠI MENU THƯ VIỆN.");
                    break;
                default:
                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG CHỌN LẠI!");
            }
        } while (choice != 6);
    }

    public static void addCategory(Scanner scanner) {
        try {
            System.out.println("nhập vào số lượng category");
            int numberCategory = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < numberCategory; i++) {
                Category category = new Category();
                category.input(scanner);
                listCategory.add(category);
            }
        } catch (NumberFormatException e) {
            System.err.println(" nhap vao interger");
        }
    }

    public static void addCategoryName(Scanner scanner) {
        listCategory.stream().sorted(Comparator.comparing(Category::getName)).forEach(System.out::println);
    }

    public static void addStatus() {
        for (Category category : listCategory) {
            long cntCatagory = listbooks.stream().filter(book -> book.getCategoryId() == category.getId()).count();
            System.out.printf("thể loại %s có %d sản phẩm\n", category.getName(), cntCatagory);
        }
    }

    public static void sortCategoryByName() {
        listCategory.stream().sorted(Comparator.comparing(Category::getName)).forEach(System.out::println);
    }

    public static void updateCategory(Scanner scanner) {
        System.out.println("nhập vào mã thể loại cần cập nhật:");
        int updateId = Integer.parseInt(scanner.nextLine());
        boolean isUpdate = false;

        for (Category category : listCategory) {
            if (category.getId() == updateId) {
                category.updateData(scanner);
                isUpdate = true;
                break;
            }
        }

        if (!isUpdate) {
            System.out.println("Không tồn tại mã thể loại!");
        }
    }

    public static void deleteCategory(Scanner scanner) {
        System.out.println("mã thể loại cần xóa:");
        int deleteId = Integer.parseInt(scanner.nextLine());
        boolean isDelete = false;
        int deleteIndex = -1;

        for (int i = 0; i < listCategory.size(); i++) {
            Category category = listCategory.get(i);
            if (category.getId() == deleteId) {
                deleteIndex = i;
                isDelete = true;
                break;
            }
        }

        if (!isDelete) {
            System.out.println("Không tồn tại mã thể loại!");
        } else {
            if (Category.hasBook(deleteId)) {
                System.out.println("thể loại chứa sách! không thể xóa");
            } else {
                listCategory.remove(deleteIndex);
                System.out.println("xóa sách thành công!");
            }
        }
    }

    public static void addBook(Scanner scanner) {
        boolean isExist = true;
        int numAdd = 0;
        System.out.println("nhập số lượng sách bạn muốn thêm:");
        do {
            try {
                numAdd = Integer.parseInt(scanner.nextLine());
                isExist = false;
            } catch (NumberFormatException e) {
                System.err.println("vui lòng nhập số nguyên!");
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        } while (isExist);

        for (int i = 0; i < numAdd; i++) {
            Book book = new Book();
            book.input(scanner);
            listbooks.add(book);
        }
    }

    public static void updateBook(Scanner scanner) {
        System.out.printf("nhập vào mã sach cần cập nhật :");
        int updateId = Integer.parseInt(scanner.nextLine());
        boolean isUpdateBook = false;
        for (Book book : listbooks) {
            if (book.getId().equals(updateId)) {
                book.updateData(scanner);
                isUpdateBook = true;
                break;
            }
        }
        if (!isUpdateBook) {
            System.out.println("mã sách ko tồn tại vui lòng nhập lại : ");
        }
    }

    public static void deleteBook(Scanner scanner) {
        System.out.println("mã sản phẩm cần xóa:");
        String deleteId = scanner.nextLine();
        boolean isDelete = false;

        for (Book book : listbooks) {
            if (book.getId().equals(deleteId)) {
                listbooks.remove(book);
                isDelete = true;
                System.out.println("xóa sản phẩm thành công!");
                break;
            }
        }

        if (!isDelete) {
            System.out.println("Không tồn tại mã sản phẩm!");
        }
    }
    public static void searchBook(Scanner scanner) {
        System.out.println("tên sản phẩm tìm kiếm:");
        String searchName = scanner.nextLine();
        Book.header();
        listbooks.stream().filter(book -> book.getTitle().contains(searchName)).forEach(System.out::println);
    }

    public static void booksOfCategory() {
        for (Category category : listCategory) {
            System.out.printf("thể loại %s\n", category.getName());
            Book.header();
            listbooks.stream().filter(book -> book.getCategoryId() == category.getId()).forEach(System.out::println);
        }
    }

    public static List<Book> readBookFromFile() {
        List<Book> listBookRead = null;
        File file = new File("books.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            listBookRead = (List<Book>) ois.readObject();
        } catch (Exception ex) {
            listBookRead = new ArrayList<>();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return listBookRead;
    }


    public static void bookFile() {
        File file = new File("books.txt");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listbooks);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

