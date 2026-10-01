#sum of min absolute value
arr = [2, 5, 4, 3]
arr.sort()#[2,3,4,5]
n=len(arr)#4
summ=0
summ+=abs(arr[0]-arr[1])
summ+=abs(arr[n-1]-arr[n-2])#5-4=1
for i in range(1,n-1):
    summ+=min(abs(arr[i]-arr[i-1]),abs(arr[i]-arr[i+1]))
print(summ)