package String;
import java.util.Scanner;

public class Ex1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] arr = new String[num];//입력받을 단어를 저장할 배열
        for(int i=0; i<num; i++){//단어 입력 받기
            arr[i] = sc.next();
        }
        //배열에서

        int count = 0; //알파벳을 저장할 때마다 1씩 증가
        int sum = 0;//그룹단어 개수 저장

        for(int i = 0; i<num; i++){ //각 단어를 조사
            for(int j=0; j<arr[i].length()-1; j++) { //단어 내 알파벳 같은지 여부 조사
                char[] str = new char[arr[i].length()];
                if (arr[i].charAt(j) == arr[i].charAt(j + 1)) continue;
                else {
                    str[count] = arr[i].charAt(j);
                    count++;
                }
                for (int t = 0; t < str.length; t++) {
                    for (int h = 0; h < j; h++) {
                        if (str[t] == str[h]) {
                            sum++;
                            break;
                        }
                    }
                }
            }//모든 배열이 다를 경우 sun에 어떻게 1을 더하는가,,,
        }
        System.out.println(sum);
    }
}
