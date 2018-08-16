package fibonacciCode;

public class FibonacciRecursion {

    public  int fib(int i){
        if (i<=1){
            return i;
        }
        else
            return fib(i-1)+fib(i-2);
    }

    public static void main(String[] args){
        FibonacciRecursion fibonacciRecursion =new FibonacciRecursion();
        int k= fibonacciRecursion.fib(9);
        System.out.println(k);
    }

}
