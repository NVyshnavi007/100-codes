import math
n1=int(input("enter a number"))
d1=int(input("enter a number"))
n2=int(input("enter a number"))
d2=int(input("enter a number"))
denominator=d1*d2
numerator=(n1*d2)+(n2*d1)
gcd=math.gcd(numerator,denominator)
numerator//=gcd
denominator//=gcd
print("the sum of the fractions is",numerator,"/",denominator)
