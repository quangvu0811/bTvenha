package ra.businessImp;

import ra.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee  {
    private String id;
    private String name;
    private int year;
    private float rate;
    private float commission;

    private float salary;
    private boolean status;

    public Employee() {
    }

    public Employee(String id, String name, int year, float rate, float commission, float salary, boolean status) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rate = rate;
        this.commission = commission;
        this.salary = salary;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhâp mã nhân viên:");
        this.id = scanner.nextLine();
        System.out.println("Nhâp tên nhân viên:");
        this.name = scanner.nextLine();
        System.out.println("Nhâp năm sinh nhân viên:");
        this.year = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhâp hệ số lương:");
        this.rate = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhâp hoa hồng của nhân viên hàng tháng:");
        this.commission = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhâp trạng thái:");
        this.status = Boolean.parseBoolean(scanner.nextLine());

    }

    @Override
    public void displayData() {
        System.out.printf("Id: %s - Name: %s - Year: %d - Rate: %f - Commission: %f - Status: %s\n",
                this.id, this.name, this.year, this.rate, this.commission, this.status ? "Active" : "Inactive");
    }

    public double calSalary(){
        this.salary = (float) (this.rate*BASIC_SALARY + this.commission);
        return this.salary;
    }
}
