// Fibonacci.java
// Marisa Pugliese
// Here, I offer two methods that generate the Fibonacci sequence.
// I included the time complexities as well as a timing experiment in the main function.
// It is important to note that fib_slow is static where fib_mem is not. fib_mem requires an instance of the Fibonacci data structure.

// Instructions on compiling and running:
// Be sure to cd into this directory
// javac Fibonacci.java
// java Fibonacci

import java.util.*;

public class Fibonacci {
    public HashMap<Integer, Integer> mem = new HashMap<Integer, Integer>();
    
    // Time complexity is O(2^n)
    // Recursive
    public static int fib_slow(int n){
        if (n <= 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            return fib_slow(n-1) + fib_slow(n-2);
        }
    }

    // Here is the memoizated/dynamic version of fib_slow
    // Time complexity is O(n)
    public int fib_mem(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (this.mem.containsKey(n)){
            return this.mem.get(n);
        }
        int result = fib_mem(n-1) + fib_mem(n-2);
        this.mem.put(n, result);
        return result;
    }
    
    public static void main(String[] args){
        long start_slow = System.currentTimeMillis();
        // Feel free to change max, the upper bound of the loop for testing purposes
        int max = 35;
        for (int i = 0; i < max; i++){
            System.out.println(fib_slow(i));
        }
        long end_slow = System.currentTimeMillis();
        long total_slow = end_slow - start_slow;
        System.out.println("Slow Fibonacci took " + total_slow + " milliseconds");
        long start_fast = System.currentTimeMillis();
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < max; i++){
            System.out.println(f.fib_mem(i));
        }
        long end_fast = System.currentTimeMillis();
        long total_fast = end_fast - start_fast;
        System.out.println("Memoizated Fibonacci took " + total_fast + " milliseconds");
        double percent_of_slow = ((total_fast * 1.0)/(total_slow * 1.0) * 100) % 10;
        double rounded = (percent_of_slow * 100)/100;
        System.out.println("The fast version only took " + rounded + "% of the time the slow version took.");
    }
}
