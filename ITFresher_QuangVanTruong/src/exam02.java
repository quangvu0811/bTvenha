import java.util.Scanner;

public class exam02 {
    public static void main(String[] args) {
        int count , sum;
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Nhập số dòng của mảng n: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột của mảng m: ");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        do {
            System.out.println("************ Menu ************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. in giá trị các phần tử mảng");
            System.out.println("3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("4. In giá trị các phần tử trên đường chéo chính và chéo phụ, ");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của\n" +
                    "mảng");
            System.out.println("6. In ra các phần tử là số nguyên tố trong mảng");
            System.out.println("7.  Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính\n" +
                    "của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng,\n" +
                    "thực hiện chèn vào mảng 2 chiều");
            System.out.println("9 .Lựa chọn của bạn: ");
            System.out.println("************************************");
            System.out.println("Lựa chọn của bạn: ");
            int choise = scanner.nextInt();
            switch (choise){
                case 1:
                    System.out.println("Nhập giá trị các phần tử mảng:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print("array[" + i + "][" + j + "] = ");
                            array[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.printf("cac gia tri cua mang : ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                                System.out.println("arr[" + i + "][" + j + "] = " + array[i][j]);
                            }
                        }
                    }
                    break;
                    case 3:
                        count = 0 ;
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                if (array[i][j] % 2 == 0 && array[i][j] %3 ==0) {
                                    count ++;
                                }
                            }
                        }
                        System.out.printf("so luong cac phan tu  chia het cho 2 va 3 la : "  + count);
                        break;
                case 4:

                    sum = 0;
                    System.out.print("Các phần tử trên đường biên: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                                System.out.print(array[i][j] + " ");
                                sum += array[i][j];
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("Tổng các phần tử trên đường biên: " + sum);

                    sum = 0;
                    System.out.print("Các phần tử trên đường chéo chính: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == j) {
                                System.out.print(array[i][j] + " ");
                                sum += array[i][j];
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("Tổng các phần tử trên đường chéo chính: " + sum);

                    sum = 0;
                    System.out.print("Các phần tử trên đường chéo phụ: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i + j == n - 1) {
                                System.out.print(array[i][j] + " ");
                                sum += array[i][j];
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("Tổng các phần tử trên đường chéo phụ: " + sum);


                    break;
                case 5:
                    for (int j = 0; j < m; j++) {
                    for (int i = 0; i < n - 1; i++) {
                        for (int k = i + 1; k < n; k++) {
                            if (array[i][j] > array[k][j]) {
                                int temp = array[i][j];
                                array[i][j] = array[k][j];
                                array[k][j] = temp;
                            }
                        }
                    }

                }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf(" " + array[i][j]);
                        }

                    }
                    System.out.println(" la` Mảng sau khi sắp xếp tăng dần theo cột");
                    break;
                case 6:

                    System.out.println("Các phần tử là số nguyên tố trong mảng:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            int currentNumber = array[i][j];
                            boolean isPrime = true;

                            if (currentNumber < 2) {
                                isPrime = false;
                            } else {
                                for (int k = 2; k <= Math.sqrt(currentNumber); k++) {
                                    if (currentNumber % k == 0) {
                                        isPrime = false;
                                        break;
                                    }
                                }
                            }
                            if (isPrime) {
                                System.out.print(currentNumber + " ");
                            }
                        }
                    }
                    System.out.println(); // Xuống dòng sau khi kết thúc
                    break;
                case 7:
                    for (int i = 0; i < n-1; i++) {
                        for (int j = i+1; j < n; j++) {
                            if (array[i][i] < array[j][j]) {
                                int temp = array[i][i];
                                array[i][i] = array[j][j];
                                array[j][j] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf(" " + array[i][j]);
                        }

                    }
                    System.out.println(" la` Mảng sap xep duong cheo chinh giam dan");
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
