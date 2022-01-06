package week1;

public class ex4_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            int c = str.charAt(i)-'0';
            sum=sum+c;
        }
        System.out.println("sum=" + sum);
    }
}
