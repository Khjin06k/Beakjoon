package String;
import java.util.Scanner;

public class Ex5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int sum = 0;
        int[] arr = new int[str.length()];
        for(int i = 0; i<str.length(); i++){
            switch(str.charAt(i)){
                case 'A': case 'B': case 'C':
                    arr[i] = 3;
                    break;
                case 'D': case 'E': case 'F':
                    arr[i] = 4;
                    break;
                case 'G': case 'H': case 'I':
                    arr[i] = 5;
                    break;
                case 'J': case 'K': case 'L':
                    arr[i] = 6;
                    break;
                case 'M': case 'N': case 'O':
                    arr[i] = 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    arr[i] = 8;
                    break;
                case 'T': case 'U': case 'V':
                    arr[i] = 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    arr[i] = 10;
                    break;
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
