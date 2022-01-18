package Object_oriented_Programming;

public class practice6_21 {
    public static int abs(int value){
        if(value > 0){
            value = value;
        } else{
            value =  -1 * value;
        }
        return value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(abs(value));
        value = -10;
        System.out.println(abs(value));
    }
}
