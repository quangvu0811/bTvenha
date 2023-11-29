import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int [100];
        int n = 0, count ,sum;
        do {
            System.out.println("************* MENU ************");
            System.out.println("1. Nhập giá trị n phần tử của mảng ");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương (>0) trong mảng");
            System.out.println("4.In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong\n" +
                    "mảng (k nhập từ bàn phím)");
            System.out.println("5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng ần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần,\n" +
                    "các phần tử còn lại ở giữa mảng theo thứ tự tăng dần");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm\n" +
                    "dần) đúng vị trí");
            System.out.println("9. Thoát");
            System.out.println("************************************");
            System.out.println("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.printf("nhap gia tri trong mang: ");
                    n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("array" + i + ": ");
                        array[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.printf("cac gia tri trong mang: ");
                    for (int i = 0; i < n; i++) {
                        System.out.printf(array[i] + "  \n" );
                    }

                    break;
                case 3:
                    count = 0;
                    sum = 0;
                    for (int i = 0; i < n; i++) {
                        if (array[i] > 0) {
                            sum += array[i];
                        }
                    }

                    if (count > 0) {
                        double total = (double) sum /count;
                        System.out.printf("trung binh cac phan tu duong trong mang la :  " + total);
                    }else {
                        System.out.printf("ko co phan tu nao trong mang");
                    }
                    break;
                case 4:
                    System.out.printf("nhap vao chi so k : ");
                    int k = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (array[i] == k) {
                            System.out.printf( "vi chi :"  + i);
                        }

                    }
                    System.out.printf("phan tu gia tri bang k la : \n" + k);
                    break;
                case 5:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (array[i] < array[j]) {
                                int temp = array[i];
                                array[i] = array[j];
                                array[j] = temp;
                            }
                        }

                    }

                    for (int i = 0; i < n; i++) {
                        System.out.printf(" "+ array[i]);
                    }
                    System.out.println("Mảng sau khi sắp xếp giảm gian" );
                    break;
                case 6:
                    count = 0;
                    for (int i = 0; i < n; i++) {
                        boolean isPrime = true;

                        if (array[i] < 2) {
                            isPrime = false;
                        } else {
                            for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                                if (array[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        }
                        if (isPrime) {
                            count++;
                        }
                    }
                    System.out.println("so luong nguyen to trong mang la : " + count);

                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui long chon tu 1-9");
            }
        }while (true);



    }
}
