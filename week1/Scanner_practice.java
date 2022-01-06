package week1;
import java.util.Scanner;
public class Scanner_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자를 입력하세요");
        String str = sc.nextLine();
        int num = Integer.parseInt(str);
        System.out.println("입력내용"+str);
        System.out.println("num"+num);




    }
}
