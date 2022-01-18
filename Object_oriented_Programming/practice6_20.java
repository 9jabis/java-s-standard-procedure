package Object_oriented_Programming;

public class practice6_20 {
    static int max(int[] arr) {
        int tmp = 0;
        if (arr == null || arr.length == 0)
            return -99999;
        else
            for (int i = 0; i < arr.length; i++) {
                if (tmp < arr[i]) {
                    tmp = arr[i];
                }
            }
        return tmp;
    }

    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println(max(data));
        System.out.println(max(null));
        System.out.println(max(new int[] {}));
    }
}
