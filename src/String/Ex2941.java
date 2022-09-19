package String;
import java.util.Scanner;

public class Ex2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); //알파벳 입력받기
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(i == str.length()-1) {//대부분 i+1과 비교하는 것이 많기에 i가 마지막일 경우 1개 단어이기에 count만 하고 넘어감
                count++;
                break;
            }else {
                switch (str.charAt(i)) {
                    case 'c': // c=, c-
                    case 's': // s=
                        if (str.charAt(i + 1) == '=') i++;
                        else if (str.charAt(i + 1) == '-') i++;
                        count++;
                        break;
                    case 'l': //lj
                    case 'n': //nj
                        if (str.charAt(i + 1) == 'j') i++;
                        count++;
                        break;
                    case 'z': //z=
                        if(str.charAt(i+1)=='=') i++;
                        count++;
                        break;
                    case 'd': //d-, dz= 문제 해결 필요
                        count++;
                        if (str.charAt(i + 1) == '-') {
                            i++;
                            break;
                        } else if(str.charAt(i+1)=='z') {
                            if (i < str.length() - 2) {
                                if (str.charAt(i + 2) == '=') {
                                    i += 2;
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        count++;
                        break;
                }
            }
        }
        System.out.println(count);

    }
}
