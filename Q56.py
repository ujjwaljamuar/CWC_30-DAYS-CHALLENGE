# Write a program to display whether a number is magic number or not. A magic number is a number whose sum of the digits when added gives result 1.

def isMagic(n):
    sum = 0

    # Note that the loop
    # continues if n is 0
    # and sum is non-zero.
    # It stops when n becomes
    # 0 and sum becomes single
    # digit.
    while (n > 0 or sum > 9):
        if (n == 0):
            n = sum
            sum = 0
        sum = sum + n % 10
        n = int(n / 10)

    # Return true if
    # sum becomes 1.
    return True if (sum == 1) else False



n = 1234
if (isMagic(n)):
    print("Magic Number")
else:
    print("Not a magic Number")
