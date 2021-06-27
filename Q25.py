# Write a program to toggle a paritucular bit using bitwise operators.

def toggleKthBit(n, k):
    return (n ^ (1 << (k-1)))
     

n = 5
k = 1
print( toggleKthBit(n , k))
 