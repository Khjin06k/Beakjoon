package Array;
//import java.util.HashMap;
import java.util.Scanner;

public class Ex3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*HashMap<Integer, Integer> hashMap = new HashMap<>();
        //입력받아 key에는 인덱스를, value에는 입력 받은 값을 저장
        for(int i = 0; i<10; i++){
            int a = sc.nextInt()%42;
            hashMap.put(i, a);
        }
        int count = 0;
        for(int i = 0; i<42; i++){
            if(hashMap.containsValue(i)) count++;
        }
        System.out.println(count);*/
        int[] arr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        int count = 0;
        for(int i=0; i<42; i++){
            for(int j=0; j<10; j++){
                if(arr[j] == i){
                    count ++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

