package ra;

import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.List;

import static ra.Library.listCategory;
import static ra.Library.listbooks;


public class Category implements IEntity {

    private int id;
    private String name;
    private Boolean status;

    public Category() {
    }

    public Category(int id, String name, Boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public void input(Scanner scanner) {
        System.out.println("Nhập vào id : ");
        this.id = inputId(scanner);
        this.name = inputName(scanner);
        this.status = inputStatus(scanner);
    }


    @Override
    public void output() {
        System.out.printf("| %-9d | %-14s | %-8b |\n", this.id, this.name, this.status);
        System.out.println("+-----------+----------------+----------+");
    }

    public int inputId(Scanner scanner) {
        do {
            try {
                int inputId = Integer.parseInt(scanner.nextLine());
                if (inputId > 0) {
                    Boolean isUBoolean = true;

                    for (Category category : listCategory) {
                        if (category.getId() == inputId) {
                            isUBoolean = false;
                            break;
                        }
                    }
                    return inputId;
                } else {
                    System.out.println("ID < 0 ");
                }
            } catch (NumberFormatException e) {
                System.err.println("hãy nhập đúng ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }


    public String inputName(Scanner scanner) {
        do {
            System.out.println("Tên thể loại:");
            String name = scanner.nextLine();

            if (name.length() > 6 && name.length() < 30) {
                boolean isName = false;
                for (Category category : listCategory) {
                    if (category.getName().equals(name)) {
                        isName = true;
                        break;
                    }
                }

                if (isName) {
                    System.out.println("tên thể loại đã tồn tại! vui lòng nhập lại");
                } else {
                    return name;
                }
            } else {
                System.out.println("tên thể loại có từ 6-30 kí tự");
            }
        } while (true);
    }

    public boolean inputStatus(Scanner scanner) {
        do {
            System.out.print("nhập vào trạng thái danh mục : ");
            String status = scanner.nextLine();
            if (status.equals("true") || status.equals("false")) {
                return Boolean.parseBoolean(status);

            } else {
                System.out.printf("trạng thái danh mục true hoạc false! mời nhập lại \n");
            }
        } while (true);
    }

    public String toString() {
        return "thông tin danh mục : " +
                "id : " + id +
                ", name : '" + name + '\'' +
                ", status : " + status
                ;


    }
    public void updateData(Scanner scanner) {
        boolean isExitUpdate = true;
        do {
            System.out.println("************Câp nhât thông tin************");
            System.out.println("1. cập nhât id");
            System.out.println("2. cập nhât name");
            System.out.println("3. cập nhât status");
            System.out.println("4. thoát");
            System.out.println("lựa chon của bạn:");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        this.id = inputId(scanner);
                        break;
                    case 2:
                        this.name = inputName(scanner);
                        break;
                    case 3:
                        this.status = inputStatus(scanner);
                        break;
                    case 4:
                        isExitUpdate = false;
                        break;
                    default:
                        System.out.println("nhập lựa chọn từ 1-5");
                }
            } catch (NumberFormatException e) {
                System.err.println("vui lòng nhâp số nguyên!");
            }catch (Exception ex) {
                System.err.println(ex.getMessage());
            }

        }while (isExitUpdate);
    }

    public static boolean hasBook(int catagoryId) {
        for (Book book: listbooks) {
            if (book.getCategoryId() == catagoryId) {
                return true;
            }
        }
        return false;
    }

}