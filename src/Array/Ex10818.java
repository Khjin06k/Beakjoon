package Array;
import java.util.Scanner;

public class Ex10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        //정수 N개 입력 받기
        for(int i = 0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        //각 배열에 저장된 정수 비교
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<a; i++){
            if(min>arr[i]) min = arr[i];
            if(max<arr[i]) max = arr[i];
        }
        System.out.printf("%d %d", min, max);
    }
}
