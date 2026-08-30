n1=int(input("enter a number:"))
n2=int(input("enter another number:"))
hcf=1
for i in range(1,min(n1,n2)):
    if n1%i==0 and n2%i==0:
        hcf=i
print("hcf of two numbers are:",hcf)
