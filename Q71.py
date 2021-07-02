# Given an integer N, the task is to generate a matrix of dimensions N x N using positive integers from the range [1, N]
#  such that the sum of the secondary diagonal is a prefect square

def diagonalSumPerfectSquare(arr, N):
   
    # Print the current row
    print(*arr, sep =" ")
     
    # Iterate for next N - 1 rows
    for i in range(N-1):
        
        # Perform left shift by 1
        arr = arr[i::] + arr[:i:]
         
        # Print the current row after
        # the left shift
        print(*arr, sep =" ")
 

N = 7
 
arr = []
 
# Fill the array with elements
# ranging from 1 to N
for i in range(1, N + 1):
    arr.append(i)
 

diagonalSumPerfectSquare(arr, N)