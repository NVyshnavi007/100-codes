num=int(input("enter a number:"))
temp=num
strong=0
while num>0:
    digit=temp%10
    fact=1
    while digit>0:
        fact=fact*digit
        digit=digit-1
    strong=strong+fact
    temp=temp//10

if strong==num:
    print("strong number")
else:
    print("not a strong number")
    