

def derivativeTerm(pTerm, val):

	# Get coefficient
	coeffStr = ""

	i = 0
	while (i < len(pTerm) and
		pTerm[i] != 'x'):
		coeffStr += (pTerm[i])
		i += 1
		
	coeff = int(coeffStr)

	# Get Power (Skip 2 characters
	# for x and ^)
	powStr = ""
	j = i + 2
	while j < len(pTerm):
		powStr += (pTerm[j])
		j += 1
	
	power = int(powStr)

	# For ax^n, we return
	# a(n-1)x^(n-1)
	return (coeff * power *
			pow(val, power - 1))

def derivativeVal(poly, val):

	ans = 0
	i = 0
	stSplit = poly.split("+")
	
	while (i < len(stSplit)):	
		ans = (ans +
			derivativeTerm(stSplit[i],
							val))
		i += 1

	return ans

if __name__ == "__main__":

	st = "4x^3 + 3x^1 + 2x^2"
	val = 2
	print(derivativeVal(st, val))

