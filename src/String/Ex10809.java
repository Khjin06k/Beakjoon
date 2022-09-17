package String;
import java.util.Scanner;

public class Ex10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int[] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = -1;
        }
        String str = "abcdefghijklmnopqrstuvwxyz";
        for(int i=s.length()-1; i>=0; i--) {
            for(int j=0; j<str.length(); j++) {
                if (s.charAt(i) == str.charAt(j)) arr[j]=i;
            }
        }
        for(int i=0; i<26; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
