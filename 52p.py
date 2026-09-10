num=int(input("enter a number:"))
n=int(input("enter a number:"))
occur=0
while num>0:
    digit=num%10
    if digit==n:
        occur+=1
    num=num//10
print(occur)