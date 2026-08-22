num=int(input("enter a number: "))
n=len(str(num))
while(num>0):
    sum=0
    temp=num
    while(temp>0):
        digit=temp%10
        sum=sum+digit**n
        temp=temp//10
    if(num==sum):
        print(num,"is an armstrong number")
        break
    else:
        print(num,"is not an armstrong number")
        break
        
