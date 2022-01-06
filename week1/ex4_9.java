package week1;

public class ex4_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum =0;

        for(int i=0; i<5; i++){
            int c = num % 10;
            sum=sum+c;
            num=num/10;
        }
        System.out.println(sum);
    }
}
