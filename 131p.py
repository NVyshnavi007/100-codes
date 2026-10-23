arr1=[1,3,4,5,8]
arr2=[2,6,7,9]
arr1.sort()
arr2.sort()
for i in range(max(len(arr1),len(arr2))):
    while len(arr1) and len(arr2):
        if arr1[i]>arr2[i]:
            arr1.insert(arr2[i],i)
            arr2.pop(arr2[i])
        else:
            arr1.insert(arr2[i],i+1)
if arr2:
    arr1.append(arr2.pop())
print(arr1)