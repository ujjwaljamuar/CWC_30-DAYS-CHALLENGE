# i=1
# print((bin(i).replace("0b", "")) == (bin(i).replace("0b", "")[::-1]))


sum = 0

for i in range(1000):
    if(bin(i).replace("0b", "")) == (bin(i).replace("0b", "")[::-1]) and (i == i[::-1]):
        sum += i
        