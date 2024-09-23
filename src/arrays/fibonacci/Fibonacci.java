package arrays.fibonacci;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(100);
    }

    public static void fibonacci(int n) {
        if (n <= 1)
            return ;

        //n+1 so that we can accommodate o to n
        BigInteger[] arr= new BigInteger[n+1];

        arr[0]=BigInteger.ZERO;
        arr[1]=BigInteger.ONE;

        for(int i=2;i<=n;i++){
             arr[i]=arr[i-1].add(arr[i-2]);
        }
        for(int i=0;i<=n;i++){
            System.out.print(" "+arr[i]);
        }
        //return arr[n];
    }
}
