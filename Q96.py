# Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.

i=1000
x=1
y=0
n=10000000000
while i>=1:
    j=1
    x=1
    while j<=i:
        x=x*i
        y+=(x%n)
        j+=1
    i-=1
print(y%n)