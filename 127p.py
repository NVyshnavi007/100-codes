arr=[1,3,6,-2,9]
maxi=arr[0]
for i in range(len(arr)):
    for j in range(i+1,len(arr)):
        res=arr[i]+arr[j]
        maxi=max(maxi,res)
print(maxi)

    