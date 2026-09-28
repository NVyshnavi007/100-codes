nums=list(map(int,input("enter numbers:").split()))
odd=0
even=0
for num in nums:
    if num%2==0:
        even+=1
    else:
        odd+=1
print(even)
print(odd)