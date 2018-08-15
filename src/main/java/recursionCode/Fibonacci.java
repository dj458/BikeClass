package recursionCode;

public class Fibonacci {

    public  int fib(int i){
        if (i<=1){
            return i;
        }
        else
            return fib(i-1)+fib(i-2);
    }

    public static void main(String[] args){
        Fibonacci fibonacci=new Fibonacci();
        int k=fibonacci.fib(9);
        System.out.println(k);
    }

}
