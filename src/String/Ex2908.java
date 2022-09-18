package String;
import java.util.Scanner;

public class Ex2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str11="";
        String str22="";
        for(int i=2; i>=0; i--){
            str11 += str1.charAt(i);
        }

        for(int i=2; i>=0; i--){
            str22 += str2.charAt(i);
        }

        if((Integer.parseInt(str11) > Integer.parseInt(str22))){
            System.out.println(str11);
        }else{
            System.out.println(str22);
        }



    }
}
