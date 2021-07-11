

def findMaxNum(num):
   
    # Convert to equivalent
    # binary representation
    binaryNumber = bin(num)[2:]
 
    # Stores binary representation
    # of the maximized value
    maxBinaryNumber = ""
 
    # Store the count of 0's and 1's
    count0, count1 = 0, 0
 
    # Stores the total Number of Bits
    N = len(binaryNumber)
    for i in range(N):
 
        # If current bit is set
        if (binaryNumber[i] == '1'):
 
            # Increment Count1
            count1 += 1
        else:
 
            # Increment Count0
            count0 += 1
 
    # Shift all set bits to left
    # to maximize the value
    for i in range(count1):
        maxBinaryNumber += '1'
 
    # Shift all unset bits to right
    # to maximize the value
    for i in range(count0):
        maxBinaryNumber += '0'
 
    # Return the maximized value
    return int(maxBinaryNumber, 2)
 

if __name__ == '__main__':
     
    
    N = 11
 
    print(findMaxNum(N))