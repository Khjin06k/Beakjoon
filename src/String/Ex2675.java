package String;
import java.util.Scanner;

public class Ex2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] n = new int[num];
        String[] s = new String[num];
        for (int t = 0; t < num; t++) {
            n[t] = sc.nextInt();
            s[t] = sc.next();
        }
        for(int t= 0; t<num; t++){
            for (int i = 0; i < s[t].length(); i++) {
                for (int j = 0; j < n[t]; j++) {
                    System.out.print(s[t].charAt(i));
                }
            }
            System.out.println("");
        }
    }
}
