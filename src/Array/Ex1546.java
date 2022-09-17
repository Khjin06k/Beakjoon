package Array;
import java.util.Scanner;

public class Ex1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        double result = 0;
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]) max = arr[i];
        }
        for(int i = 0; i<N; i++){
            result = result + (double)arr[i]/max*100;
        }
        System.out.printf("%.2f",result/N);
    }
}
