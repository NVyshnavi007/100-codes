A1=[20,1,20,5,7,1,9,39,6,18,18]
A2=[20,1,18,39]
lst=[]
for num in A2:
        while num in A1:
            lst.append(num)
            A1.remove(num)
while A1:
    lst.append(A1.pop(0))
print(lst)
