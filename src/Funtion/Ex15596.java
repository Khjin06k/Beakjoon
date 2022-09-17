package Funtion;

public class Ex15596 {
    public static void main(String[] args) {
        Test test = new Test();
        int[] a = {1,2,3,4}; //임의로 지정
        System.out.println(test.sum(a));
    }
}

class Test{
    long sum(int[] a){
        long sum = 0;

        for(int i = 0; i<a.length; i++){
            sum +=a[i];
        }
        return sum;
    }
}
