package ra.presentation;

import ra.businessImp.Employee;

import java.util.Scanner;

public class EmployeeManagement {

    private static int  employeeIndex = 0;
    private static Employee[] arrEmployee = new Employee[100];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("********************MENU*********************");
            System.out.println("1. Nhập thông tin cho n nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên");
            System.out.println("3. Tính lương cho các nhân viên");
            System.out.println("4. Tìm kiếm nhân viên theo tên nhân viên");
            System.out.println("5. Cập nhật thông tin nhân viên");
            System.out.println("6. Xóa nhân viên theo mã nhân viên");
            System.out.println("7. Sắp xếp nhân viên theo lương tăng dần (Comparable)");
            System.out.println("8. Sắp xếp nhân viên theo tên nhân viên giảm dần (Comparator)");
            System.out.println("9. Sắp xếp nhân vên theo năm sinh tăng dần (Comparator)");
            System.out.println("10. Thoát");
            System.out.println("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    inputListEmployee(scanner);
                    break;
                case 2:
                    displayListEmployee();
                    break;
                case 3:
                    salaryEmployee();
                    break;
                case 4:
                    searchNameEmployee(scanner);
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
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Please enter value from 1-10");
            }


        } while (true);
    }

    public static void inputListEmployee(Scanner scanner) {
        System.out.println("Nhập số lượng nhân viên cần nhập thông tin:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++){
            arrEmployee[employeeIndex] = new Employee();
            arrEmployee[employeeIndex].inputData(scanner);
            employeeIndex++;
        }
    }
    public static void displayListEmployee(){
        System.out.println("THÔNG TIN CÁC NHÂN VIÊN:");
        for (int i = 0; i < employeeIndex; i++) {
            arrEmployee[i].displayData();
        }
    }
    public static void salaryEmployee(){
        for (int i = 0; i < employeeIndex; i++){
            System.out.printf("Lương của nhân viên %s là: %f\n", arrEmployee[i].getName(), arrEmployee[i].calSalary() );

        }
    }
    public static void searchNameEmployee(Scanner scanner){
        boolean isName = true;
        do {
            System.out.println("Nhập tên nhân viên cần tìm kiếm:");
            String nameEmployee = scanner.nextLine();

            for (int i = 0; i < employeeIndex; i++){
                if (arrEmployee[i].getName().equals(nameEmployee)){
                    System.out.println("Thông tin nhân viên cần tìm là: ");
                    arrEmployee[i].displayData();
                    isName = false;
                }
            }
        }while (isName);
    }

}
