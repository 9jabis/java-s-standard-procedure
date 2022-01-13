package week2.array;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int sum=0;
        float average=0;

        int[] score = new int[] {100,90,80,70,60};

        for(int i=0; i< score.length; i++){
            sum+=score[i];
        }
        average = sum/ (float)score.length;

        System.out.println(sum);
        System.out.println(average);
    }
}
