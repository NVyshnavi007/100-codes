arr=list(map(int,input("enter numbers:").split()))
seen=[]
c=0
for i in range(len(arr)):
    if arr[i] not in seen:
        seen.append(arr[i])
        c+=1
    else:
        continue
print(c)
    
