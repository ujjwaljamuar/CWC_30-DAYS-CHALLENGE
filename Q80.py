# Given two numbers m and n , you are required to check whether they are anagram of each other or not in binary representation?

SIZE = 8
def bit_anagram_check(a, b):
 
    # Find reverse binary representation of a
    # and store it in binary_a[]
    global size
 
    i = 0
    binary_a = [0] * SIZE
    while (a > 0):
        binary_a[i] = a % 2
        a //= 2
        i += 1
 
    # Find reverse binary representation of b
    # and store it in binary_a[]
    j = 0
    binary_b = [0] * SIZE
    while (b > 0):
        binary_b[j] = b % 2
        b //= 2
        j += 1
 
    # Sort two binary representations
    binary_a.sort()
    binary_b.sort()
 
    # Compare two sorted binary representations
    for i in range(SIZE):
        if (binary_a[i] != binary_b[i]):
            return 0
    return 1
 
if __name__ == "__main__":
 
    a = 8
    b = 4
    print(bit_anagram_check(a, b))