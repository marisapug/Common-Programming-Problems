# FizzBuzz.py
# Marisa Pugliese
# Here is my solution to FizzBuzz writen in Python

# Instructions to compile and run in the command line
# Be sure cd into this directory
# python FizzBuzz.py

def fizz_buzz(max, fizz, buzz):
    for i in range(max):
        if i%(fizz*buzz) == 0:
            print("FizzBuzz")
        elif i%fizz == 0:
            print("Fizz")
        elif i%buzz == 0:
            print("Buzz")
        else:
            print(i)

def main():
    max = 30
    fizz_buzz(max, 3, 5)

main()
