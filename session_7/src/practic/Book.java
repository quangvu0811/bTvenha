package practic;
import java.util.Objects;
import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    public Book() {
    }

    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.year = year;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getInterest() {
        return interest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void inputBookData(Scanner scanner , Book[] arrbook , int currenIndex){
        boolean checkProductId = false;
        do {
            System.out.print("Nhập mã sản phẩm:");
            this.bookId = scanner.nextLine();
            if (this.bookId.length() != 4) {
                System.out.println("Mã sản phẩm phải gồm 4 ký tự!");
            } else {
                if (this.bookId.charAt(0) != 'P') {
                    System.out.println("Mã sản phẩm bắt đầu là ký tự P");
                } else {
                    boolean checkDuplicateProductId = false;
                    for (int i = 0; i < currenIndex; i++) {
                        if (Objects.equals(this.bookId, arrbook[i].getBookId())) {
                            checkDuplicateProductId = true;
                            System.out.println("Mã sản phẩm này bị trùng!");
                            break;
                        }
                    }
                    if (!checkDuplicateProductId) {
                        checkProductId = true;
                    }
                }
            }

        } while (!checkProductId);

        boolean isCheckName = true;
        do {
            System.out.printf("nhập vào tên sách");
            this.bookName = scanner.nextLine();

            if (this.bookName.length() != 4 && this.bookName.charAt(0) != 'B'){
                System.out.printf("\n ten sách phai gom 4 ki tu bat dau bang ki tu b");
                isCheckName = false;
            } else{
                boolean checkName = false;
                for (int i = 0; i < currenIndex; i++) {
                    if(this.bookName.equals(arrbook[i])){
                        checkName =true;
                        System.out.printf("\n ten sach nay da bi trung");
                    }
                }
                if (!checkName){
                    checkName = false;
                }
            }


        }while (isCheckName);
    }

}
