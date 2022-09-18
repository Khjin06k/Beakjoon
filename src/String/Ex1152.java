package String;
import java.util.*;

//StringTokenizer은 분리 기준을 지정하여 해당 기준으로 나뉘어 토큰에 저장해 주는 것
//사용시 import로 선언해 주어야 하며, 공백에 대한 예외처리를 해주지 않아도 됨
//split을 사용할 경우 공백에 대한 예외처리, 빈 문자열에 대한 예외처리가 필요함
public class Ex1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str," ");
        System.out.println(st.countTokens());
    }
}
