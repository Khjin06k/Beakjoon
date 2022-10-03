package Math1;
import java.util.*;

public class Ex1193{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); //숫자를 입력받음
        //숫자의 순서를 알기 위한 코드
        int count = 0;
        int range = 1;
        //range와 count를 이용하여 반복을 통해 숫자의 위치를 알아냄.
        while(range<num){
            count++;
            range =range + count;
        }
        //count는 숫자가 존재하는 대각선의 n번째를 나타냄.
        //count가 홀수인지 짝수인지에 따라서 대각선의 위 아래가 변경되어야 함 (문제 다시 이해 필요)
        //range에서 count를 뺀 숫자가 해당 대각선의 첫번째 숫자를 의미함
        int first = range-count;
        int minus = num-count;
        minus = first-minus; // first 숫자로부터 얼만큼 떨어져있는지 파악 (분모 분자의 지표가 될 숫자)
        if(count%2 == 1){ //만약 짝수번째 대각선이라면
            int top = minus;
            int down = count-minus+1;
            System.out.println(top+"/"+down);
        } else{//만약 홀수번째 대각선이라면
            int top = count-minus+1;
            int down = minus;
            System.out.println(top+"/"+down);
        }

    }
}
