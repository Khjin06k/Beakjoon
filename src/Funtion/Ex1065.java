package Funtion;

import java.util.Scanner;

public class Ex1065 {
    public static int d(int num){
        int count = 0;
        if(num<100) return num;
        else {
            count = 99;
            for(int i=100; i<=num; i++){
                int h = i/100;
                int t = (i/10)%10;
                int o = i%10;
                if((h-t) == (t-o)) count++;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int han = sc.nextInt();
        System.out.println(d(han));
    }
}
