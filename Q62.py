# Write a program to take N numbers as input. Then display only prime - palindromes using method overloading concept.

def oneDigit(num):
    return (num >= 0 and num < 10)


def isPalUtil(num, dupNum):

    
    if (oneDigit(num)):
        return (num == (dupNum) % 10)

   
    if (not isPalUtil(int(num / 10), dupNum)):
        return False

    
    dupNum = int(dupNum/10)

    
    return (num % 10 == (dupNum) % 10)




def isPal(num):

    # If num is negative, make it positive
    if (num < 0):
        num = -num

    
    dupNum = num  # dupNum = num

    return isPalUtil(num, dupNum)

# Function to generate all primes and checking
# whether number is palindromic or not


def printPalPrimesLessThanN(n):

    
    prime = [True] * (n + 1)
    p = 2
    while (p * p <= n):

        # If prime[p] is not changed,
        # then it is a prime
        if (prime[p]):

            # Update all multiples of p
            for i in range(p * 2, n + 1, p):
                prime[i] = False
        p += 1

    # Print all palindromic prime numbers
    for p in range(2, n + 1):

        # checking whether the given number
        # is prime palindromic or not
        if (prime[p] and isPal(p)):
            print(p, end=" ")


# Driver Code
n = 100
print("Palindromic primes smaller",
      "than or equal to", n, "are :")
printPalPrimesLessThanN(n)
