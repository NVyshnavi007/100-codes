#min scalar product
arr1=list(map(int,input("enter numbers:").split()))
arr2=list(map(int,input("enter numbers:").split()))
arr1.sort()
arr2.sort()
product=0
for i in range(len(arr1)):
    product+=arr1[i]*arr2[i]
print(product)
