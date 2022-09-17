package Array;
import java.util.Scanner;

public class Ex2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int max = 0;
        int j =0;
        for(int i = 1; i<10; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max) {
                max = arr[i];
                j = i;
            }
        }
        System.out.println(max + "\n" + j);
    }
}
