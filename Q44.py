# WAP to check if the binary representation of a number is palindrome.

n = int(input('Enter : '))
def decimalToBinary(n):
    return bin(n).replace("0b", "")
   
if __name__ == '__main__':
    if((decimalToBinary(n)==decimalToBinary(n)[::-1])):
        print('Palindrome')
    else:
        print('Not a palindrome')
    

