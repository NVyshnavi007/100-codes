arr=[100,2,70,12,90]
a=sorted(arr)
for i in range(len(arr)):
    print(a.index(arr[i]) + 1, end=" ")