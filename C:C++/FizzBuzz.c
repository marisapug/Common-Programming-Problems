// Marisa Pugliese
// Solution to FizzBuzz in C

// Instructions to compile (using gcc compiler) and run in the command line:
// Be sure to cd into this directory
// gcc -o fizzbuzz fizzbuzz.c
// ./fizzbuzz

#include <stdio.h>
#include <stdlib.h>

void fizzbuzz(int max, int fizz, int buzz){
    for (int i = 0; i <= max; i++){
        char* f = "Fizz";
        char* b = "Buzz";
        int flag = 0;
        if (i%(fizz*buzz) == 0){
            printf("%s%s", f, b);
            printf("\n");
            flag = 1;
        }
        else if (i%fizz == 0){
            printf("%s", f);
            printf("\n");
            flag = 1;
        }
        else if (i%buzz == 0){
            printf("%s", b);
            printf("\n");
            flag = 1;
        }
        if (flag == 0){
            printf("%d", i);
            printf("\n");
        }
    }
}

int main(){
    // Feel free to change max, the upper bound on the sequence.
    int max = 50;
    fizzbuzz(max, 3, 5);
    return 0;
}
