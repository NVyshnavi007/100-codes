arr1 = [11, 12, 13, 21, 30, 70]
arr2 = [11, 30, 70, 12]
count=0
for num in arr2:
    if num in arr1:
        count+=1
if count==len(arr2):
    print("they are subsets")
else:
    print("they are not subsets")