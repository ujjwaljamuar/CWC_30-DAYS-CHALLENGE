# Calculate the total fare of your ride in taxi. The taxi has a base fee of P40.00 for the first 250 meters.
#  An additional P2.50 is added for every succeeding 200 meters. Compute and print the total fare that you would need to pay.

a=int(input('Enter the distance : '))
if(a<=250):
    print('Fare is P40.00')
else:
    n=(a-250)/200
    fare = (n*2.50)+40
    print('Fare is ',fare)