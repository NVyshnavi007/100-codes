arr1=list(map(int,input("enter numbers:").split()))
arr2=list(map(int,input("enter numbers:").split()))
arr1.sort()
arr2.sort()
product=0
maxi=float('-inf')
for i in range(len(arr1)):
    product+=arr1[i]*arr2[i]
    maxi=max(maxi,product)
print(product)
