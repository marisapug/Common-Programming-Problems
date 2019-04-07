# Permutation.py
# Marisa Pugliese

# Instructions to compile and run in the command line
# cd into this directory
# python Permutation.py

# Creates a dictionary
# Key: each letter found in the string
# Value: the number of occurrences
def get_letter_count(str):
    dict = {}
    for c in str:
        if (c in dict):
            dict[c] += 1
        else:
            dict[c] = 1
    return dict

# Takes two strings as parameters
# Checks if they are permutations (rearrangements of the same letters)
def check_permutation(str1, str2):
    len1 = len(str1)
    len2 = len(str2)
    if (len1 != len2):
        return False
    dict1 = get_letter_count(str1)
    dict2 = get_letter_count(str2)
    if (dict1 == dict2):
        return True
    else:
        return False

def main():
    print(check_permutation("Hello", "olleH")) #Should return true
    print(check_permutation("Hi", "Hello")) #Should return false
    print(check_permutation("Marisa", "Gabrie")) #Should return false

main()

