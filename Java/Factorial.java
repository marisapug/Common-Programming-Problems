import java.util.*;

public class Factorial {
    
    // Java program computes a factorial
    
    // 5! = 5*4*3*2*1 = 120
    // 0!
    // -1! = Throws Exception

    public static int factorial(int x) throws IllegalArgumentException{
        if (x < 0){
            throw new IllegalArgumentException(x + " is a negative value, which is not an acceptable argument.");
        }
        else {
            int result = 1;
            for (int i = x; i > 0; i--){
                result = result * i;
            }
            return result;
        }
    }
    
    public static void printFactorial(int x){
        System.out.println("Factorial of " + x + " is " + factorial(x));
    }
    
    public static void main(String[] args){
        // Feel free to create new examples!
        printFactorial(5);
        printFactorial(0);
        // Uncomment to see what happens when you give a negative int as an argument!
        // printFactorial(-1);
    }
    
    
}
