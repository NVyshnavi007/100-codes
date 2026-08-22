'''num=input("enter a number:")
if num==num[::-1]:
    print(num,"is a palindrome")
else:
    print("it is not a palindrome ")'''

num=int(input("enter a number:"))
temp=num
reverse=0
while num>0:
    digit=num%10
    reverse=reverse*10+digit
    num=num//10
if temp==reverse:
    print(temp,"is a palindrome")
else:
    print(temp,"is not a palindrome")
