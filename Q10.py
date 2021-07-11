# Write a program that has three numbers a, b, c where a < b < c and a^2 + b^2 = c^2.
# There exists only one solution where it satisfies the following equation for a+ b + c = 1000. Find the product abc.

def solve():

    triplet_sum = 1000
    min_a, max_a = 1, triplet_sum // 3
    for a in range(1, max_a):
        for b in range(a + 1, (triplet_sum - a) // 2):
            c = triplet_sum - a - b
            assert a < b < c, "constraint violated: {} < {} < {}".format(
                a, b, c)
            if a ** 2 + b ** 2 == c ** 2:
                return a * b * c


# printing the result
print(solve())
