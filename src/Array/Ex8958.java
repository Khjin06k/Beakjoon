package Array;
import java.util.Scanner;

public class Ex8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];//N 크기의 배열을 생성 및 입력
        for(int i=0; i<N; i++){ //N개의 문자열을 입력받음
            arr[i] = sc.next();
        }

        for(int i = 0; i<N; i++){//N번의 반복 진행으로 각각의 케이스 점수 출력
            int count = 0; //각각의 점수
            int sum = 0; // 각 케이스 점수의 합
            //각 케이스를 반복할 때마다 초기화가 된 상태여야 하기 때문에 반복문 내부에 선언함
            for(int j = 0; j<arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O'){
                    count++;
                    sum +=count; //O일 경우 count를 증가시켜 sum에 더함
                }else{
                    count = 0;//만약 X를 만났을 경우 count를 다시 초기화 시킴
                }
            }
            System.out.println(sum);
        }
    }
}
