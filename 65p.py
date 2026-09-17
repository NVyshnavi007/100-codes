def fact(n):
    if n==0:
        return 1
    return n*fact(n-1)
n=int(input("enter a number:"))
factorial=fact(n)
while factorial%10==0:
    factorial//=10
print(factorial%10)