package week1;
import java.util.Scanner;
public class ex4_10 {
    public static void main(String[] args) {
        int anwer = (int)(Math.random()*100)+1;
        int input = 0;
        int count  = 0;

        Scanner in = new Scanner(System.in);

        do{
            count++;
            System.out.println("1과 100사이의 값을 입력하세요 : ");
            input = in.nextInt();

            if(input > anwer){
                System.out.println("더 작은 수를 입력하세요");
            }
            if(input < anwer){
                System.out.println("더 큰 수를 입력하세요");
            }
            if(input == anwer){
                System.out.println("맞혔습니다.");
                System.out.println("시도한 횟수는 "+count+"번 입니다.");
                break;
            }
        } while(true);
    }
}
