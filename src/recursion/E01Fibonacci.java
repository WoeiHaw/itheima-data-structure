package recursion;

import org.springframework.cache.Cache;

import java.lang.reflect.Array;
import java.util.Arrays;

public class E01Fibonacci {

    // Memorization

    public static int fibonacci(int n){
        int[] cache = new int[n+1];
        Arrays.fill(cache,-1);
        cache[0] = 0;
        cache[1] = 1;
        return f(n,cache);
    }

    public static int f(int n,int[] cache){

        if(cache[n] !=-1){
            return cache[n];
        }

        int x = f(n-1, cache);
        int y = f(n-2,cache);
        cache[n] = x+y;
        return cache[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(11));
        System.out.println(fibonacci(12));
        System.out.println(fibonacci(13));



    }
}
