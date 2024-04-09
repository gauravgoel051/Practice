package Scaler;

public class MO {

    static int add(int a, int b) {
        System.out.println("add1 ");
        return a + b;
    }

    static String add(String a, String b) {
        System.out.println("add2 ");
        return a + b;
    }

    static int add(int a,int b,int c){
        System.out.println("add 3");
        return a+b+c;
    }
//    static String add(int a,int b){
//        System.out.println("may generate error");
//        return a+b+"";
//    }


    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add("10","20"));
        System.out.println(add(10,20,30));

    }
}