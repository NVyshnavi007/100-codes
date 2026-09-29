arr=list(map(int,input("enter numbers:").split()))
res=arr[0]
for i in range(len(arr)):
    mul=arr[i]
    for j in range(i+1,len(arr)):
        res=max(res,mul)
        mul*=arr[j]
    res=max(res,mul)
print(res)