# Write a program to generate random integers in a specific range.

import random
  
def Random(start, end, num):
    res = []
  
    for i in range(num):
        res.append(random.randint(start, end))
  
    return res
  
num = 50
start = 20
end = 100
print(Random(start, end, num))