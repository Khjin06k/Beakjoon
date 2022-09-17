package Array;
import java.util.Scanner;

public class Ex4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr;
        int C = sc.nextInt();

        for(int i=0; i<C; i++) {
            int n = sc.nextInt();
            arr = new int[n];
            double sum = 0;
            for (int j = 0; j < n; j++) { //평균을 위해 값을 다 더함
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double result = sum /n; //평균 구하기
            double count=0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > result) count++;
            }
            System.out.printf("%.3f%%\n", count/n*100);
        }
        sc.close();
    }

}
