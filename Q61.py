# Write a program to display square root of a N numbers using newton’s method.

def squareRoot(n, l) :
 
    # Assuming the sqrt of n as n only
    x = n
 
    # To count the number of iterations
    count = 0
 
    while (1) :
        count += 1
 
        # Calculate more closed x
        root = 0.5 * (x + (n / x))
 
        # Check for closeness
        if (abs(root - x) < l) :
            break
 
        # Update root
        x = root
 
    return root
 
# Driver code
if __name__ == "__main__" :
 
    n = 327
    l = 0.00001
 
    print(squareRoot(n, l))