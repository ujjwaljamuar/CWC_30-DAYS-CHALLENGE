

def solve():
    n = int(input())
    arr = list(map(int, input().split()))
    
    freq = {}
    acc = 0
    l, r = -1, -1
    
    for i in range(n):
        acc += arr[i]
        acc %= n

        if acc == 0:
            l, r = 1, i+1
            break
        elif acc in freq:
            l, r = freq[acc]+1, i+1
            break

        freq[acc] = i+1
    
    print(r-l+1)
    for i in range(l, r+1): print(i, end=' ')
    print()


for t in range(int(input())): solve()