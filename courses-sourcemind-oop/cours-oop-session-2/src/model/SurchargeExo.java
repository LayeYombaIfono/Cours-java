package model;

public class SurchargeExo {
    public static int overload(int a, int b){
        return a + b;
    }
    public static double overload(double a, int b){
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println(overload(10, 14));
        System.out.println(overload(140.2, 24));
    }
}
