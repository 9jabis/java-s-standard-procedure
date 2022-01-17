package Object_oriented_Programming;
class Data{int x;}
public class ex6_5 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);

        change(d.x);
        System.out.println(d.x);
    }

    static void change(int x){
        x = 1000;
        System.out.println(x);
    }
}


