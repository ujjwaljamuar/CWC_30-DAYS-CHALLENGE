T = int(input())
if T >= 130 :
    print("Yes")
    exit()
num = []
num = list(map(int, input().split()))

for i in range(T) :
    for j in range(i + 1, T) :
        for k in range(j + 1, T) :
            for l in range(k + 1, T) :
                if num[i] ^ num[j] ^ num[k] ^ num[l] == 0 :
                    print("Yes")
                    exit()
print("No")