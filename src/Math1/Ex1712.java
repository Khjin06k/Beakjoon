package Math1;
import java.util.Scanner;

public class Ex1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long i = 0;
        long result = 0;
        if(b>=c) result = -1;
        else {
            while(a+b*i >= c*i) {
                i++;
            }
            result = i;
        }
        System.out.println(result);
    }
}
