package Object_oriented_Programming;

import sun.applet.Main;

public class practice6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int math;
    int eng;

    public Student(String name, int ban, int no, int kor, int math, int eng){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public String info(){
        int sum = kor + math + eng;
        float avg = (float)sum/3;
        return name + "," + ban + "," + no + "," + kor +"," + math + "," + eng + "," + sum + "," + (Math.round(avg*10)/10.0);
    }

}
