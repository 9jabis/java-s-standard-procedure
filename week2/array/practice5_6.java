package week2.array;

import java.util.Scanner;

public class practice5_6 {
    public static void main(String[] args) {
        String[] words = {"tv", "com", "mouse", "phone"};

        Scanner in = new Scanner(System.in);

        for(int i=0; i< words.length; i++){
            char[] question = words[i].toCharArray();
            //

            System.out.printf("Q%d. %s의 정답을 입력하세요.> ", i+1, new String(question));

            String answer = in.nextLine();

            if(words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");
        }
    }
}
