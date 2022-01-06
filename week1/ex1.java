package week1;

public class ex1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int temp;
        int temp2;
        temp = x;
        x = y;
        temp2 = z;
        y = z;
        z = temp;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
