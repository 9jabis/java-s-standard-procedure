package week2.array;

public class ex5_3 {
    public static void main(String[] args) {
        int[] score = new int[]{1,2,3,4,5};

        int max = score[0];
        int min = score[0];

        for(int i=1; i<score.length; i++){
            if(max < score[i]){
                max = score[i];
            } else if(min < score[i]){
                min = score[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
