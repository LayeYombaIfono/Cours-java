public class Algorithms {

    public static int fibonacciFunction(int n){

       if (n == 1 || n == 0)
           return n;


       return fibonacciFunction(n-2) + fibonacciFunction(n-1);
    }


    public static void main(String[] args) {

       int result = fibonacciFunction(10);

        System.out.println("Le nombre est : " + result);
    }
}
