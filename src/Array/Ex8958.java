package Array;
import java.util.Scanner;

public class Ex8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        //배열 입력 받음
        int count[] = new int[80];
        int sum = 0;
        //배열 입력 받기
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("");
        //인덱스0~N 하나씩 처리 진행;
        for (int i = 0; i < N; i++) { //N만큼 반복 진행
            String[] result = arr[i].split(""); //각각 split을 통해 O,X 구별하여 배열에 추가
            for (int j = 1; j < result.length; j++) {
                if (result[0] == "O") count[0] = 1; //0번째 인덱스는 따로 값 저장
                else count[0] = 1;

                if (result[i] == "X") count[i] = 0; //만약 result가 X라면 0을 count에 저장
                else count[i] = count[i - 1] + 1; // O라면 그 이전 값에 +1후 저장
            }
            System.out.println(result.length);
            for (int t = 0; t < result.length; t++) {
                sum = sum + count[t]; //count 배열이 가진 모든 숫자를 합함
            }
            System.out.println(sum);
        }
    }
}
