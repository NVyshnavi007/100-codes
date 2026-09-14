def hcf(a,b):
    if b==0:
        return a
    else:
        return hcf(b,a%b)
a=int(input("enter first number:"))
b=int(input("enter other number:"))
print(hcf(a,b))