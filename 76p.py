arr=list(map(int,input("enter numbers:").split()))
l=0
r=len(arr)-1
while l<=r:
    arr[l],arr[r]=arr[r],arr[l]
    l+=1
    r-=1
print(arr)