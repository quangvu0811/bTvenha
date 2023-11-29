import java.util.Scanner;
public class bai_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The array length is ");
        int arrLength = scanner.nextInt();
        int deletedIndex;
        int[] myArr = new int[arrLength];
        int [] myNewArr= new int[arrLength-1];
        for (int i = 0; i < arrLength; i++) {
            System.out.printf("Elements value at position %d is", i);
            myArr[i] = scanner.nextInt();
        }

        System.out.println("Please enter the index that number is need to delete");
        do {
            deletedIndex = scanner.nextInt();
        } while (deletedIndex >= arrLength);
        for (int i=0;i<arrLength-1;i++){
            if(i<deletedIndex){
                myNewArr[i]=myArr[i];
            }else {
                myNewArr[i]=myArr[i+1];
            }
        }
        for (int value : myNewArr
        ) {
            System.out.println(value);
        }
    }
}
