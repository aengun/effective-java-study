package study.객체;

public class AAA {
    int a;
    int b;

    AAA(){
        this.a = 10;
        this.b = 20;
    }

    public static void main(String[] args) {
        AAA aaa = new AAA();
        System.out.println(aaa.a);
        System.out.println(aaa.b);
        Object o;
        System.out.println(aaa.toString());
        System.out.println(aaa.hashCode());
    }

}