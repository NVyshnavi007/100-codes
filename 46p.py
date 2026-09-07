num=int(input("enter a number:"))
c=1
while num>0:
    digit=num%10
    c+=1
    if (num//10)>26:
        num=num//10
    else:
        break
print(c)

