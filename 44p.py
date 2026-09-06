n=int(input("enter a number:"))
temp=""
while n>0:
    digit=n%10
    if digit==0:
        digit=1
        temp+=str(digit)
    else:
        temp+=str(digit)
    n=n//10
print("The number after replacing 0 with 1 is:",temp[::-1])
