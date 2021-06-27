# Maya celebrated her birthday party. After the completion of cake cutting ceremony,
# Maya’s mom cuts the cake into various pieces inorder to distribute it to all her friends.
# Given an integer n denoting the number of cuts that can be made on a birthday cake.
# Write a code to find the maximum number of pieces that can be formed by making n cuts.


def findMaximumPieces(n):
    b=int(1 + n * (n + 1) / 2)
    print(b,'pieces can be formed by making', n ,'cuts')
    return b
 
# Driver code
a=int(input('Enter the number of cuts : '))
findMaximumPieces(a)