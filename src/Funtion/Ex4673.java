package Funtion;
//다시 생각해보기(알고리즘)
public class Ex4673 {
    public static int d(int num){ //각자리 숫자를 더하는 메서드 생성
        int sum = num;
        while(num !=0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        for(int i = 1; i<=10000; i++){
            int n = d(i); //메서드에 i를 넣은 것을 n에 저장
            if(n<=10000){ //함수 값이 1보다 작으면 배열에 true를 저장
                arr[n] = true;
            }
        }
        for(int i = 1; i<=10000; i++){//배열이 false가 있으면 해당 값 출력
            if(arr[i]==false) System.out.println(i);
        }
    }
}
