num=int(input("enter a number:"))
a=num*num
temp=a%10
if num==temp:
    print(num,"is automorphic number")
else:
    print(num,"is not an automorphic number")
