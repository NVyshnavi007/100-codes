arr=list(map(int,input("enter numbers:").split()))
maxi=0
for num in arr:
    temp=num
    a=str(num)
    if a==a[::-1]:
        maxi=max(maxi,len(a))
print(maxi if maxi!=0 else -1)


