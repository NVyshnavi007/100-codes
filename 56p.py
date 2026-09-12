def if_Prime(n,i=2):
    if n==i:
        return True
    elif n%i==0:
        return False
    return if_Prime(n,i+1)
n=int(input("Enter a number: "))
if if_Prime(n):
    print(n,"is a prime number")
else:
    print(n,"is not a prime number")
