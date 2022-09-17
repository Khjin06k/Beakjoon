package String;
import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] arr = new int[27];
        String low = s.toUpperCase(); //모두 대문자로 변환
        for(int i=0; i<s.length(); i++) {
            for(int j=0; j<abc.length(); j++){
            if(low.charAt(i) == abc.charAt(j)) arr[j]++;
            }
        } //중복되는 알파벳이 있을 경우 해당하는 인덱스에 +1

        int max = -1;
        char ch = '?';
        for(int i=0; i<abc.length(); i++){
            if(max<arr[i]) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자 출력
            } else if(arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
