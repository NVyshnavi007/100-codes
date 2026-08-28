num=int(input("enter a number:"))
temp=num
sum=0
while temp>0:
    digit=temp%10
    sum+=digit
    temp//=10

if num%sum==0:
    print("it is harshad number")
else:
    print("it is not a harshad number")
