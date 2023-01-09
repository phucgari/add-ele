import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 43, 2, 2, 5, 6, 3, 2, 4, 2};
        Scanner s = new Scanner(System.in);
        int index;
        int num;
        do {
            System.out.println("input number");
            num = s.nextInt();
            System.out.println("input index");
            index = s.nextInt();
            if (index < 0 || index > arr.length - 1) {
                System.out.println("invalid index");
            }
        } while (index < 0 || index > arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                int temp=arr[i];
                arr[i]=num;
                int temp2;
                for (int j=i+1;j<arr.length;j++){
                    temp2=arr[j];
                    arr[j]=temp;
                    temp=temp2;
                }
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}