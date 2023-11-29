import java.util.Scanner;
public class bai_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhâp số lượng mang: ");
        int sizeArray=Integer.parseInt(sc.nextLine());
        int [] arr=new int[sizeArray];
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]: ",i);
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        for (int temp:arr) {
            System.out.printf("%d\t",temp);
        }
        System.out.println("\n");
        System.out.printf("Nhập giá trị cần chèn: ");
        int addValue=Integer.parseInt(sc.nextLine());
        System.out.printf("\n Nhập vị trí cần chèn: ");
        int indexValue=Integer.parseInt(sc.nextLine());
        int [] newArr= new int[sizeArray+1];
        for(int i=0, j=0;i<newArr.length;i++){
            if(i==indexValue){
                newArr[i]=addValue;
            }
            else {
                newArr[i]=arr[j];
                j++;
            }
        }
        System.out.println("\nSau khi chèn: ");
        for (int temp:newArr) {
            System.out.printf("%d\t",temp);
        }
    }
}
